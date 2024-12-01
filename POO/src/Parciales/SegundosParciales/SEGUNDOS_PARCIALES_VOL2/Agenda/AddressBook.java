package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.Agenda;

import java.util.*;

public class AddressBook {

    private SortedMap<AddressBookGroup, SortedMap<String, Contact>> contactsByGroup = new TreeMap<>();

    public void addContact(AddressBookGroup group, String name, String phoneNumber){
        if(!contactsByGroup.containsKey(group)){
            contactsByGroup.put(group, new TreeMap<>());
        }
        contactsByGroup.get(group).put(name, new Contact(name, phoneNumber));
    }

    public Contact getContact(AddressBookGroup group, String name){
        if(!contactsByGroup.containsKey(group) || !contactsByGroup.get(group).containsKey(name)){
            throw new IllegalArgumentException();
        }
        return contactsByGroup.get(group).get(name);
    }

    public Collection<Contact> getAllContacts(AddressBookGroup group){
        if(!contactsByGroup.containsKey(group)){
            throw new IllegalArgumentException("Group doesnt exist");
        }
        return contactsByGroup.get(group).values();
    }


    public List<Contact> getAllContacts(){
        List<Contact> res = new ArrayList<>();
        for(AddressBookGroup group : contactsByGroup.keySet()){
            res.addAll(getAllContacts(group));
        }
        return res;
    }


    public void renameContact(AddressBookGroup group, String name, String newName){
        if(!contactsByGroup.containsKey(group) || !contactsByGroup.get(group).containsKey(name)){
            throw new IllegalArgumentException();
        }
        String number = contactsByGroup.get(group).get(name).getPhoneNumber();
        contactsByGroup.get(group).remove(name);
        contactsByGroup.get(group).put(newName, new Contact(newName, number));
    }
}
