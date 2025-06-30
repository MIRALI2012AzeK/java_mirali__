package Polyporphism;

public class Polyporhpismdz {
    public static void main(String[] args) {
    BankAccount bankacc = new BankAccount();
    bankacc.balance = 2500;
    bankacc.deposit(500);
    bankacc.withdraw(1000);
    bankacc.accountType();
    }
}


class BankAccount {
    double balance;


    void withdraw(double amount){
        System.out.println("----");
    }

    void deposit (double amount){
    }

    void accountType(){
        System.out.println("----");
    }
    }


    class SavingsAccount extends BankAccount {
    @Override
        void withdraw (double amount){
        System.out.println("Снятие со сберегательного счета");
    }

    @Override
        void accountType() {
        System.out.println("Сберегательный счет");
    }
    }

    class CheckingAccount extends BankAccount {
    @Override
    void withdraw(double amount) {
        System.out.println("Снятие с расчетного счета");
    }

        @Override
        void accountType() {
            System.out.println("Расчетный счет");
        }
    }

class BusinessAccount extends BankAccount {
    @Override
    void withdraw(double amount) {
        System.out.println("Снятие с бизнес-счета");
    }

    @Override
    void accountType() {
        System.out.println("Бизнес счет");
    }
}
