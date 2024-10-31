package Guias.Guia3.Ej8;

public class FriendCellPhoneBill extends CellPhoneBill{
    private String[] friends;
    private final int maxFriends;
    private int friendsIndex;
    private double cost;
    private static final double DEFAULT_FRIEND_COST_PER_SECOND = 0;


    public FriendCellPhoneBill(String number, int maxFriends){
        super(number);
        this.maxFriends = maxFriends;
        this.friends = new String[maxFriends];
        this.cost = DEFAULT_FRIEND_COST_PER_SECOND;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public void addFriend(String number) throws TooManyFriendsException, AlreadyExistsFriendException{
        if(friendsIndex == maxFriends){
            throw new TooManyFriendsException(number);
        }
        if(containsFriend(number)){
            throw new AlreadyExistsFriendException(number);
        }
        friends[friendsIndex++] = number;
    }


    private boolean containsFriend(String number){
        for(int i = 0; i < friendsIndex; i++){
            if(friends[i].compareTo(number) == 0){
                return true;
            }
        }
        return false;
    }


    public void removeFriend(String number){
        boolean found = false;
        for(int i = 0; i < friendsIndex && !found; i++){
            if(friends[i].compareTo(number) == 0) {
                found = true;
                friends[i] = friends[friendsIndex--];  // estoy pisando el number que quiero borrar con el ultimo number del array y achicando friendsIndex
            }
        }
    }


    @Override
    public void addCall(Call call){
        if(callsIndex != maxFriends) {
            calls[callsIndex++] = call;
        } else {
            System.out.println("No se puede bro");
        }
    }

    @Override
    public double processBill() {
        double total = 0;
        for(int i = 0; i < callsIndex; i++){
            boolean friendFound = false;
            for(int j = 0; j < friendsIndex && !friendFound; j++){
                if(friends[i].compareTo(calls[i].toString()) == 0){
                    friendFound = true;
                    total += calls[i].getCost() * cost;
                }
            }
            total += calls[i].getCost();
        }
        return total;
    }

}
