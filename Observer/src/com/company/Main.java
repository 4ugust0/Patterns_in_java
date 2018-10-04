package com.company;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setCustomerName("Jose");

        Customer customer2 = new Customer();
        customer2.setCustomerName("Augusto");

        Product iphone6 = new Product();
        iphone6.setProductName("Apple Iphone 6");
        iphone6.setAvailable(false);

        iphone6.registerObserver(customer1);
        iphone6.registerObserver(customer2);

        //after a few days

        iphone6.setAvailable(true);
    }
}
