package com.Test.patternObserver.test;

import com.Test.patternObserver.util.AbstractObservable;

public class TestObservableTwo extends AbstractObservable {

    @Override
    public void generateEvents(String data) {
        notifyAll("Test data one from TestObservableTwo");

    }
}
