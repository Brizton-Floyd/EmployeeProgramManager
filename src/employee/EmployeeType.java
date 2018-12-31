package employee;

public enum EmployeeType {

    SALARIED("Salaried"),
    HOURLY("Hourly");

    private String empType;

    private EmployeeType(String empType){
        this.empType = empType;
    }

    public String getEmpType() {
        return empType;
    }
}
