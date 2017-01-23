package fi.vietjob.dao.zipcodeDAO;



import org.springframework.context.support.ClassPathXmlApplicationContext;

import fi.vietjob.bean.zipcode.Zipcode;

public class test {
	

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ZipcodeDao dao = (ZipcodeDao) context.getBean("zipcodeDao");
        for(Zipcode item : dao.getAllZipcode()){
          	System.out.print(item.getCity()+" ");
          	System.out.print(item.getState()+" ");
          	System.out.print(item.getZipcode()+"\n");
        }
        context.close();
	}

}
