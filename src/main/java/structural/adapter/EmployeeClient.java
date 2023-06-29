package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "johnwick@gmail.com");
        employees.add(employeeFromDB);

        EmployeeLdap employeeFromLdap = new EmployeeLdap("4321", "Solo", "Han", "hansolo@gmail.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("1290,Sherlok,Holmes,sherlokholmes@gmail.com");
        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;
    }

}
