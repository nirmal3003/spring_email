package com.te;

import com.te.service.EmailSenderService;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringEmailAttachedApplication {
	private final EmailSenderService emailSenderService;
	public static void main(String[] args) {

		SpringApplication.run(SpringEmailAttachedApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void triggerEmail() throws MessagingException {
		emailSenderService.sendMailWithAttachment("nmmnirmalkumar@gmail.com", "body","subject","C:\\Users\\DELL\\Desktop\\NirmalResume.pdf");

	}

}
