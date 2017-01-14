package com.example.iliqn.example.model;

import java.util.HashMap;

/**
 * Created by iliqn on 14-Jan-17.
 */
public class EventManager {

    private static EventManager ourInstance;
    private HashMap<String,Event> events;
    public static EventManager getInstance() {
        if(ourInstance==null){
            ourInstance = new EventManager();
        }
        return ourInstance;
    }

    private EventManager() {
        events = new HashMap<>();
        loadEvents();
    }

    public void addEvent(Event e) {
        events.put(e.getName(),e);
        //send update to db
    }

    private void loadEvents(){
        //Load events from server and put in map
    }


    public HashMap<String, Event> showEventsbyCurrentLocation(){
        return null;
    }

    public HashMap<String, Event> showAllEvents(){
        return events;
    }
    public HashMap<String, Event> searchEvents(String eventName){
        HashMap<String, Event> result = new HashMap<>();
        if(events.containsKey(eventName)){
            Event e = events.get(eventName);
            result.put(e.getName(),e);
            return result;
        }else{
            return null;
        }
    }

}
