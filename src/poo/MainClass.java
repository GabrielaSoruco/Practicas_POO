package src.poo;

import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        Item tuna = new Item();
        tuna.name = "Atún Gomez";
        tuna.price = 180.0;
        tuna.expirationDate = new Date(2021, 8, 12);
        tuna.calculateTax();

        if (tuna.canItBeSold()){
            System.out.println("Nombre del Item " + tuna.name);
            System.out.println("Precio del Item " + tuna.price);
            System.out.println("Impuesto del Item " + tuna.tax);
            System.out.println("Total a pagar poor el Item " + tuna.getTotalToPay());
        } else{
            System.out.println("Este ítem no esta habilitado para su venta");
        }
    }
}
