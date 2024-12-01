package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C2A2022.Ej2;

import java.util.*;

public class PasswordManager {

    private SortedMap<String, SortedMap<String, String>> passForVault = new TreeMap<>();
    //          Vault -> (Site -> password)
    private Map<String, Policies> policyVault = new HashMap<>();
    //          Vault -> policy

    public void addVault(String vault, Policies policy){
        if(policyVault.containsKey(vault)){
            throw new IllegalArgumentException("Vault already exists");
        }
        policyVault.put(vault, policy);
        passForVault.put(vault, new TreeMap<>());
    }

    public void addPassword(String vault, String site, String password){
        if(!policyVault.containsKey(vault)){
            throw new IllegalArgumentException("Invalid Vault");
        }
        if(!policyVault.get(vault).passwordIsValid(password)){
            throw new IllegalArgumentException("Password does not comply vault policy");
        }
        passForVault.getOrDefault(vault, new TreeMap<>()).put(site, password);
    }

    public String getPassword(String vault, String site){
        if(!policyVault.containsKey(vault)){
            throw new IllegalArgumentException("Invalid Vault");
        }
        if(!passForVault.get(vault).containsKey(site)){
            throw new IllegalArgumentException("Nonexistent website in vault");
        }
        return passForVault.get(vault).get(site);
    }

    public void changeVaultPolicy(String vault, Policies policy){
        if(!policyVault.containsKey(vault)){
            throw new IllegalArgumentException("Invalid Vault");
        }
        policyVault.put(vault, policy);
    }


    public List<String> getInvalidPasswords(String vault){
        List<String> res = new ArrayList<>();
        for(String site : passForVault.get(vault).keySet()){
            if(!policyVault.get(vault).passwordIsValid(passForVault.get(vault).get(site))){
                res.add(site);
            }
        }
        return res;
    }

    public List<String> getInvalidPasswords(){
        List<String> sitesWithInvalidPasswords = new ArrayList<>();
        for(String vault : passForVault.keySet()){
            sitesWithInvalidPasswords.addAll(getInvalidPasswords(vault));
        }
        return sitesWithInvalidPasswords;
    }

}
