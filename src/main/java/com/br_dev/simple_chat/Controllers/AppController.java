package com.br_dev.simple_chat.Controllers;


import com.br_dev.simple_chat.Config.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class AppController {

    @MessageMapping("/chatMessage")
    @SendTo("/channel")
    public Message sendMessage(Message message) {
        return  message;
    }
}
