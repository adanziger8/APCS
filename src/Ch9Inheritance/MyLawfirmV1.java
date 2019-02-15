package src.Ch9Inheritance;
//this client program instantiates
public class MyLawfirmV1 {
    public static void main(String[] args){
        LawyerV2 gaby = new LawyerV2();
        SecretaryV2 andrew = new SecretaryV2();
        MarketerV2 charlie = new MarketerV2();

        printInfo(gaby);
        printInfo(andrew);
        printInfo(charlie);

        System.out.println("Salary: " + gaby.getSalary());
        System.out.println("Vacation Days: " + gaby.getVacationDays());

        System.out.println("Salary: " + andrew.getSalary());
        System.out.println("Vacation Days: " + andrew.getVacationDays());

        System.out.println("Salary: " + charlie.getSalary());
        System.out.println("Vacation Days: " + charlie.getVacationDays());

    }
    public static void printInfo(EmployeeV2 staff){
        System.out.println("staff salary: " + staff.getSalary());
        System.out.println("staff vacation days: " + staff.getVacationDays());

    }
}
