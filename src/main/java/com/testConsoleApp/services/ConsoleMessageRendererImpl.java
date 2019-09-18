package com.testConsoleApp.services;

import com.testConsoleApp.interfaces.MessageRenderer;
import org.springframework.stereotype.Service;

@Service
public class ConsoleMessageRendererImpl implements MessageRenderer {
    @Override
    public void renderMessage(String message) {
        System.out.println(message);
    }
}
