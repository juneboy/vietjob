package fi.vietjob.dao.employerDAO;

import java.util.List;

import fi.vietjob.bean.employer.Employer;

public interface EmployerDao {
    public List<Employer> getAllEmployer();
    public List<Employer> getAllEmployerByKeyword(String column, String keyword);
    public int insertEmployer(Employer employer);
    public int insertListEmployer(List<Employer> employers);
    public int editEmployer(Employer employer);
    public int deleteEmployer(int id);
}
