package com.company;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

    private String productName;
    private List<Observer> listOfObservers = new ArrayList<>();
    private boolean available;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Observer> getListOfObservers() {
        return listOfObservers;
    }

    public void setListOfObservers(List<Observer> listOfObservers) {
        this.listOfObservers = listOfObservers;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;

        if(available == true) {
            notifyObservers();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        listOfObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        listOfObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        System.out.println("Notifying to all when product avaliable");

        for(Observer observer : listOfObservers) {
            observer.update(productName);
        }
    }
}
