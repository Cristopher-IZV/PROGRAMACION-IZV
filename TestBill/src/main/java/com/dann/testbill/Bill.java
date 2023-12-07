/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dann.testbill;

import java.time.LocalDate;
import java.util.Scanner;

public class Bill {

    //Atributos de la clase Bill
    private String[] products;
    private float[] prices;
    private LocalDate date;

    //Constructor  no devuelve nada
    public Bill() {
        this.products = new String[0];
        this.prices = new float[0];
        this.date = LocalDate.now();
    }


    public String[] getProducts() {
        return products;
    }

    public float[] getPrices() {
        return prices;
    }

    //Métodos;
    public LocalDate getDate() {
        return date;
    }

    public void setProducts() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la cantidad de productos:");
        int numberOfProducts = scan.nextInt();

        products = new String[numberOfProducts];
        for (int i = 0; i < products.length; i++) {
            System.out.print("Ingrese el nombre de los productos : ");
            products[i] = scan.next();
            scan.nextLine();

        }
        setPrices(numberOfProducts);
    }

    public void setPrices(int number) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce los precios de los productos");
        prices = new float[number];
        for (int i = 0; i < products.length; i++) {
            System.out.print("Ingrese el precio de " + products[i] + " : ");
            prices[i] = scan.nextFloat();
        }
    }

    public float totalPrices() {
        float total = 0;
        for (int i = 0; i < products.length; i++) {
            total += prices[i];
        }
        return total;
    }

    public void setDate(LocalDate date) {
        this.date = date;
        
    }

}
