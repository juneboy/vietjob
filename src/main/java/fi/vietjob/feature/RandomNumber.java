package fi.vietjob.feature;

import java.util.Random;

public class RandomNumber {
	static Random RANDOM = new Random();

	public final static int getJobId() {
		int jobID = 100000 + RANDOM.nextInt(900000);
		jobID = (jobID > 0) ? jobID : -jobID;
		return jobID;
	}
	
	public final static int getEmployerId(){
		int employerID = 1000 + RANDOM.nextInt(9000);
		employerID = (employerID > 0) ? employerID : -employerID;
		return employerID;
	}

	public final static String getUserId(int type) {
		switch (type) {
		case 1:
			return "EE" + getJobId();
		case 2:
			return "ER" + getJobId();
		case 3:
			return "AD" + getJobId();
		default:
			return "EE" + getJobId();
		}
	}
}
