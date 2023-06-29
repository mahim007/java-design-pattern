package structural.adapter;

public class EmployeeAdapterCSV implements Employee {
    private EmployeeCSV employee;

    public EmployeeAdapterCSV(EmployeeCSV employeeCSV) {
        this.employee = employeeCSV;
    }

    @Override
    public String getId() {
        return String.valueOf(employee.getId());
    }

    @Override
    public String getFirstName() {
        return employee.getFirstname();
    }

    @Override
    public String getLastName() {
        return employee.getLastname();
    }

    @Override
    public String getEmail() {
        return employee.getEmailAddress();
    }
}
