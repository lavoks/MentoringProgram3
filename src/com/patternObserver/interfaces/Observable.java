package com.patternObserver.interfaces;

public interface Observable {
    void subscribe(Observer observer);
    void generateEvents(String data);
}
