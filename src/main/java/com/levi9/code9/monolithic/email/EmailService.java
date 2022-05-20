package com.levi9.code9.monolithic.email;


import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;

    public void sendMailReport(String type, String to, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("code9levi9@gmail.com");
        message.setTo(to);
        message.setSubject(String.format("%s report - WebShop", type));
        message.setText(text);

        mailSender.send(message);
    }

    public void sendMailUserUpdate(String to, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("code9levi9@gmail.com");
        message.setTo(to);
        message.setSubject(String.format("Profile information: %s", to));
        message.setText(text);

        mailSender.send(message);
    }

    public String generateUserUpdateText(String email, String type) {
        return String.format("Dear user  %s, \n" +
                "Your profile data is %!" +
                "\n\nSincerely, \nWebShop", email, type);
    }
}
