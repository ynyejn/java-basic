package oop1.ex;

public class Account {
    int balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance -= amount;
    }
}
