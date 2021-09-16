package src.poo;

import sun.util.calendar.BaseCalendar;

import java.util.Date;

public class Item {
    public String name;
    public double price;
    public double tax;
    public Date expirationDate;

    public Double getTotalToPay(){
        return price + tax;
    }
    public void calculateTax(){
        tax = price * 0.19;
    }

    public Boolean canItBeSold(){
        Date today = new Date();
        return !expirationDate.after(today);
    }
}
