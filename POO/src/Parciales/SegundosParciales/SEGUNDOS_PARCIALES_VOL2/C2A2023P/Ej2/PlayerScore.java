package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C2A2023P.Ej2;

public class PlayerScore<S extends Comparable<? super S>> implements Comparable<PlayerScore<S>>{
    private final String player;
    private final S score;


    public PlayerScore(String player, S score) {
        this.player = player;
        this.score = score;
    }


    @Override
    public String toString() {
        return "Player %s scored %s".formatted(player, score);
    }


    @Override
    public int compareTo(PlayerScore<S> other){
        int cmp = other.score.compareTo(this.score);
        if(cmp == 0){
            cmp = this.player.compareTo(other.player);
        }
        return cmp;
    }

}

