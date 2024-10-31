package Parciales.PrimerosParciales.Reports;

public interface ReportCollection <R>{

    void add(R report);

    R get(int index);

    R[] reports();
}
