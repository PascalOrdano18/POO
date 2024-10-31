package Parciales.PrimerosParciales.Loan;

import java.time.LocalDate;

public class Loan {

    private final double amount;
    private final LocalDate date;
    private  int installments;
    private final Destinatary destinatary;

    public Loan(double amount, LocalDate date, int installments, Destinatary destinatary){
        if(amount <= 0 || installments <= 0 || amount > destinatary.maxAmount || installments > destinatary.maxInstallments){
            throw new LoanException("Cannot pay");
        }
        this.amount = amount;
        this.date = date;
        this.installments = installments;
        this.destinatary = destinatary;
    }

    public void pay(int installment, LocalDate date){
        if(installments <= 0 || date.isBefore(this.date)){
            throw new LoanException("Cannot pay");
        }
        installments--;
    }

    public String toString(){
        return "%s Loan of %.1f. Remaining quota: %d.".formatted(destinatary, amount, installments);
    }


}
