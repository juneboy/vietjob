package fi.vietjob.dao.employeeDAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fi.vietjob.bean.employee.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Inject
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		String sql = "select * from Employee";
		RowMapper<Employee> employeeRM = new EmployeeRowMapper();
		list = jdbcTemplate.query(sql, employeeRM);
		return list;
	}

	public List<Employee> searchEmployee(String column, String keyword) {
		List<Employee> list = new ArrayList<Employee>();
		String sql = "select * from Employee where " + column + "= ?";
		Object[] ob = new Object[]{keyword};
		RowMapper<Employee> employeeRM = new EmployeeRowMapper();
		list = jdbcTemplate.query(sql,ob, employeeRM);
		return list;
	}

	public int editEmployee(Employee employee) {
		int row =0;
		String sql = "update Employee set employeeName=?, employeeBOD=?, employeeAddress=?, zipcode_FK=?, employeePhone=?, nationalityID_FK=?,industryID_FK=?,languages=?,certificate=?,expericence=?,employeeSSN=?,moredetails=?";
		String name= employee.getEmployeeName();
		Date BOD = employee.getEmployeeBOD();
		String address = employee.getEmployeeAddress();
		String zipcode = employee.getZipcode();
		String phone = employee.getEmployeePhone();
		int nationality = employee.getNationalityID();
		int industry = employee.getIndustryID();
		String languages = employee.getLanguages();
		String certificate = employee.getCertificate();
		int experience = employee.getExperience();
		String SSN = employee.getEmployeeSSN();
		String details = employee.getMoredetails();
		
		Object[] ob = new Object[]{name, BOD, address, zipcode, phone, nationality, industry,languages,certificate,experience,SSN,details};
	    row = jdbcTemplate.update(sql, ob);
	    return row;
	}

	public int postEmployee(Employee employee) {
		int row =0;
		String sql = "insert into Employee(employeeName,employeeBOD, employeeAddress, zipcode_FK,employeePhone,nationalityID_FK,industryID_FK,languages,certificate,experience,employeeSSN,moredetails) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		String name= employee.getEmployeeName();
		Date BOD = employee.getEmployeeBOD();
		String address = employee.getEmployeeAddress();
		String zipcode = employee.getZipcode();
		String phone = employee.getEmployeePhone();
		int nationality = employee.getNationalityID();
		int industry = employee.getIndustryID();
		String languages = employee.getLanguages();
		String certificate = employee.getCertificate();
		int experience = employee.getExperience();
		String SSN = employee.getEmployeeSSN();
		String details = employee.getMoredetails();
		
		Object[] ob = new Object[]{name, BOD, address, zipcode, phone, nationality, industry,languages,certificate,experience,SSN,details};
	    row = jdbcTemplate.update(sql, ob);
	    return row;
	}

	public int deleteEmployee(int employeeID) {
		int row =0;
        	String sql = "delete from Employee where employeeID=?";
        	Object[] ob = new Object[]{employeeID};
        	row = jdbcTemplate.update(sql, ob);
        	return row;
	}

	public int postListEmployee(List<Employee> employees) {
		String sql = "insert into Employee(employeeName,employeeBOD, employeeAddress, zipcode_FK,employeePhone,nationalityID_FK,industryID_FK,languages,certificate,experience,employeeSSN,moredetails) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int row = 0;
		for (Employee e : employees) {
			row++;
			String name = e.getEmployeeName();
			Date BOD = e.getEmployeeBOD();
			String address = e.getEmployeeAddress();
			String zipcode = e.getZipcode();
			String phone = e.getEmployeePhone();
			int nationality = e.getNationalityID();
			int industry = e.getIndustryID();
			String languages = e.getLanguages();
			String certificate = e.getCertificate();
			int experience = e.getExperience();
			String SSN = e.getEmployeeSSN();
			String details = e.getMoredetails();
			Object[] ob = new Object[] { name, BOD, address, zipcode, phone,
					nationality, industry, languages, certificate, experience,
					SSN, details };
            jdbcTemplate.update(sql, ob);
		}
		return row;
	}

}
