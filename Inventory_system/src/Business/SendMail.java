/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
//import business.Customer.Customer;
//import business.Customer.Ticket;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author anvithalakshmisha
 */
public class SendMail {

    public void sendMail(String subject, String text, String to) {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("inventorymanagementaas@gmail.com", "aas051997");
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("inventorymanagementaas@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress());

//            if (id != null && customer != null && ticket != null) {
            message.setSubject(subject);
            message.setText("Dear ," + "" + ".\n\nRegards,\nInventory Management Admin");
//            } 
//        else {
//            message.setSubject("Thanks for registering with us!");
//            message.setText("You have successfully registered yourself!");
//            }
            Transport.send(message);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
