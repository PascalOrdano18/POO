package Parciales.PrimerosParciales.Loan;

public enum Destinatary {
        PERSONAL(50000, 12),
        VEHICLE(300000, 24),
        HOME(1000000, 360);

        final int maxAmount;
        final int maxInstallments;

        Destinatary (int maxAmount, int maxInstallments){
                this.maxAmount = maxAmount;
                this.maxInstallments = maxInstallments;
        }
}
