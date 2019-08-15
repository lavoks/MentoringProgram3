package com.Test.patternObserver.test;

import com.Test.patternObserver.interfaces.Observer;

public class ObserverTwo implements Observer {

    public void onEvent(String data) {
        System.out.println("ObserverTwo " + data);

    }

}
