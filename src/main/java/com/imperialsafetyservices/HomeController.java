package com.imperialsafetyservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.imperialsafetyservices.modal.Mail;
import com.imperialsafetyservices.service.MailService;

@Controller
public class HomeController {

	@Autowired
	private MailService mailService;

	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView andView = new ModelAndView("home");
		System.out.println("hi");
		return andView;
	}

	// Sending a simple Email
	@ResponseBody
	@GetMapping("/sendMail")
	public String sendMail() {
		Mail mail = new Mail();
		mail.setMailFrom("gulfarooqui1@gmail.com");
		mail.setMailTo("gulfarooqui09@gmail.com");
		mail.setMailSubject("Imperial Safety Services");
		mail.setMailContent("Just Fire Sefety");
		mailService.sendEmail(mail);

		return "sent";
	}

}
