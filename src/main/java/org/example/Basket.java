package org.example;

import java.util.ArrayList;

public class Basket{
    private ArrayList<Product> buyProduct;

    public Basket(){
        buyProduct = new ArrayList<>();
    }
    public void addProductInBasket(Product product){
        buyProduct.add(product);
    }
    public void deleteProductInBasket(Product product){
        buyProduct.remove(product);
    }

    public void printBuyProduct() {
        System.out.println("Список купленных товаров: ");
        for (Product product : buyProduct) {
            System.out.println("Название товара: " + product.getName());
            System.out.println("Цена товара: " + product.getPrice());
            System.out.println("Рейтинг товара: " + product.getRating());
            System.out.println("*****************");

        }
    }
}
