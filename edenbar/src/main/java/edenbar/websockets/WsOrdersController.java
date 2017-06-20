package edenbar.websockets;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.google.gson.Gson;

import edenbar.models.Orders;
import edenbar.models.WsRcvOrder;
import edenbar.models.WsSndOrder;
//import edenbar.repositories.OrderRepository;
import edenbar.controllers.OrdersController;
@Controller
//@EnableScheduling
public class WsOrdersController {
	@Autowired
	OrdersController orderController;
	@MessageMapping("/pedir") // /hello
    @SendTo("/ordermessage/marchando") // /topic/greetings
    public String wsorder(WsRcvOrder message) throws Exception {
		System.out.println("WsRcvOrder---> "+ message);
        //Thread.sleep(1000); // simulated delay
		 Orders so = orderController.findByIdorder(message.getro());
		 
		 System.out.println("orderController.findByIdorder(message.getro());"+message.getro());
		 System.out.println("so:  "+so.getidorder()+" "+so.getiddrink());
		 Gson gson = new Gson();
		 String json = gson.toJson(so);
		 System.out.println("json: "+ json);
         WsSndOrder mensaje = new  WsSndOrder(json);
         System.out.println("mensaje: "+mensaje);
        return json;
    }
	
	
	
/** The data storage. 

@Autowired
OrderRepository orderRepository;
@Autowired
private SimpMessagingTemplate template;
/** Web socket message template 
@Autowired
private SimpMessagingTemplate template;
 
/**
* Get order info for a given order id  idorder.
*
* @param id
*            
* @return The order info
*/
/*La primera indica que la URL a la que hay que invocar para enviar el mensaje al web socket es “/kitchen”.
 *  Entonces el JSON enviado se parseará automaticamente al DTO que es el argumento del método,
 *   como en un servicio web o un método de Spring MVC.
@MessageMapping("/kitchen")
@SendTo("/ordermessage/ebar")
//public List<Orders> getOrderMessage(Integer id) {
/* Default
public List<Orders> getOrderMessage() {
	System.out.println("getOrderMessage executing");
	List<Orders> wOrder = new ArrayList<>();
try {
 
/* Lets make a pause 
Thread.sleep(1000);
 
/* Return weather info for the given place 
wOrder = orderRepository.findByIdorder(1);
 
} catch (Exception ex) {
ex.printStackTrace();
}
System.out.println("getOrderMessage executed: "+ wOrder);
return wOrder;
}
 
/**
* Run weather info periodically.

// @Scheduled(fixedRate = 2000)
public void runWInfo(Integer id) {
this.template.convertAndSend("/ordermessage/ebar", orderRepository.findByIdorder(id));
}
 
/**
* @return the wData

public WeatherData getwData() {
return wData;
}*/
 
/**
* @param wDataArg
*            the wData to set

public void setwData(WeatherData wDataArg) {
wData = wDataArg;
}*/
}