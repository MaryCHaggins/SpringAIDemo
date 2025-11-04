package com.example.demo.controller;

import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ai")
public class AiController {

    private final OpenAiChatClient openAiChatClient;

    @Autowired
    public AiController(OpenAiChatClient openAiChatClient) {
        this.openAiChatClient = openAiChatClient;
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String message) {
        // 简单对接OpenAI，返回AI回复
        return openAiChatClient.call(message);
    }
}