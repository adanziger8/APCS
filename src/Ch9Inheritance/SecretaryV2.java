package src.Ch9Inheritance;

public class SecretaryV2 {
    public int getHours(){
        return 40; //works 40 hours/week
    }
    public double getSalary(){
        return 40000.0; //$40,000/year
    }
    public int getVacationDays(){
        return 10; //2 weeks payed vacation
    }
    public String getVacationForm(){
        return "yellow"; //use the yellow form
    }
    public void dictation(String text){
        System.out.println("Nice words!" + text);
    }
}
