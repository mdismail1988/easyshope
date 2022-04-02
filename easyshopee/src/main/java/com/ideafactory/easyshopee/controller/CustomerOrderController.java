package com.ideafactory.easyshopee.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ideafactory.easyshopee.error.CustomErrorType;
import com.ideafactory.easyshopee.model.Customer;
import com.ideafactory.easyshopee.model.Item;
import com.ideafactory.easyshopee.model.Orders;

@RestController
@RequestMapping("customerService/api/v1")
public class CustomerOrderController {
	
	/*public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {
		output.write(getOrders("ez4op0zu0e"));
		
	}*/
	
	/*public String handleRequest(APIGatewayProxyRequestEvent req, Context context) {
        context.getLogger().log("Input: ");
        return (getOrders("ez4op0zu0e")).toString();
    }*/
	
	@RequestMapping(value = "/orders/{customerId}", method = RequestMethod.GET)
	 public ResponseEntity<List<Orders>> getOrders(@PathVariable String customerId) {
		 //Testing.. needs to be update after DB implementation
		 String customerId1 = "ez4op0zu0e";
		 String customerId2 = "vju9ewof65";
		 //customerId=customerId1;
		 
		 if (customerId == null || customerId.equals("")) {
	            return new ResponseEntity(new CustomErrorType("customerId missing. Bad Request"), HttpStatus.BAD_REQUEST);
	     }else if(customerId.equals(customerId1) || customerId.equals(customerId2) ) {
	    	 List<Orders> ordersList = new ArrayList<Orders>();
	    	 if(customerId.equals(customerId1)) {
	    		 Item item11 = new Item("65dssd564", "Ponni Rice", 50.00, 10);
	    		 Item item12 = new Item("84dsds8sd", "crystal Salt", 15.00, 2);
	    		 List<Item> items1 = new ArrayList<Item>();
	    		 items1.add(item11);
	    		 
	    		 List<Item> items2 = new ArrayList<Item>();
	    		 items2.add(item12);
	    		 
	    		 Orders order1 = new Orders("ez4op0zu0e", "564dfdfdf", "554dfddf", "dispatched", new Date("02/11/2022"), items1);
	    				 
	    		 Orders order2 = new Orders("ez4op0zu0e", "7dfkljl88", "65dfdfdf", "processing", new Date("02/12/2022"), items2);
	    		 
	    		 ordersList.add(order1);
	    		 ordersList.add(order2);
	    	 }else if(customerId.equals(customerId2)) {
	    		 Item item11 = new Item("54sdd54ds", "Fish", 500.00, 2);
	    		 Item item12 = new Item("85sdsdsd5", "Chieken", 200, 3);
	    		 List<Item> items1 = new ArrayList<Item>();
	    		 items1.add(item11);
	    		 
	    		 List<Item> items2 = new ArrayList<Item>();
	    		 items2.add(item12);
	    		 Orders order1 = new Orders("vju9ewof65", "564dfdfdf", "434dfddf", "cancelled", new Date("02/11/2022"), items1);
				 
	    		 Orders order2 = new Orders("vju9ewof65", "7dfkljl88", "655dfdfdf", "processing", new Date("02/12/2022"), items2);
	    		 
	    		 ordersList.add(order1);
	    		 ordersList.add(order2);
	    	 }
	    	 
	    	 return new ResponseEntity<List<Orders>>(ordersList, HttpStatus.OK); 
	     }else {
	    	 return new ResponseEntity(new CustomErrorType("customerId not found"), HttpStatus.NOT_FOUND);
	     }
		 
		 
	}
	
	@PostMapping("/customer/add")  
	private Customer saveCustomer(@RequestBody Customer customer)   
	{  
		UUID uuid=UUID.randomUUID();
		customer.setCustomerId(uuid.toString());
		customer.setRegistarionDate(new Date());
		return customer;
	}

	

}
