package Guias.Guia3.Ej8;

import java.util.Arrays;

public class CellPhoneBill {
    protected String number;
    protected Call[] calls;
    protected int callsIndex;

    private static final int DEFAULT_SIZE = 10;

    CellPhoneBill(String number) {
        this.number = number;
        this.calls = new Call[DEFAULT_SIZE];
    }

    public void registerCall(String toNumber, int duration) {
        addCall(new Call(number, toNumber, duration));
    }

    protected void addCall(Call call) {
        if(callsIndex == calls.length) {
            resize();
        }
        calls[callsIndex++] = call;
    }
    // PODRIA SER ABSTRACTO ESTE METODO (SI HAGO LA CLASE ABSTRACTA)??? DE MODO QUE LLAMO SIEMPRE AL PROCESSBILL DE FRIENDCELLPHONEBILL
    public double processBill() {
        double total = 0;
        for (int i = 0; i < callsIndex; i++) {
            total += calls[i].getCost();
        }
        return total;
    }

    protected void resize() {
        calls = Arrays.copyOf(calls, calls.length + DEFAULT_SIZE);
    }

}
