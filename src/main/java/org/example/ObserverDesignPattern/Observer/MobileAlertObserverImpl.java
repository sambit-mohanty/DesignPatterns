package org.example.ObserverDesignPattern.Observer;

import org.example.ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(this.userName);
    }

    private void sendMsgOnMobile(String userName){
        System.out.println("msg sent to: " + userName);
    }
}
