package fi.vietjob.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fi.vietjob.bean.employee.Employee;
import fi.vietjob.bean.employee.EmployeeImpl;
import fi.vietjob.bean.employer.Employer;
import fi.vietjob.bean.employer.EmployerImpl;
import fi.vietjob.bean.industry.Industry;
import fi.vietjob.bean.industry.IndustryImpl;
import fi.vietjob.bean.user.User;
import fi.vietjob.bean.user.UserImpl;
import fi.vietjob.bean.zipcode.Zipcode;
import fi.vietjob.bean.zipcode.ZipcodeImpl;
import fi.vietjob.dao.employeeDAO.EmployeeDao;
import fi.vietjob.dao.employerDAO.EmployerDao;
import fi.vietjob.dao.industryDAO.IndustryDao;
import fi.vietjob.dao.userDAO.UserDao;
import fi.vietjob.feature.CapitalFirstLetter;

@Controller
@RequestMapping(value = "/")
public class loginController {
	@Inject
	private UserDao userdao;
	@Inject
	private IndustryDao industrydao;
	@Inject
	private EmployerDao employerdao;
	@Inject
	private EmployeeDao employeedao;
	@Inject
	private StandardPasswordEncoder encoder;
	Employer employer;
	Employee employee;
	User user;
	int ENABLED = 1;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin(Model model) {
		return "login";
	}

	@RequestMapping(value = "/logincheck", method = RequestMethod.POST)
	public String checkLogin(Model model) {
		return "redirect:login";
	}

	@RequestMapping(value = "/loginfail", method = RequestMethod.GET)
	public String showFail(Model model) {
		model.addAttribute("loginerror", "true");
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logOut(Model model) {
		model.addAttribute("logout", "true");
		return "login";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signUp(Model model) {
		return "login";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String receiveSignup(@RequestParam(value = "type") Integer type,
			HttpServletRequest request, HttpServletResponse response)
			throws NoSuchAlgorithmException, UnsupportedEncodingException {
		switch (type) {
		case 1:
			signupEmployee(request, response);
			break;
		case 2:
			signupEmployer(request, response);
			break;
		}
		return "redirect:";
	}

	private void signupEmployer(HttpServletRequest request,
			HttpServletResponse response) {
	    
		Industry in = new IndustryImpl(null);
		String name = request.getParameter("nameEmployer");
		String industry = CapitalFirstLetter.getCapitalize(request.getParameter("industry"));
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		in = industrydao.findIndustry(industry);
		if(in.equals(null)){
			in.setIndustry(industry);
			industrydao.insertIndustry(in);
			employer = new EmployerImpl(name, null, null, null, null, null, in);
			user = new UserImpl(ENABLED, email, pass, null, null);
			userdao.insertUser(user, encoder);
	        employerdao.insertEmployer(employer);
		} else {
			Zipcode zipcode = new ZipcodeImpl("01280",null, null);
			employer = new EmployerImpl(name, null, null, null, null,zipcode, in);
			user = new UserImpl(ENABLED, email, pass, null, null);
			userdao.insertUser(user, encoder);
	        employerdao.insertEmployer(employer);
		}
		
	}

	private void signupEmployee(HttpServletRequest request,
			HttpServletResponse response) {
		employee = new EmployeeImpl(null, null, null, null, null, null, null, null, null, 0, null, null, null, null);
		String name = request.getParameter("nameEmployee");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
        employee.setEmployeeName(name);
        user = new UserImpl(ENABLED, email, pass, null, null);
        employeedao.postEmployee(employee);
        userdao.insertUser(user, encoder);
	}

}
