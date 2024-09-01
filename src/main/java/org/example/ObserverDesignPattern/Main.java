package org.example.ObserverDesignPattern;


import org.example.ObserverDesignPattern.Observable.IphoneObservableImpl;
import org.example.ObserverDesignPattern.Observable.StockObservable;
import org.example.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import org.example.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import org.example.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("email1",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("email2",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xvg",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}