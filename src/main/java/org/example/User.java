package org.example;

public class User {
    private String login;
    private String password;
    private Basket basket;
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Basket getBasket(){
        return basket;
    }
    public User (String login, String password){
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }




}
