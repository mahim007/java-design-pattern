package structural.adapter;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap employee;
    public EmployeeAdapterLdap(EmployeeLdap employeeFromLadp) {
        employee = employeeFromLadp;
    }

    @Override
    public String getId() {
        return employee.getCn();
    }

    @Override
    public String getFirstName() {
        return employee.getGivenName();
    }

    @Override
    public String getLastName() {
        return employee.getSurname();
    }

    @Override
    public String getEmail() {
        return employee.getMail();
    }
}
