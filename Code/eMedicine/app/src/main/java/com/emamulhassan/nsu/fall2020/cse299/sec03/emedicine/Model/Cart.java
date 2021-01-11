package com.emamulhassan.nsu.fall2020.cse299.sec03.emedicine.Model;

public class Cart
{
    private String pid, pname, price, quantity, discount;

    public Cart()
    {

    }

    public Cart(String pid, String pname, String price, String quantity, String discount) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }
}
