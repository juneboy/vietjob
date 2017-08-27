package fi.vietjob.dao.jobDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.vietjob.bean.job.Job;
import fi.vietjob.bean.job.JobImpl;

public class JobRowMapper implements RowMapper<Job> {

	public Job mapRow(ResultSet rs, int row) throws SQLException {
		Job job = new JobImpl(row, null, null, null, null, row, null, null);
		
		/*job*/
		job.setJobID(rs.getInt("jobID"));
		job.setPostDate(rs.getDate("postDate"));
		job.setExpDate(rs.getDate("expDate"));
		job.setJobName(rs.getString("jobName"));
		job.setZipcode(rs.getString("zipcode_FK"));
		job.setJobDetails(rs.getString("jobDetails"));
		job.setJobRequire(rs.getString("jobRequire"));
		job.setEmployerID(rs.getInt("employerID_FK"));
		
		return job;
	}


}
