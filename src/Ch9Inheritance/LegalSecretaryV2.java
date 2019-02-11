package src.Ch9Inheritance;

public class LegalSecretaryV2 {
    public int getHours(){
        return 40; //works 40 hours/week
    }
    public double getSalary(){
        return 45000.0; //$45,000/year
    }
    public int getVacationDays(){
        return 10; //2 weeks payed vacation
    }
    public String getVacationForm(){
        return "yellow"; //use the yellow form
    }
    public void prepLegalDocuments(){
        System.out.println("Prepared!");
    }
}
