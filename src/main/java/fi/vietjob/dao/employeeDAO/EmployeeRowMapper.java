package fi.vietjob.dao.employeeDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.vietjob.bean.employee.Employee;
import fi.vietjob.bean.employee.EmployeeImpl;
import fi.vietjob.bean.industry.Industry;
import fi.vietjob.bean.industry.IndustryImpl;
import fi.vietjob.bean.nationality.Nationality;
import fi.vietjob.bean.nationality.NationalityImpl;
import fi.vietjob.bean.user.User;
import fi.vietjob.bean.user.UserImpl;
import fi.vietjob.bean.zipcode.Zipcode;
import fi.vietjob.bean.zipcode.ZipcodeImpl;

public class EmployeeRowMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int row) throws SQLException {
		Zipcode zipcode = new ZipcodeImpl(null, null, null);
		Industry industry = new IndustryImpl(null);
		Nationality nationality = new NationalityImpl(null);
		User user = new UserImpl(0, null, null, null, null);
		Employee employee = new EmployeeImpl(null, null, null, null, null, null, null, null, null, 0, null, null, null, null);
		
		/*zipcode*/
		zipcode.setZipcode(rs.getString("zipcode_FK"));
		/*industry*/
		industry.setIndustryID(rs.getInt("industryID_FK"));
		
		/*nationality*/
		nationality.setNationalityID(rs.getInt("nationalityID_FK"));
		
		/*user*/
		user.setUserID(rs.getInt("userID_FK"));
		
		/*employee*/
		employee.setCertificate(rs.getString("certificate"));
		employee.setEmployeeAddress(rs.getString("employeeAddress"));
		employee.setEmployeeBOD(rs.getDate("employeeBOD"));
		employee.setEmployeeID(rs.getInt("employeeID"));
		employee.setEmployeeName(rs.getString("employeeName"));
		employee.setEmployeePhone(rs.getString("employeePhone"));
		employee.setEmployeeSSN(rs.getString("employeeSSN"));
		employee.setExperience(rs.getInt("experience"));
		employee.setIndustry(industry);
		employee.setLanguages(rs.getString("languages"));
		employee.setMoredetails(rs.getString("moredetails"));
		employee.setNationality(nationality);
		employee.setUser(user);
		employee.setZipcode(zipcode);
		return employee;
	}

}
