package fi.vietjob.dao.industryDAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IndustryDao dao = (IndustryDao) context.getBean("industryDao");
        String in = "opetus haaga helia";
        List<String> list = new ArrayList<String>();
        list.add(in.concat(" "));
        for(String item :list){
        	   System.out.println(item);
        }
        System.out.println(in.concat(" "));
        System.out.println(dao.findIndustry(in));
        context.close();
	}

}
