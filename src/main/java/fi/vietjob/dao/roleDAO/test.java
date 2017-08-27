package fi.vietjob.dao.roleDAO;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fi.vietjob.bean.employer.Employer;
import fi.vietjob.bean.employer.EmployerImpl;
import fi.vietjob.bean.job.Job;
import fi.vietjob.bean.job.JobImpl;
import fi.vietjob.bean.zipcode.Zipcode;
import fi.vietjob.bean.zipcode.ZipcodeImpl;
import fi.vietjob.dao.jobDAO.JobDao;

public class test {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
         JobDao dao = (JobDao) context.getBean("jobDao");
                 List<Job> list = dao.getAllJob();
                 Zipcode zip = new ZipcodeImpl(null, null, null);
                 Employer em = new EmployerImpl(0, null, null, null, null, null, 0, 0);
                 em.setEmployerID(2);
                 zip.setZipcode("01720");
                 String details ="Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod"+
"tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,"+
"quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo"+
"consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse"+
"cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non"+
"proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
                 String require = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod"+
                		 "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,"+
                		 "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo"+
                		 "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse"+
                		 "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non"+
                		 "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
                 Job job = new JobImpl(4,"Päälikkö", zip.getZipcode(), details, require, em.getEmployerID(), new Date(), new Date());
                 dao.postJob(job);
         for(Job item : list){
        	     System.out.println(item.getJobName());
         }
         context.close();
	}

}
