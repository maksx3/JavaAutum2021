package sef.FinalActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    public void testEmployeeConstructor(){
        Employee employee = new Employee();
        employee.setFirstName("Maxim");
        employee.setAge(21);

        assertEquals("Employee set name error", "Maxim", employee.getFirstName());
        assertEquals("Employee set age error", 21, employee.getAge());
    }

    public void testEmployeeConstructor2(){
        Employee employee = new Employee(1, "job", "company", 10);

        assertEquals("Error in constructor of Employee, field ID", 1, employee.getEmployeeID());
        assertEquals("Error in constructor of Employee, field Job", "job", employee.getJobTitle());
        assertEquals("Error in constructor of Employee, field company","company", employee.getCompanyName());
    }

    public void testEmployeeConstructor3(){
        Employee employee = new Employee("Maxim", 21);

        assertEquals("Error in third constructor of Employee, field Name", "Maxim", employee.getFirstName());
        assertEquals("Error in third constructor of Employee, field Age", 21, employee.getAge());
    }

    public void testEmployeeIntroduce(){
        Employee employee = new Employee("Maxim", 21);
        employee.setJobTitle("job");
        employee.setCompanyName("company");

        String shouldReturn = "My name is Maxim and I am 21 years old. I am working as job in company.";

        assertEquals("Unexpected result of intro", shouldReturn, employee.introduce());
    }
}
