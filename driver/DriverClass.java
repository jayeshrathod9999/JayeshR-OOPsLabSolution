package driver;

import java.util.Scanner;

import model.Department;
import model.Employee;
import service.EmailService;
import service.GeneratePassword;

public class DriverClass {

    public static void main(String[] args) {
        Employee emp1 = new Employee("jayesh", "rathod");
        // String emailID;

        System.out.println("Please enter department,\n 1.Admin \n 2.HR \n 3.Legal");

        Scanner n = new Scanner(System.in);
        int deptID = n.nextInt();
        n.close();
        GeneratePassword passWD = new GeneratePassword();
        switch (deptID) {
            case 1:
                Department department = new Department("Admin");
                String email = EmailService.generateEmail(emp1, department);

                String pass = passWD.generatePassword();
                System.out.println(
                        "Dear " + emp1.getFirstname() + " Your email is : " + email + "\nYour Password is : " + pass);
                break;

            case 2:
                Department department1 = new Department("HR");
                String email1 = EmailService.generateEmail(emp1, department1);
                String pass1 = passWD.generatePassword();
                System.out.println(
                        "Dear " + emp1.getFirstname() + " Your email is : " + email1 + "\nYour Password is : " + pass1);
                break;

            case 3:
                var department2 = new Department("Legal");
                String email2 = EmailService.generateEmail(emp1, department2);
                String pass2 = passWD.generatePassword();
                System.out.println(
                        "Dear " + emp1.getFirstname() + " Your email is : " + email2 + "\nYour Password is : " + pass2);
                break;

        }

    }

}
