package org.example;

public class Main {
    public static void main(String[] args) {
        Category smartphone = new Category("Смартфоны");
        Product smartphone1 = new Product("Iphone 15 ProMax", 150_000, (byte) 5);
        Product smartphone2 = new Product("Iphone 14 ProMax", 100_000, (byte) 5);
        Product smartphone3 = new Product("Iphone 13 Pro", 70_000, (byte) 5);
        Product smartphone4 = new Product("Samsung Galaxy S24 Ultra", 120_000, (byte) 5);
        Product smartphone5 = new Product("Xiaomi 13 Ultra", 180_000, (byte) 4);
        smartphone.addProduct(smartphone1);
        smartphone.addProduct(smartphone2);
        smartphone.addProduct(smartphone3);
        smartphone.addProduct(smartphone4);
        smartphone.addProduct(smartphone5);


        Category notebooks = new Category("Ноутбуки");
        Product notebooks1 = new Product("MacBook Pro 16", 300_000, (byte) 5);
        Product notebooks2 = new Product("MacBook Pro 14", 220_000, (byte) 5);
        Product notebooks3 = new Product("MacBook Air 15", 180_000, (byte) 5);
        Product notebooks4 = new Product("MacBook Air 13", 140_000, (byte) 5);
        notebooks.addProduct(notebooks1);
        notebooks.addProduct(notebooks2);
        notebooks.addProduct(notebooks3);
        notebooks.addProduct(notebooks4);

        User user1 = new User("USER1", "123");
        User user2 = new User("USER2","321");

        user1.getBasket().addProductInBasket(notebooks1);
        user1.getBasket().addProductInBasket(smartphone1);
        user1.getBasket().printBuyProduct();
        user2.getBasket().addProductInBasket(notebooks4);
        user2.getBasket().printBuyProduct();

        smartphone.printAll();
        System.out.println("==============");
        notebooks.printAll();
        
    }
}