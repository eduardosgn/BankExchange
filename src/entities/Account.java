package entities;

public class Account {
    private String name;
    private int accNum;
    private double balance;

    public Account(String name, int accNum) {
        this.name = name;
        this.accNum = accNum;
    }

    public Account(String name, int accNum, double balance) {
        this.name = name;
        this.accNum = accNum;
        deposit(balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        this.balance -= value + 5.0;
    }

    @Override
    public String toString() {
        return String.format("Conta %d, Cliente: %s, Saldo: R$ %.2f", accNum, name, balance);
    }
}
