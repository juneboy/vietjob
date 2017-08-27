package fi.vietjob.dao.jobDAO;

import java.util.List;

import fi.vietjob.bean.job.Job;

public interface JobDao {
    public List<Job> getAllJob();
    public List<Job> searchJobs(String column,String keyword);
    public int postJob(Job job);
    public int editJob(Job job);
    public int postListJob(List<Job> jobs);
    public int deleteJob(int id);
}
