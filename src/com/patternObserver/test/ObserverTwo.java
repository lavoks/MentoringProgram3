package com.patternObserver.test;

import com.patternObserver.interfaces.Observer;

public class ObserverTwo implements Observer {

    public void onEvent(String data) {
        System.out.println("ObserverTwo " + data);

    }

}
