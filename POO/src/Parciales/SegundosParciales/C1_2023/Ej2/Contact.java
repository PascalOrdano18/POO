package Parciales.SegundosParciales.C1_2023.Ej2;

public class Contact implements Comparable<Contact> {


    private String name;
    private final String phoneNumber;


    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    @Override
    public String toString() {
        return "| %s has %s as phone number |".formatted(name, phoneNumber);
    }

    public int compareTo(Contact other){
        int cmp = name.compareTo(other.name);
        if(cmp == 0){
            cmp = phoneNumber.compareTo(other.phoneNumber);
        }
        return cmp;
    }
}

