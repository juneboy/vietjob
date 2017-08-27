package fi.vietjob.dao.employerDAO;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fi.vietjob.bean.employer.Employer;
import fi.vietjob.bean.employer.EmployerImpl;
import fi.vietjob.bean.industry.Industry;
import fi.vietjob.bean.industry.IndustryImpl;
import fi.vietjob.bean.user.User;
import fi.vietjob.bean.user.UserImpl;

public class Test {

	public static void main(String[] args) {
		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        EmployerDao dao = (EmployerDao) context.getBean("employerDao");
        String name = "Haaga Helia";
        User user = new UserImpl(0, null, null, null, null);
        user.setUserID(4);
        Industry in = new IndustryImpl(null);
        in.setIndustryID(1);
        Employer e = new EmployerImpl(0, name, name, name, name, name, 0, 0);
        int row = dao.insertEmployer(e);
        System.out.print(row);
        context.close();*/
        String keyword = "Maija";
        String jsonObj = "'{'"+"name': '"+keyword+"'}'";
        String json = "{\"name\": \"Maija\"}";
        System.out.println(jsonObj);
        System.out.println(json);
	}
	

}
