package service;

import java.text.SimpleDateFormat;
import java.util.Date;

//import javax.persistence.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import model.*;

@Path("transaction")
@Produces(MediaType.APPLICATION_JSON)
// @Consumes(MediaType.APPLICATION_JSON)
public class TransactionService {
	
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public String createTransaction(
            Long buyer_account_id, 
            Long seller_account_id, 
            Float value
    ) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String data = formato.format(new Date());
		
		Transaction transaction = new Transaction(null, null, null, null);
		transaction.createTransaction(buyer_account_id, seller_account_id, value, data);

		return "Transacao feita com sucesso!";
	}
}
