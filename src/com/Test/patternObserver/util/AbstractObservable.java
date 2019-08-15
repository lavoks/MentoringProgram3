package com.Test.patternObserver.util;

import com.Test.patternObserver.interfaces.Observable;
import com.Test.patternObserver.interfaces.Observer;

public abstract class AbstractObservable implements Observable {

    private Observer[] observers = new Observer[10];
    private int currentPosition = 0;

    @Override
    public void subscribe(Observer observer) {
        observers[currentPosition] = observer;
        currentPosition++;
    }

    protected void notifyAll(String data) {
        if (currentPosition > 0) {


            for (int i = 0; i < currentPosition; i++) {
                observers[i].onEvent(data);

            }
        }
    }
}
