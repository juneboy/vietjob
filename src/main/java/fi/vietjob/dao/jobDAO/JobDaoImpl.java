package fi.vietjob.dao.jobDAO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fi.vietjob.bean.job.Job;
import fi.vietjob.feature.RandomNumber;

@Repository
public class JobDaoImpl implements JobDao {
	@Inject
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public final static String getCurrentDate() {
		Date current = new Date();
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
		String todayStr = fm.format(current);
		return todayStr;
	}
	
	public List<Job> getAllJob() {
		List<Job> list = new ArrayList<Job>();
		String sql = "select * from Job";
		RowMapper<Job> jobRM = new JobRowMapper();
		list = jdbcTemplate.query(sql, jobRM);
		return list;
	}

	public List<Job> searchJobs(String column, String keyword) {
		List<Job> list = new ArrayList<Job>();
		String sql = "select * from job where "+column+" =?";
		Object[] object = new Object[]{keyword};
		RowMapper<Job> jobRM = new JobRowMapper();
		list = jdbcTemplate.query(sql, object, jobRM);
		return list;
	}


	public int postJob(Job job) {
		int row=0;
		String sql = "insert into Job(jobID, jobName, jobDetails, jobRequire, employerID_FK, zipcode_FK, postDate, expDate) values (?,?,?,?,?,?,?,?)";
		int id = RandomNumber.getJobId();
		String name = job.getJobName();
		String details = job.getJobDetails();
		String require = job.getJobRequire();
		int employerID = job.getEmployer().getEmployerID();
		String zipcode = job.getZipcode().getZipcode();
		String exp = job.getExpDate();
		String post = getCurrentDate();
		Object[] ob = new Object[]{id, name, details, require, employerID, zipcode, post, exp};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public int editJob(Job job) {
		int row=0;
		String sql = "update Job set jobName=?, jobDetails=?, jobRequire=?, employerID_FK=?, zipcode_FK=?, postDate=?, expDate=? where jobID=?";
		int jobID = job.getJobID();
		String name = job.getJobName();
		String details = job.getJobDetails();
		String require = job.getJobRequire();
		int employerID = job.getEmployer().getEmployerID();
		String zipcode = job.getZipcode().getZipcode();
		String post = getCurrentDate();
		String exp = job.getExpDate();
		Object[] ob = new Object[]{name, details, require, employerID, zipcode,post, exp, jobID};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public int postListJob(List<Job> jobs) {
		String sql = "insert into Job(jobID, jobName, jobDetails, jobRequire, employerID_FK, zipcode_FK, postDate, expDate) values (?,?,?,?,?,?,?,?)";
		int row = 0;
		for(Job job : jobs){
			row++;
			int id = RandomNumber.getJobId();
			String name = job.getJobName();
			String details = job.getJobDetails();
			String require = job.getJobRequire();
			int employerID = job.getEmployer().getEmployerID();
			String zipcode = job.getZipcode().getZipcode();
			String exp = job.getExpDate();
			String post = getCurrentDate();
			Object[] ob = new Object[]{id, name, details, require, employerID, zipcode, post, exp};
			jdbcTemplate.update(sql, ob);
		}
		return row;
	}

	public int deleteJob(int id) {
		int row=0;
		String sql = "delete from Job where jobID=?";
		Object[] ob = new Object[]{id};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

}
