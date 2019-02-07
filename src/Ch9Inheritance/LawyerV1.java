package src.Ch9Inheritance;

public class LawyerV1 {
    public int getHours(){
        return 40; //works 40 hours/week
    }
    public double getSalary(){
        return 40000.0; //$40,000/year
    }
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
