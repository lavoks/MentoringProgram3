package com.patternObserver.test;

public class Test {
    public static void main(String[] args) {
        TestObservable testObservable1 = new TestObservable();
        TestObservableTwo testObservable2 = new TestObservableTwo();

        ObserverOne observerOne = new ObserverOne();
        ObserverTwo observerTwo = new ObserverTwo();

        testObservable1.subscribe(observerOne);
        testObservable1.subscribe(observerTwo);

        testObservable2.subscribe(observerTwo);

        testObservable1.generateEvents("some kind of test eventData 1");
        testObservable2.generateEvents("some kind of test eventData 2");
    }
}
