package src.poo;

import java.util.Date;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item tuna = new Item();
        System.out.println("Introduzca el nombre del item: ");
        tuna.name = scanner.nextLine();
        System.out.println("Introduzca el precio: ");
        tuna.price = scanner.nextDouble();
        System.out.println("Introuzca el día: ");
        int day = scanner.nextInt();
        System.out.println("Introuzca el mes: ");
        int month = scanner.nextInt();
        System.out.println("Introuzca el año: ");
        int year = scanner.nextInt();
        tuna.expirationDate = new Date(year-1900, month, day);
        tuna.calculateTax();

        if (tuna.canItBeSold()){
            System.out.println("Nombre del Item " + tuna.name);
            System.out.println("Precio del Item " + tuna.price);
            System.out.println("Impuesto del Item " + tuna.tax);
            System.out.println("Total a pagar por el Item " + tuna.getTotalToPay());
        } else{
            System.out.println("Este ítem no esta habilitado para su venta");
        }
    }
}
