package Guias.Guia3.Ej7;

public abstract class BankAccount {
    private final int id;
    protected double balance;

    protected BankAccount(int id){
        this.id = id;
    }
    public double deposit(double amount){
        return balance += amount;
    }

    public double extract(double amount){
        if(!canExtract(amount)){
            throw new RuntimeException("no es posible realizar la operacion");
        }
        return balance -= amount;
    }

    protected abstract boolean canExtract(double amount);   // Depende de cada clase hija implementar este metodo segun corresponda

    double getBalance(){
        return balance;
    }

    public String toString(){
        return "Cuenta %d con saldo %.2f".formatted(id, balance);
    }
}
