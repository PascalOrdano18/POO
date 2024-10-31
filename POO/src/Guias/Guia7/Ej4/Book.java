package Guias.Guia7.Ej4;

import java.util.Objects;

public class Book implements Comparable<Book>{

    private final String name, author;

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    @Override
    public int compareTo(Book o){
        int nameCmp = this.name.compareTo(o.name);
        if(nameCmp != 0){
            return nameCmp;
        }
        return this.author.compareTo(o.author);
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Book bookObj &&
                this.name.equals(bookObj.name) &&
                this.author.equals(bookObj.author);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, author);
    }


}
