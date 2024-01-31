package org.example;

import java.util.ArrayList;

public class Category {
    private String name;

    private ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();

    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public void printAll() {
        System.out.println("Категория товаров: " + name);
        for (Product product : products){
            System.out.println("Название товара: "  + product.getName());
            System.out.println("Цена товара: "  + product.getPrice());
            System.out.println("Рейтинг товара: "  + product.getRating());
            System.out.println("*****************");
        }

    }


}
