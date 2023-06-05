package academy.devdojo.maratonajava.javacore.N_polymorphism.service;

import academy.devdojo.maratonajava.javacore.N_polymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.N_polymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.N_polymorphism.domain.Tomato;

public class Tax_Calculator {
       public static void taxCalculator(Product product){
        System.out.println("Product Tax Report: ");
        double tax = product.calcTax();
        System.out.println("Tomato: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax: " + tax);
    }
}
