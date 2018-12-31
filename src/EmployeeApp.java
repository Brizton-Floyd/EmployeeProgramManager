import employee.*;

//import org.joda.time.LocalTime;
/**
 *
 */
public class EmployeeApp {

    public static void main(String[] args){

//        LocalTime lc = new LocalTime();
//        System.out.println("Local Time Is: " + lc);

        Benefits briztonBenifits = new Benefits("American Health");
        Employee brizton = new SalariedEmployee(briztonBenifits,"Brizton","Floyd", EmployeeType.SALARIED,95000.00);
        brizton.submitTimeSheet();

        System.out.println(brizton);

        System.out.println("\nHourly Employee Information\n");
        Employee alex = new HourlyEmployee(briztonBenifits,"Alex","Diaz",EmployeeType.HOURLY,21.00f);
        alex.submitTimeSheet();

        System.out.println(alex);
    }
}
