package Parciales.SegundosParciales.C1_2023.Ej2;

public class AddressBookGroup implements Comparable<AddressBookGroup> {

    private final String name;

    public AddressBookGroup(String name) {
        this.name = name;
    }

    public int compareTo(AddressBookGroup other){
        return name.compareTo(other.name);
    }
}

