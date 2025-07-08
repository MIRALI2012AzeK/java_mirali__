import org.w3c.dom.ls.LSOutput;

public class AccesBank {
    public static void main(String[] args) {
        SavingsAccount savingsacc = new SavingsAccount("Мирали Мансуров");
        BusinessAccount businessacc = new BusinessAccount("Мансуров Мирали");

        savingsacc.OpenAcc();
        savingsacc.Deposit(1000);
        savingsacc.printInfo();
        System.out.println("-------------------------");

        businessacc.OpenAcc();
        businessacc.printInfo();
    }
}


abstract class BankAccount {
    String AccountHolder;
    double balance = 0;

    BankAccount(String AccountHolder) {
        this.AccountHolder = AccountHolder;
    }

    abstract void OpenAcc();
    abstract void Deposit(double amount);

    void printInfo(){
        System.out.println("Владелец счета: " + this.AccountHolder);
        System.out.println("Баланс: " + this.balance);
    }
}


class SavingsAccount extends BankAccount {

    SavingsAccount(String AccountHolder) {
        super(AccountHolder);
    }

    @Override
    void OpenAcc() {
        System.out.println("Счет открыт для: " + this.AccountHolder);
    }

    @Override
    void Deposit(double amount) {
        this.balance += amount;
        System.out.println("Внесено на счёт: " + amount);
    }

}

class BusinessAccount extends BankAccount {

    BusinessAccount(String accountHolder) {
        super(accountHolder);
    }

    @Override
    void OpenAcc() {
        System.out.println("Бизнес-счёт открыт для " + this.AccountHolder);
    }
}
