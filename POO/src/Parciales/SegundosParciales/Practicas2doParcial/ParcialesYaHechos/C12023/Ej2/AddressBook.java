package Parciales.SegundosParciales.Practicas2doParcial.ParcialesYaHechos.C12023.Ej2;

import com.sun.source.tree.Tree;

import java.util.*;

public class AddressBook {

    Map<AddressBookGroup, Map<String, Contact>> collection = new TreeMap<>();

    public void addContact(AddressBookGroup group, String name, String phoneNumber){
        Contact newContact = new Contact(name, phoneNumber);
        collection.putIfAbsent(group, new TreeMap<>());
        collection.get(group).put(name, newContact);
    }

    public String getContact(AddressBookGroup group, String name){
        if(collection.get(group) == null || collection.getOrDefault(group, new TreeMap<>()).get(name) == null){
            throw new IllegalArgumentException("Contact %s does not exist for group %s".formatted(name, group));
        }
        return collection.get(group).get(name).toString();
    }

    public List<Contact> getAllContacts(AddressBookGroup group){
        List<Contact> res = new ArrayList<>();
        Iterator<Contact> it = collection.getOrDefault(group, new TreeMap<>()).values().iterator();

        while(it.hasNext()){
            res.add(it.next());
        }
        return res;
    }

    public List<Contact> getAllContacts(){
        List<Contact> toReturn = new ArrayList<>();
        for(AddressBookGroup g : collection.keySet()){
            toReturn.addAll(getAllContacts(g));
        }
        return toReturn;
    }

    public void renameContact(AddressBookGroup group, String from, String to){
        if(collection.getOrDefault(group, new TreeMap<>()).get(from) == null){
            throw new IllegalArgumentException("No such contact exists");
        }
        collection.get(group).get(from).setName(to);
    }




}
