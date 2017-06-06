package edenbar.websockets;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;




@Configuration
@EnableWebSocketMessageBroker
public class OrderWebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
	/*
	 *  establecemos el mecanismo (broker) que escribira en el canal de mensajes del servidor a los clientes y cuya URI (del canal) empezará por “/ordermessage”.
	 *  En este caso es un broker sencillo que solo mantiene sus mensajes en memoria (sin persistencia). 
	 *  También indicamos que los mensajes de los clientes al servidor irán dirigidos a una URL que empezará por “/ebar” */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/ordermessage");
        config.setApplicationDestinationPrefixes("/ebar");
    }
   /*se establece “/kitchen” como la URI del web socket creado 
    * y se indica que se espera SockJS para establecer la comunicación desde el cliente.*/
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/kitchen").withSockJS();
    }
}