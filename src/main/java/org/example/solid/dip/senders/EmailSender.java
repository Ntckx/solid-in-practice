package org.example.solid.dip.senders;

import org.example.solid.dip.contract.MessageSender;

public class EmailSender implements MessageSender {
    @Override
    public void send(String recipient, String message){
        System.out.println("Sending Mail to:" + recipient);
    }
}


