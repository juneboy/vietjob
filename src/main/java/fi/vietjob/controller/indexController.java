package fi.vietjob.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import fi.vietjob.bean.employee.Employee;
import fi.vietjob.bean.employer.Employer;
import fi.vietjob.bean.industry.Industry;
import fi.vietjob.bean.job.Job;
import fi.vietjob.bean.user.User;
import fi.vietjob.bean.zipcode.Zipcode;
import fi.vietjob.dao.employeeDAO.EmployeeDao;
import fi.vietjob.dao.employerDAO.EmployerDao;
import fi.vietjob.dao.industryDAO.IndustryDao;
import fi.vietjob.dao.jobDAO.JobDao;
import fi.vietjob.dao.userDAO.UserDao;
import fi.vietjob.dao.zipcodeDAO.ZipcodeDao;

@Controller
@EnableWebMvc
@RequestMapping(value = "/")
public class indexController {
	@Inject 
	private JobDao jobdao;
	@Inject
	private EmployeeDao employeedao;
	@Inject
	private EmployerDao employerdao;
	@Inject
	private IndustryDao industrydao;
	@Inject 
	private ZipcodeDao zipcodedao;
	@Inject
	private UserDao userdao;
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public String showHome(Model model) {
		return "index";
	}
	
	@RequestMapping(value="/jobs.json")
	public @ResponseBody List<Job> getJobsJSON(){
		List<Job> list = jobdao.getAllJob();
		return list;
	}
	@RequestMapping(value="/employees.json")
	public @ResponseBody List<Employee> getEmployeesJSON(){
		List<Employee> list = employeedao.getAllEmployee();
		return list;
	}
	
	@RequestMapping(value="/employers.json")
	public @ResponseBody List<Employer> getEmployersJSON(){
		List<Employer> list = employerdao.getAllEmployer();
		return list;
	}
	@RequestMapping(value="/industries.json")
	public @ResponseBody List<Industry> getIndustriesJSON(){
	    List<Industry> list = industrydao.getAllIndustry();
	    return list;
	}
	@RequestMapping(value="/zipcodes.json")
	public @ResponseBody List<Zipcode> getZipcodesJSON(){
		List<Zipcode> list = zipcodedao.getAllZipcode();
		return list;
	}
	@RequestMapping(value="/mails.json")
	public @ResponseBody List<String> getEmailJSON(){
		List<String> list = new ArrayList<String>();
		List<User> users = userdao.getAllUser();
		for(int i=0; i < users.size(); i++){
			list.add(users.get(i).getEmail());
		}
		return list;
	}
	
}
