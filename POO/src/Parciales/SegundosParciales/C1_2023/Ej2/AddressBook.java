package Parciales.SegundosParciales.C1_2023.Ej2;


import com.sun.source.tree.Tree;

import java.util.*;

public class AddressBook {

    private SortedMap<AddressBookGroup, SortedMap<String, Contact>> collection = new TreeMap<>();

    public void addContact(AddressBookGroup addressBookGroup, String name, String number){
        collection.putIfAbsent(addressBookGroup, new TreeMap<>());
        collection.get(addressBookGroup).put(name, new Contact(name, number));
    }

    public String getContact(AddressBookGroup addressBookGroup, String name){
        if(collection.get(addressBookGroup) == null || collection.getOrDefault(addressBookGroup, new TreeMap<>()).get(name) == null){
            throw new IllegalArgumentException("No existe este contacto en el grupo");
        }
        return collection.get(addressBookGroup).get(name).toString();
    }


    public List<Contact> getAllContacts(){
        List<Contact> list = new ArrayList<>();
        for(Map.Entry<AddressBookGroup, SortedMap<String, Contact>> group: collection.entrySet()){
            for(Map.Entry<String, Contact> elem : group.getValue().entrySet()){
                list.add(elem.getValue());
            }
        }
        return list;
    }

    public List<Contact> getAllContacts(AddressBookGroup group){
        List<Contact> list = new ArrayList<>();
        for(Map.Entry<String, Contact> elem : collection.getOrDefault(group, new TreeMap<>()).entrySet()){
            list.add(elem.getValue());
        }
        return list;
    }

    public void renameContact(AddressBookGroup group, String from, String to){
        collection.getOrDefault(group, new TreeMap<>()).get(from).setName(to);
    }

}
