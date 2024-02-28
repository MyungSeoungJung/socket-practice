package com.example.socketpractice.config;

import com.example.socketpractice.handler.WebSocketHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Slf4j
@EnableWebSocket
@RequiredArgsConstructor
@Configuration
public class WebSocketConfig implements WebSocketConfigurer {
    private final WebSocketHandler webSocketHandler;
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry){
        log.info("시도");
        registry.addHandler(webSocketHandler, "/chat").setAllowedOrigins("http://localhost:3000");
    }
}
