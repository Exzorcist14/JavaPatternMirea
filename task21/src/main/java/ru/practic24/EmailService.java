package ru.practic24;

import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;

@Service
@AllArgsConstructor
public class EmailService {
  private final JavaMailSender javaMailSender;
  @Async
  public void saveBank(Bank bank) {
    SimpleMailMessage mailMessage = new SimpleMailMessage();
    mailMessage.setFrom("shiningsuffer@gmail.com");
    mailMessage.setTo("vladimir_namestnikov@vk.com");
    mailMessage.setSubject("Message from spring");
    mailMessage.setText(bank.toString());
    javaMailSender.send(mailMessage);
  }
  @Async
  public void saveCard(Card card) {
    SimpleMailMessage mailMessage = new SimpleMailMessage();
    mailMessage.setFrom("shiningsuffer@gmail.com");
    mailMessage.setTo("vladimir_namestnikov@vk.com");
    mailMessage.setSubject("Message from spring");
    mailMessage.setText(card.toString());
    javaMailSender.send(mailMessage);
  }
}

