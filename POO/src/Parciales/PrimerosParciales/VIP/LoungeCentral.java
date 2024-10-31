package Parciales.PrimerosParciales.VIP;

public class LoungeCentral {
    private boolean isOpen = true;


    public void openLounges() {
        isOpen = true;
    }


    public void closeLounges() {
        isOpen = false;
    }


    public boolean isOpen() {
        return isOpen;
    }
}

