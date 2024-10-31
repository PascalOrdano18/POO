package Parciales.SegundosParciales.C2_2023.Ej2;

import java.util.*;

public class PlayerScore<S extends Comparable<? super S>> implements Comparable<PlayerScore<S>>{
    private final String player;
    private final S score;
    private SortedSet<S> scores = new TreeSet<>();


    public PlayerScore(String player, S score) {
        this.player = player;
        this.score = score;
        scores.add(score);
    }

    public String getPlayerName(){
        return player;
    }

    public PlayerScore<S> getPlayer(){
        return this;
    }

    public S getHighScore(){
        S res = scores.getFirst();
        for(S elem : scores){
            if(res.compareTo(elem) < 0){
                res = elem;
            }
        }
        return res;
    }

    public int compareTo(PlayerScore<S> other){
        int cmp = this.getHighScore().compareTo(other.getHighScore());
        if(cmp == 0){
            cmp = player.compareTo(other.player);
        }
        return cmp;
    }




    @Override
    public String toString() {
        return "Player %s scored %s".formatted(player, score);
    }
}
