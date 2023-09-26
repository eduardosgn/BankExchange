package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account acc;

        System.out.print("Digite um número para a conta: ");
        int accNum = sc.nextInt();

        System.out.print("Digite o nome do novo cliente: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Deseja efetuar um depósito na nova conta? (s/n)");
        char result = sc.next().charAt(0);

        if (result == 's') {
            System.out.print("Quanto deseja depositar na nova conta? R$ ");
            double newDeposit = sc.nextDouble();
            acc = new Account(name, accNum, newDeposit);
        } else {
            acc = new Account(name, accNum);
        }

        System.out.println("Dados da nova conta:");
        System.out.println(acc + "\n");

        System.out.print("Faça um depósito na conta nova, insira um valor: R$");
        double depositValue = sc.nextDouble();
        acc.deposit(depositValue);
        System.out.println("Dados atualizados da conta:");
        System.out.println(acc + "\n");

        System.out.print("Faça um saque na conta nova, insira um valor para saque: R$");
        double withdrawValue = sc.nextDouble();
        acc.withdraw(withdrawValue);
        System.out.println("Dados atualizados da conta:");
        System.out.println(acc + "\n");

        sc.close();
    }
}
