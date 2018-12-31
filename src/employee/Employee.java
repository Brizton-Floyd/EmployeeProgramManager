package employee;

public abstract class Employee {

    private Benefits benefits;
    private String firstName;
    private String lastName;
    private EmployeeType employeeType;
    private Double annualSalary;
    String paySummary;

    public Employee(Benefits benefits, String firstName, String lastName, EmployeeType employeeType, Double annualSalary) {
        this.benefits = benefits;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeType = employeeType;
        this.annualSalary = annualSalary;
    }

    public Employee(Benefits benefits, String firstName, String lastName, EmployeeType employeeType) {
        this.benefits = benefits;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeType = employeeType;
    }

    public abstract void submitTimeSheet();

    protected void setPaySummary(String paySummary) {
        this.paySummary = paySummary;
    }

    public String getBenefits() {
        return benefits.getHealthCareProvider();
    }

    public Double getAnnualSalary() {
        return annualSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    @Override
    public String toString() {
        return String.format("Full Name: %1s %2s \n" +
                             "Employee Type: %3s \n" +
                             "%4s" +
                             "\nBenefits: %5s",firstName,lastName,getEmployeeType().getEmpType(),paySummary, benefits.getHealthCareProvider());
    }
}
