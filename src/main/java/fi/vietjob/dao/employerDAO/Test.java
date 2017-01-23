package fi.vietjob.dao.employerDAO;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fi.vietjob.bean.employer.Employer;
import fi.vietjob.bean.employer.EmployerImpl;
import fi.vietjob.bean.industry.Industry;
import fi.vietjob.bean.industry.IndustryImpl;
import fi.vietjob.bean.user.User;
import fi.vietjob.bean.user.UserImpl;
import fi.vietjob.bean.zipcode.Zipcode;
import fi.vietjob.bean.zipcode.ZipcodeImpl;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        EmployerDao dao = (EmployerDao) context.getBean("employerDao");
        String name = "Haaga Helia";
        Zipcode zipcode = new ZipcodeImpl("01280",null, null);
        User user = new UserImpl(0, null, null, null, null);
        user.setUserID(4);
        Industry in = new IndustryImpl(null);
        in.setIndustryID(1);
        Employer e = new EmployerImpl(name, null, null, null, user, zipcode, in);
        int row = dao.insertEmployer(e);
        System.out.print(row);
        context.close();
	}
	

}
