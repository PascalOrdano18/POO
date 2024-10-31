package Guias.Guia7.Ej4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ranker {

    private Set<RankedBook> rankedBooks = new TreeSet<>();

    public Ranker add(Genre genre, Book book){
        rankedBooks.add(new RankedBook(book, genre));
        return this;
    }


    public void rateUp(Book book){
        boolean found = false;
        Iterator<RankedBook> rankedBooksIterator = rankedBooks.iterator();

        while(rankedBooksIterator.hasNext() && !found){
            RankedBook current = rankedBooksIterator.next();
            if(current.book.equals(book)){
                found = true;
                rankedBooksIterator.remove();   // remuevo current y lo vuelvo a agregar con mas puntaje
                rankedBooks.add(new RankedBook(current));
            }
        }
        if(!found){
            rankedBooks.add(new RankedBook(book));
        }
    }

    public void printRanking(Genre genre){
        System.out.println("Ranking of " + genre);
        for(RankedBook book : rankedBooks){
            if(book.genre.equals(genre)){
                System.out.println(book);
            }
        }
    }

    public void printRanking(){
        System.out.println("General Ranking");
        for(RankedBook book : rankedBooks){
            System.out.println(book);
        }
    }


}
