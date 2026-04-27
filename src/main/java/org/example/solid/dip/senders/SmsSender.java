package org.example.solid.dip.senders;

import org.example.solid.dip.contract.MessageSender;

public class SmsSender implements MessageSender {
    @Override
    public void send(String recipient, String message){
        System.out.println("Sending SMS to" + recipient);
    }
}



