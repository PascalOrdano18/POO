package Parciales.SegundosParciales.C2_2022.Ej2;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class MultilingualDictionary {
    Map<Language, Map<String, String>> dict;
    private Language origin;

    public MultilingualDictionary(Language origin){
        this.origin = origin;
        this.dict = new EnumMap<>(Language.class);
    }

    public MultilingualDictionary addTranslation(String word, Language lang, String translation){
        if(origin.equals(lang)){
            throw new IllegalArgumentException("Cannot add %s translations".formatted(lang));
        }
        dict.putIfAbsent(lang, new HashMap<>());
        dict.get(lang).putIfAbsent(word, translation);
        return this;
    }

    public String getTranslation(String word, Language lang){
        if(dict.getOrDefault(lang, new HashMap<>()).get(word) == null){
            throw new IllegalArgumentException("The word %s has no translation in the language %s".formatted(word, lang));
        }
        return dict.get(lang).get(word);
    }

    public int translationsCount(Language lang){
        return dict.getOrDefault(lang, new HashMap<>()).size();
    }

    public int removeTranslations(Language lang){
        int res = translationsCount(lang);
        dict.put(lang, new HashMap<>());
        return res;
    }



}
