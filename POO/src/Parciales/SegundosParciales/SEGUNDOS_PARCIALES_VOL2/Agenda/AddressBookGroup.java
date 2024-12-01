package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.Agenda;

public class AddressBookGroup implements Comparable<AddressBookGroup>{


    private final String name;


    public AddressBookGroup(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(AddressBookGroup other){
        return this.name.compareTo(other.name);
    }


}

