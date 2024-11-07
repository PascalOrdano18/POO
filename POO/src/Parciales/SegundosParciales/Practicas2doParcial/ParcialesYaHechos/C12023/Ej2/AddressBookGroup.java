package Parciales.SegundosParciales.Practicas2doParcial.ParcialesYaHechos.C12023.Ej2;

public class AddressBookGroup implements Comparable<AddressBookGroup>{


    private final String name;


    public AddressBookGroup(String name) {
        this.name = name;
    }

    public int compareTo(AddressBookGroup other){
        return name.compareTo(other.name);
    }


}

