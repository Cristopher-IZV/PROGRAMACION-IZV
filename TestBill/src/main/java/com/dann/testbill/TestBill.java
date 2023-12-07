/**
 * @param string  the string to be converted
 * @param type    the type to convert the string to
 * @param <T>     the type of the element
 * @param <V>     the value of the element
 */

package com.dann.testbill;


public class TestBill {

    //Hay que crear una clase Bill en la que tengamos los siguientes atributos:
    /*
    Un array con los nombres de los productos comprados
    Otro array con el precio total de cada uno de los productos
    (Advaced-> LLevar de alguna forma un contador de la cantidad comprada de cada uno 
    de los productos) 
    Fecha de la factura 
    
    El programa principal:
    Solo tiene que crear yna factura (preguntando al usuario)
    y mostrarla de la siguiente forma:
    Tornillo   23,78€
    Ratón      11,77€
    Llaves     3,67€
    Cables     2,99€
    Total......??,??€
    IVA(21%)...??,??€
    
Granada a xx de xxx de 2023
     */
    public static void main(String[] args) {
        Bill myBill = new Bill();

        myBill.setProducts();

        for (int i = 0; i < myBill.getProducts().length; i++) {
            System.out.println(myBill.getProducts()[i] + " .. " + myBill.getPrices()[i] + " €");
        }
        System.out.println("Total ..." + myBill.totalPrices());
        System.out.println(myBill.getDate());
        
        
        Bill myBill2 = new Bill();
        System.out.println(myBill2.toString());
    }
}
