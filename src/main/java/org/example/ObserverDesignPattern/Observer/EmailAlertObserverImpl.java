package org.example.ObserverDesignPattern.Observer;

import org.example.ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;

    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    StockObservable observable;
    @Override
    public void update() {
        sendEmail(this.emailId,"product in stock!!!");
    }

    private void sendEmail(String emailId,String msg){
        System.out.println("mail sent to:" + emailId);
    }
}
