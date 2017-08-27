package fi.vietjob.dao.employeeDAO;

import java.util.List;

import fi.vietjob.bean.employee.Employee;

public interface EmployeeDao {
    public List<Employee> getAllEmployee();
    public List<Employee> searchEmployee(String column,String keyword);
    public int editEmployee(Employee employee);
    public int postEmployee(Employee employee);
    public int deleteEmployee(int employeeID);
    public int postListEmployee(List<Employee> employees);
}
