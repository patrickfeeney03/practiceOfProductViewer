package ie.atu.myProduct;

import java.text.NumberFormat;

public class Product {
    private String code;
    private String description;
    private double price;
    public static int count = 0;

    public Product() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPriceFormatted() {
        NumberFormat myCurrency = NumberFormat.getCurrencyInstance();
        return myCurrency.format(price);
    }

    @Override
    public String toString() {
        return description;
    }
    public static int getCount() {
        return count;
    }
}
