package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C1A2023.Ej1;

import java.util.*;

public class ReviewManager {

    public SortedMap<String, UserLevel> users = new TreeMap<>(Comparator.reverseOrder());
    public SortedMap<String, List<String>> reviews = new TreeMap<>();
            // product -> reviews

    private boolean validateUser(String name){
        return users.containsKey(name);
    }

    public void addUser(String name, UserLevel level){
        if(validateUser(name)){
            throw new IllegalArgumentException("User already exists");
        }
        users.put(name, level);
    }

    public void addReview(String name, String product, String review){
        if(!validateUser(name)){
            throw new IllegalArgumentException("User doesnt exist");
        }
        if(!users.get(name).canReview(reviews.getOrDefault(product, new ArrayList<>()).size())){
            throw new IllegalArgumentException("User cannot review");
        }
        if(reviews.get(product) == null){
            reviews.put(product, new ArrayList<>());
        }
        reviews.get(product).add(review);
    }

    public List<String> getReviews(String product){
        return reviews.getOrDefault(product, new ArrayList<>());
    }


    public Set<String> getProducts(){
        return reviews.keySet();
    }

    public Set<String> getUsers(){
        return users.keySet();
    }

}
