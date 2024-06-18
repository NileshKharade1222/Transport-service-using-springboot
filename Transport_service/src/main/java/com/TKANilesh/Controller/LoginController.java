package com.TKANilesh.Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.TKA.Nilesh.model.Contact;
import com.TKA.Nilesh.model.Contactdata;
import com.TKA.Nilesh.model.Login;


@Controller
public class LoginController {
	
	
	@Autowired
	SessionFactory sf;
	

	
	@RequestMapping("loginpage")    
	public String loginpage() {
		return "login";

	}
	
	@RequestMapping("login")
	public String loginp(Login login , Model model) {
		Session s = sf.openSession();
		Login dlogin = s.get(Login.class, login.getPassword());
		
		String page = "login";
		String msg = null;
		
		if(dlogin !=null) {
			
			if (login.getUsername().equals(dlogin.getUsername())){
			msg = "welcome";
			page = "home";
			
		} else {
			msg = "invalid Username and Password";
			
		}
	
		}else {
			msg = "invalid Username and Password";
			
	  }
		model.addAttribute("msg",msg);
		return page;
	}
	@RequestMapping("createAccount")
	public String createAccount() {
		return "createAccount";
		
	 }
	
	@RequestMapping("createaccountdata")
	public String createaccountdata(Login login) {
		Session s = sf.openSession();
		Login dlogin = s.get(Login.class, login.getPassword());
		String page = "login";
		String msg = null;
		
		if(dlogin != null) {
			if (login.getUsername().equals(dlogin.getUsername())) {
				msg = "alrady Register this Username and Passsword";
			}
			
		}else {
			Transaction t = s.beginTransaction();
			s.save(login);
			t.commit();
		}
		return "createAccount";
	}

	

	@RequestMapping("about")
	public String about() {
		return "about";
	
	}
	@RequestMapping("home")
	public String home() {
		return "home";
	}
	@RequestMapping("service")
	public String service() {
		return "service";

	}
	
	@RequestMapping("galary")
	public String galary() {
		return "galary";
		
	}
	
	@RequestMapping("contact")
	public String contact() {
		return "contact";
		}
	     
	@RequestMapping("contactdata")
	public String contactdata(Contactdata contact) {
		Session s = sf.openSession();
		
		Contactdata dlogin = s.get(Contactdata.class, contact.getPhonenumber());
		
		String page = "contact";
		String msg = null;
		
		if (dlogin != null) {
			if (contact.getEmail().equals(dlogin.getEmail())) {
				msg = "Already register this Email and Mobile";
			}
		
		}else {
			Transaction t = s.beginTransaction();
			s.save(contact);
			t.commit();
		}
		return "contact";
	}
	
	@RequestMapping("branches")
     public String branches() {
		return "branches";
		
		
	}
}


  
	

