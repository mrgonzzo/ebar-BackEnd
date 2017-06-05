package edenbar.websockets;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

import org.springframework.web.bind.annotation.CrossOrigin;

/*@ServerEndpoint transforms this POJO into a WebSocket Endpoint,
 *  the value attribute is mandatory in order to
 *  set the access URI to this Endpoint*/
@CrossOrigin(origins = "http://localhost:3000")
@ServerEndpoint("/ebar/ws")
public class EchoServer {
	//The 'handleMessage' method will be invoked for each received message
	@OnMessage
	public String handleMessage(String message){
		System.out.println("handleMesagge is executed");
		return "Thanks for the message: "+ message;
	}
}
