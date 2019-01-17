//simulate a simple checking account
package Ch8Classes;

public class BankAccountV1 {
    private double balance;
    private String name;
    private int acctnum;
    private int ssn;
    private int pin;
    private String address;
    private int dob;

    public BankAccountV1 (String name, int ssn, String address, int dob) {
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;
    }

    public BankAccountV1(String name, int ssn, String address, int dob, double balance, int pin){
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;
        this.balance = balance;
        this.pin = pin;
    }
//GETTERS
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getAcctnum() {
        return acctnum;
    }


    public int getPin() {
        return pin;
    }

    public String getAddress() {
        return address;
    }

    public int getDob() {
        return dob;
    }
//SETTERSs
    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double cash){
        balance += cash;
    }
    //overrise the object's built-in toString() method
    public String toString(){
        return "Name:" + name + "\nBalance:" + balance;
    }
    //public void deposit(String check){
    //}
    public void setAddress(String address) {
        this.address = address;
    }


}
