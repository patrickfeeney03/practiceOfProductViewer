package ie.atu.myProduct;

import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        System.out.println("Product Viewer for different types of products\n");

        Scanner mySc = new Scanner(System.in);
        String userInput = "y";
        while(userInput.equalsIgnoreCase("y")) {
            System.out.println("Product Code: ");
            String productCode = mySc.nextLine();

            Product myProduct = ProductDB.getProduct(productCode);

            System.out.println();
            if (myProduct != null) {
                System.out.println("Description: " + myProduct.toString());
                System.out.println("Price: " + myProduct.getPriceFormatted());
            } else {
                System.out.println("No product matches this product code.");
            }

            System.out.println("\nProduct count: " + myProduct.getCount());
        }
    }



}
