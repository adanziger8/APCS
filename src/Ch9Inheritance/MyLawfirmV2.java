package src.Ch9Inheritance;
//this client program instantiates
public class MyLawfirmV2 {
    public static void main(String[] args){
        EmployeeV2[] myEmployees = {new LawyerV2("Gaby"),
                                new SecretaryV2("Andrew"),
                                new MarketerV2("Charlie")};
        printInfo(myEmployees);


    }

    public static void printInfo(EmployeeV2[] staff){
        for(int i = 0; i < staff.length; i++) {
            System.out.println("staff salary: " + staff[i].getSalary());
            System.out.println("staff vacation days: " + staff[i].getVacationDays());
        }
    }
}
