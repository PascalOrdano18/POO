package Guias.Guia7.Ej6;

import java.util.*;

public class MultiMapImpl<K, V extends Comparable<? super V>> implements MultiMap<K, V>{

    private Map<K, Set<V>> multiMap = new HashMap<>();

    @Override
    public void put(K key, V value){
        // Asegura que si la key no esta presente en el mapa, se inserta en el Map un nuevo treeSet asociado a esa clave
        multiMap.putIfAbsent(key, new TreeSet<>(Comparator.reverseOrder()));
        // Una vez se sabe que existe la key con su treeSet, se obtiene el treeSet asociado a la key y se agrega el value
        multiMap.get(key).add(value);
    }

    @Override
    public int size(){
        int res = 0;
        for(Set<V> value : multiMap.values()){
            res += value.size();
        }
        return res;
    }

    @Override
    public int size(K key){
        // getOrDefault para manejar el caso que devuelve null
        return multiMap.getOrDefault(key, new TreeSet<>()).size();
    }

    @Override
    public void remove(K key){
        multiMap.remove(key);
    }

    @Override
    public void remove(K key, V value){
        // El getOrDefault devuelve un nuevo treeSet si la key no tenia nada, de modo que se evita obtener un null
        multiMap.getOrDefault(key, new TreeSet<>()).remove(value);
    }

    @Override
    public Iterable<V> get(K key){
        return multiMap.get(key);
    }

}
