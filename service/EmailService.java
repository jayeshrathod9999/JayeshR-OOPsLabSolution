package service;

import model.Department;
import model.Employee;

public class EmailService {

    public static String generateEmail(Employee employee, Department department) {
        String email = employee.getFirstname() + employee.getLastname() + "@" + department.getDeptname()
                + ".company.com";
        return email;
    }
}
