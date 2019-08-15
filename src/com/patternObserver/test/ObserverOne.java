package com.patternObserver.test;

import com.patternObserver.interfaces.Observer;

public class ObserverOne implements Observer {

    public void onEvent(String data) {
        System.out.println("ObserverOne " + data);
    }

//    public void test() {
//
//    }

}
