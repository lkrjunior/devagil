package com.makeryourevent.main;

import com.makeryourevent.repository.EventRepository;

public class MainClass {

    public static void main(String args[]) {
        System.out.print("Hello World");

        EventRepository repository = new EventRepository();

        System.out.print(repository.getListOfEvents().size());
    }
}
