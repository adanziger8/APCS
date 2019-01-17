package Ch8Classes;

public class BankAccountClient {
    public static void main(String[] args) {
        BankAccountV1 andrew = new BankAccountV1("Andrew", 123456789, "123 Sesame St.", 20802);
        andrew.deposit(10000);
        System.out.println(andrew);
        andrew.withdraw(500);
        System.out.println("New Balance: " + andrew.getBalance());

    }
}
