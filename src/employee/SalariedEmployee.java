package employee;

public class SalariedEmployee extends Employee {

    public SalariedEmployee(Benefits benefits, String firstName, String lastName, EmployeeType employeeType,Double salary) {
        super(benefits, firstName, lastName, employeeType, salary);
    }

    @Override
    public void submitTimeSheet() {
        Payroll payroll = new Payroll((this));
        setPaySummary(payroll.toString());
    }

}
