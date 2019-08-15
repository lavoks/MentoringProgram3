package com.Test.patternObserver.test;

import com.Test.patternObserver.interfaces.Observer;

public class ObserverOne implements Observer {

    public void onEvent(String data) {
        System.out.println("ObserverOne " + data);
    }

//    public void test() {
//
//    }

}
