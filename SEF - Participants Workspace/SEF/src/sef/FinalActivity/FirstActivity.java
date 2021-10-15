package sef.FinalActivity;

import java.util.ArrayList;

public class FirstActivity {
    public static void main(String[] args) {

        ArrayList<Employee> epmloeeList = new ArrayList();

        epmloeeList.add(new Employee(1, "Programmer", "IT", 20));
        epmloeeList.add(new Employee(2, "Programmer", "IT", 30));
        epmloeeList.add(new Employee(3, "Programmer", "IT", 40));
        epmloeeList.add(new Employee(4, "Programmer", "IT", 50));
        epmloeeList.add(new Employee(5, "Programmer", "IT", 60));

        System.out.println("Biggest salary: " + biggestSalary(epmloeeList));
    }

    private static double biggestSalary(ArrayList<Employee> epmloeeList) {
        double biggest = 0;
        for (Employee employee : epmloeeList) {
           if (biggest < employee.getSalary()){
               biggest = employee.getSalary();
           }
        }
        return biggest;
    }

}