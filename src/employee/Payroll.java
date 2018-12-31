package employee;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Payroll {

    private double annualSalary;
    private double biWeeklyPayGrossPay;
    private double mounthlyPay;
    private double biWeeklyNetPay;
    private float taxRate;

    Payroll(Employee employee){
        process(employee);
    }

    private void process(Employee employee){
        final EmployeeType type =  employee.getEmployeeType();
        switch (type){
            case SALARIED:
                calculatePayForSalariedEmp(employee);
                break;
            case HOURLY:
                calculatePayForHourly(employee);
                break;
            default:
                break;
        }
    }

    private void calculatePayForHourly(Employee employee) {
        HourlyEmployee hourlyEmployee = (employee instanceof HourlyEmployee) ? (HourlyEmployee)employee : null;
        if(hourlyEmployee != null) {
            final int hoursWorked = hourlyEmployee.getHoursWorked();
            final float wage = hourlyEmployee.getHourlyWage();

            final int biWeeklyHours = hoursWorked * 2;
            this.annualSalary = round(((biWeeklyHours*2) * wage) * 12,2);
            this.biWeeklyPayGrossPay = round((this.annualSalary/12)/2, 2);
            this.mounthlyPay = this.biWeeklyPayGrossPay*2;
        }
    }

    private void calculatePayForSalariedEmp(Employee employee) {
        this.annualSalary = employee.getAnnualSalary();
        this.biWeeklyPayGrossPay = round((annualSalary / 12) / 2,2);
        this.mounthlyPay = biWeeklyPayGrossPay * 2;
    }

    private  double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    @Override
    public String toString() {
        return "Annual Salary: $" + this.annualSalary +
                "\nBi-Weekly Gross: $" + this.biWeeklyPayGrossPay +
                "\nMonthly Pay: $" + this.mounthlyPay;
    }
}
