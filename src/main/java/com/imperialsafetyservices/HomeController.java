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
//		mail.setMailContent("Just Fire Sefety");
		mail.setMailContent( "<html>\r\n"
				+ "<!-- Complete Email template -->\r\n"
				+ "\r\n"
				+ "<!-- Complete Email template -->\r\n"
				+ " \r\n"
				+ " \r\n"
				+ "<body style=\"background-color:grey\">\r\n"
				+ "    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n"
				+ "           width=\"550\" bgcolor=\"white\" style=\"border:2px solid black\">\r\n"
				+ "        <tbody>\r\n"
				+ "            <tr>\r\n"
				+ "                <td align=\"center\">\r\n"
				+ "                    <table align=\"center\" border=\"0\" cellpadding=\"0\"\r\n"
				+ "                           cellspacing=\"0\" class=\"col-550\" width=\"550\">\r\n"
				+ "                        <tbody>\r\n"
				+ "                            <tr>\r\n"
				+ "                                <td align=\"center\" style=\"background-color: #4cb96b;\r\n"
				+ "                                           height: 50px;\">\r\n"
				+ " \r\n"
				+ "                                    <a href=\"#\" style=\"text-decoration: none;\">\r\n"
				+ "                                        <p style=\"color:white;\r\n"
				+ "                                                  font-weight:bold;\">\r\n"
				+ "                                            GeeksforGeeks\r\n"
				+ "                                        </p>\r\n"
				+ "                                    </a>\r\n"
				+ "                                </td>\r\n"
				+ "                            </tr>\r\n"
				+ "                        </tbody>\r\n"
				+ "                    </table>\r\n"
				+ "                </td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr style=\"height: 300px;\">\r\n"
				+ "                <td align=\"center\" style=\"border: none;\r\n"
				+ "                           border-bottom: 2px solid #4cb96b; \r\n"
				+ "                           padding-right: 20px;padding-left:20px\">\r\n"
				+ " \r\n"
				+ "                    <p style=\"font-weight: bolder;font-size: 42px;\r\n"
				+ "                              letter-spacing: 0.025em;\r\n"
				+ "                              color:black;\">\r\n"
				+ "                        Hello Geeks!\r\n"
				+ "                        <br> Check out our latest Blogs\r\n"
				+ "                    </p>\r\n"
				+ "                </td>\r\n"
				+ "            </tr>\r\n"
				+ " \r\n"
				+ "            <tr style=\"display: inline-block;\">\r\n"
				+ "                <td style=\"height: 150px;\r\n"
				+ "                           padding: 20px;\r\n"
				+ "                           border: none; \r\n"
				+ "                           border-bottom: 2px solid #361B0E;\r\n"
				+ "                           background-color: white;\">\r\n"
				+ "                   \r\n"
				+ "                    <h2 style=\"text-align: left;\r\n"
				+ "                               align-items: center;\">\r\n"
				+ "                        Design Patterns : A Must Skill to \r\n"
				+ "                      have for Software Developers in 2019\r\n"
				+ "                   </h2>\r\n"
				+ "                    <p class=\"data\"\r\n"
				+ "                       style=\"text-align: justify-all;\r\n"
				+ "                              align-items: center; \r\n"
				+ "                              font-size: 15px;\r\n"
				+ "                              padding-bottom: 12px;\">\r\n"
				+ "                        Design Patterns….??? I think you have heard this name \r\n"
				+ "                      before in programming… Yes, you might have heard \r\n"
				+ "                      this name before in programming if you are…\r\n"
				+ "                    </p>\r\n"
				+ "                    <p>\r\n"
				+ "                        <a href=\r\n"
				+ "\"https://www.geeksforgeeks.org/design-patterns-a-must-skill-to-have-for-software-developers-in-2019/\"\r\n"
				+ "                           style=\"text-decoration: none; \r\n"
				+ "                                  color:black; \r\n"
				+ "                                  border: 2px solid #4cb96b; \r\n"
				+ "                                  padding: 10px 30px;\r\n"
				+ "                                  font-weight: bold;\"> \r\n"
				+ "                           Read More \r\n"
				+ "                      </a>\r\n"
				+ "                    </p>\r\n"
				+ "                </td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr style=\"border: none; \r\n"
				+ "            background-color: #4cb96b; \r\n"
				+ "            height: 40px; \r\n"
				+ "            color:white; \r\n"
				+ "            padding-bottom: 20px; \r\n"
				+ "            text-align: center;\">\r\n"
				+ "                \r\n"
				+ "<td height=\"40px\" align=\"center\">\r\n"
				+ "    <p style=\"color:white; \r\n"
				+ "    line-height: 1.5em;\">\r\n"
				+ "    GeeksforGeeks\r\n"
				+ "    </p>\r\n"
				+ "    <a href=\"#\" \r\n"
				+ "    style=\"border:none;\r\n"
				+ "           text-decoration: none; \r\n"
				+ "           padding: 5px;\"> \r\n"
				+ "           \r\n"
				+ "    <img height=\"30\" \r\n"
				+ "    src=\r\n"
				+ "\"https://extraaedgeresources.blob.core.windows.net/demo/salesdemo/EmailAttachments/icon-twitter_20190610074030.png\" \r\n"
				+ "    width=\"30\" /> \r\n"
				+ "    </a> \r\n"
				+ "    \r\n"
				+ "    <a href=\"#\"\r\n"
				+ "    style=\"border:none;\r\n"
				+ "    text-decoration: none; \r\n"
				+ "    padding: 5px;\"> \r\n"
				+ "    \r\n"
				+ "    <img height=\"30\" \r\n"
				+ "    src=\r\n"
				+ "\"https://extraaedgeresources.blob.core.windows.net/demo/salesdemo/EmailAttachments/icon-linkedin_20190610074015.png\" \r\n"
				+ "width=\"30\" /> \r\n"
				+ "    </a>\r\n"
				+ "    \r\n"
				+ "    <a href=\"#\" \r\n"
				+ "    style=\"border:none;\r\n"
				+ "    text-decoration: none;\r\n"
				+ "    padding: 5px;\"> \r\n"
				+ "    \r\n"
				+ "    <img height=\"20\"\r\n"
				+ "    src=\r\n"
				+ "\"https://extraaedgeresources.blob.core.windows.net/demo/salesdemo/EmailAttachments/facebook-letter-logo_20190610100050.png\" \r\n"
				+ "        width=\"24\" \r\n"
				+ "        style=\"position: relative; \r\n"
				+ "               padding-bottom: 5px;\" />\r\n"
				+ "    </a>\r\n"
				+ "</td>\r\n"
				+ "</tr>\r\n"
				+ " \r\n"
				+ "        <tr>\r\n"
				+ "          <td class=\"em_hide\"\r\n"
				+ "          style=\"line-height:1px;\r\n"
				+ "                 min-width:700px;\r\n"
				+ "                 background-color:#ffffff;\">\r\n"
				+ "              <img alt=\"\" \r\n"
				+ "              src=\"images/spacer.gif\" \r\n"
				+ "              style=\"max-height:1px; \r\n"
				+ "              min-height:1px; \r\n"
				+ "              display:block; \r\n"
				+ "              width:700px; \r\n"
				+ "              min-width:700px;\" \r\n"
				+ "              width=\"700\"\r\n"
				+ "              border=\"0\" \r\n"
				+ "              height=\"1\">\r\n"
				+ "              </td>\r\n"
				+ "        </tr>\r\n"
				+ "        </tbody>\r\n"
				+ "    </table>\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>");
		mailService.sendEmail(mail);

		return "sent";
	}

}
