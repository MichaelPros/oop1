package org.example;

public class Product{
    private String name;
    private int price;
    private byte rating;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public byte getRating() {
        return rating;
    }
    public void setRating(byte rating) {
        this.rating = rating;
    }

    public Product (String name, int price, byte rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
}
