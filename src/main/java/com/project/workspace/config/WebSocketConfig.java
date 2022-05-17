package com.project.workspace.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocket
@RequiredArgsConstructor
public class WebSocketConfig implements WebSocketConfigurer {
    private final WebSocketHandler webSocketHandler;
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(webSocketHandler,"/chat");
    }
}

//    @Configuration
//    @EnableWebSocketMessageBroker
//    public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
//
//        @Override
//        public void configureMessageBroker(MessageBrokerRegistry config) {
//            //  /topic 아래로 들어오는 url : subscribe할 때 사용할 url
//            config.enableSimpleBroker("/topic");
//            // /app : publish할 때 사용할 url
//            config.setApplicationDestinationPrefixes("/app");
//        }
//
//        @Override
//        public void registerStompEndpoints(StompEndpointRegistry registry) {
//            registry.addEndpoint("/chat");
//        }
//
//    }
