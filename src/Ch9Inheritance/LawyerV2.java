package src.Ch9Inheritance;

public class LawyerV2 extends EmployeeV2{
    public int getVacationDays(){
        return 15; //3 weeks payed vacation
    }
    public String getVacationForm(){
        return "pink"; //use the pink form
    }
    public void sue(){
        System.out.println("Lawyered!");
    }
}
