package Parciales.PrimerosParciales.Loan;

import java.time.LocalDate;

public class LoanSpecificDate extends LoanLastInstallment{

    private LocalDate lastPaymentDate;

    public LoanSpecificDate(double amount, LocalDate date, int installments, Destinatary destinatary){
        super(amount, date, installments, destinatary);
        this.lastPaymentDate = date;
    }

    @Override
    public void pay(int installment, LocalDate date){
        if(lastPaymentDate.isAfter(date)){
            throw new LoanException("Cannot pay");
        }
        super.pay(installment, date);
        lastPaymentDate = date;
    }

    @Override
    public String toString(){
        return super.toString() + " Next PayDate: After %s".formatted(lastPaymentDate);
    }

}
