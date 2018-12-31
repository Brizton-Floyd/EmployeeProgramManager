package employee;

public class HourlyEmployee extends Employee {

    private float hourlyWage;
    private int hoursWorked;

    public HourlyEmployee(Benefits benefits, String firstName, String lastName, EmployeeType employeeType, float hourlyWage) {
        super(benefits, firstName, lastName, employeeType);
        this.hourlyWage = hourlyWage;
        hoursWorked = 40;
    }

    public float getHourlyWage() {
        return hourlyWage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public void submitTimeSheet() {
        Payroll payroll = new Payroll((this));
        setPaySummary(payroll.toString());
    }

}
