package Guias.Guia6.Ej4;

import Guias.Guia6.Ej4.BankAccount;

public class CheckingAccount extends BankAccount {

    private final double overdraft;

    public CheckingAccount(int id, double overdraft){
        super(id);
        this.overdraft = overdraft;
    }

    protected boolean canExtract(double amount){
        return balance + overdraft - amount >= 0;
    }

    public double getOverdraft(){
        return overdraft;
    }



}
