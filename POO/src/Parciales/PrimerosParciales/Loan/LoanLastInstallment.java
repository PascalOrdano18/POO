package Parciales.PrimerosParciales.Loan;

import java.time.LocalDate;

public class LoanLastInstallment extends Loan{

    private int lastInstallmentPaid;

    public LoanLastInstallment(double amount, LocalDate date, int installments, Destinatary destinatary){
        super(amount, date, installments, destinatary);
    }

    @Override
    public void pay(int installment, LocalDate date){
        if(lastInstallmentPaid != installment - 1){
            throw new LoanException("Cannot pay");
        }
        super.pay(installment, date);
        lastInstallmentPaid = installment;
    }

    @Override
    public String toString(){
        return super.toString() + " Last quota: %d".formatted(lastInstallmentPaid);
    }


}
