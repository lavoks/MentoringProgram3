package com.patternObserver.test;

import com.patternObserver.util.AbstractObservable;

public class TestObservable extends AbstractObservable {

    @Override
    public void generateEvents(String data) {
        notifyAll("Test data one from TestObservable");

    }
}
