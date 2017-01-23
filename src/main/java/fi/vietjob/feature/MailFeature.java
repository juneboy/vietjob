package fi.vietjob.feature;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.inject.Inject;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Repository;

import fi.vietjob.bean.mail.Mail;

@Repository
public class MailFeature {
	@Inject
	@Qualifier("mailSender")
	private JavaMailSender mailSender;

	public JavaMailSender getMailSender() {
		return mailSender;
	}

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void getPalaute(Mail mail, String to) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setSubject(mail.getSubject());
		message.setText(mail.getText());
		message.setFrom(mail.getFrom());
		message.setSentDate(new Date());
		mailSender.send(message);
	}

	public void sendHTMLEmail(Mail mail, String to, String senderName) {
		MimeMessage mime = mailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(mime, true);
			helper.setFrom(mail.getFrom(), senderName);
			helper.setText(mail.getText());
			helper.setSubject(mail.getSubject());
			helper.setSentDate(new Date());
			helper.setTo(to);
			mailSender.send(mime);
		} catch (MailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void sendAttachmentMail(Mail mail, FileSystemResource file){
		
	}
}
