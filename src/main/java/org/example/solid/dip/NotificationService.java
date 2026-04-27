package org.example.solid.dip;


// From OrderProcessor class, we already have sending email to that customer after purchase
// But you have to change from sending email, to SMS

import org.example.solid.dip.contract.MessageSender;

// Now since email, sms have the same goal which is to send the information to that customer,
// so we create interface to handle this logic
public class NotificationService {

    // With this instead of directly create new object from a specific class,
    // we depend on an interface so that if one specific class change, the code here would not crash
    // following DIP
    private final MessageSender messageSender;
    public NotificationService(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void notifyCustomer(String contactInfo, String message){
        System.out.println("Notification Processing Flow");

        messageSender.send(contactInfo, message);
    }
}



