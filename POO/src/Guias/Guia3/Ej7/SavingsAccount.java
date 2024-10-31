package Guias.Guia3.Ej7;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(int id){
        super(id);
    }

    public boolean canExtract(double amount){
        return balance - amount >= 0;
    }

}
