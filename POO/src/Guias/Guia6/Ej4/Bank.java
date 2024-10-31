package Guias.Guia6.Ej4;


import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<BankAccount> accounts = new ArrayList<BankAccount>();

    public void addAccount(BankAccount acc){
        accounts.add(acc);
    }

    public int accountSize(){
        return accounts.size();
    }

    public double totalAmount(){
        double totalAmount = 0;
        for(BankAccount acc : accounts){
            totalAmount += acc.balance;
        }
        return totalAmount;
    }

    public void removeAccount(BankAccount acc){
        accounts.remove(acc);
    }

}
