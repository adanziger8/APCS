package src.Ch9Inheritance;

public class MarketerV2 extends EmployeeV2{
    public double getSalary(){
        return 50000.0; //$50,000/year
    }
    public void advertise(){
        System.out.println("Show me the money!");
    }
}
