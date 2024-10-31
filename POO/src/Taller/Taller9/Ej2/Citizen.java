package Taller.Taller9.Ej2;

public class Citizen implements Comparable<Citizen>{
    private int DNI;
    private String name;
    private String lastName;

    public Citizen(int DNI, String name, String lastName){
        this.DNI = DNI;
        this.name = name;
        this.lastName = lastName;
    }

    public int getDNI(){
        return DNI;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }

    @Override
    public int compareTo(Citizen citizen){
        int cmp = this.name.compareTo(citizen.name);
        if(cmp == 0){
            cmp = Integer.compare(this.DNI, citizen.DNI);
        }
        return cmp;
    }

}

