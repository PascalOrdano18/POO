package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C2A2023.Ej1;

import com.sun.source.tree.Tree;

import java.time.LocalDate;
import java.util.*;

public class GDrive {
    private Map<String, SortedSet<Event>> registers = new HashMap<>();
                // workarea -> event

    private Map<String, String> workAreaByFile = new HashMap<>();
                // workarea -> file
    public void addFileToWorkArea(String file, String workArea){
        if(workAreaByFile.containsKey(file)){
            throw new IllegalArgumentException();
        }
        workAreaByFile.put(file, workArea);
    }

    public void logEvent(String file, String user, LocalDate date, EventType type){
        Event event = new Event(file, user, date, type);
        registers.put(file, registers.getOrDefault(file, new TreeSet<>()));
        registers.get(file).add(event);
    }

    public SortedSet<Event> events(String workArea){
        return registers.getOrDefault(workArea, new TreeSet<>());
    }

    public Event earliestEvent(String workArea){
        return registers.getOrDefault(workArea, new TreeSet<>()).first();
    }

    public Event mostRecentEvent(String workArea){
        return registers.getOrDefault(workArea, new TreeSet<>()).last();
    }


}
