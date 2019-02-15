package src.Ch9Inheritance;

public class LegalSecretaryV2 extends SecretaryV2 {
    public double getSalary(){
        return 45000.0; //$45,000/year
    }

    public void prepLegalDocuments(){
        System.out.println("Prepared!");
    }
}
