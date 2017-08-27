package fi.vietjob.dao.employeeDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.vietjob.bean.employee.Employee;
import fi.vietjob.bean.employee.EmployeeImpl;

public class EmployeeRowMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int row) throws SQLException {
		Employee employee = new EmployeeImpl(0, null, null, null, null, null, 0, 0, null, null, 0, null, 0, null);
		
		/*employee*/
		employee.setCertificate(rs.getString("certificate"));
		employee.setEmployeeAddress(rs.getString("employeeAddress"));
		employee.setEmployeeBOD(rs.getDate("employeeBOD"));
		employee.setEmployeeID(rs.getInt("employeeID"));
		employee.setEmployeeName(rs.getString("employeeName"));
		employee.setEmployeePhone(rs.getString("employeePhone"));
		employee.setEmployeeSSN(rs.getString("employeeSSN"));
		employee.setExperience(rs.getInt("experience"));
		employee.setIndustryID(rs.getInt("industryID_FK"));
		employee.setLanguages(rs.getString("languages"));
		employee.setMoredetails(rs.getString("moredetails"));
		employee.setNationalityID(rs.getInt("nationalityID_FK"));
		employee.setUserID(rs.getInt("userID_FK"));
		employee.setZipcode(rs.getString("zipcode_FK"));
		return employee;
	}

}
