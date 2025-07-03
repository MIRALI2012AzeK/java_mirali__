package Polyporphism;

public class Polyporhpismdz {
    public static void main(String[] args) {
    BankAccount[] bankAccounts = {
            new SavingsAccount(),
            new CheckingAccount(),
            new BusinessAccount()
    };

    for (BankAccount account : bankAccounts) {
        account.accountType();
        account.deposit(1000);
        account.withdraw(450.50);
        System.out.println("Current balance: "+ account.balance);
        System.out.println("--------------------------------------");
    }

    }
}


class BankAccount {
    double balance = 0;


    void withdraw(double amount){
        balance -= amount;
        System.out.println("Было снято:" + amount);
    }

    void deposit (double amount){
        balance += amount;
        System.out.println("Депозит:" + amount);
    }

    void accountType(){
        System.out.println("Банковский счет");
    }
    }


    class SavingsAccount extends BankAccount {
    @Override
        void withdraw (double amount){
        balance -= amount;
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
        balance += amount;
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
