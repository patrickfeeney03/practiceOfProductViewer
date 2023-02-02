package ie.atu.myProduct;

public class ProductDB {
    public static Product getProduct(String productCode) {
        Product p = null;

        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            // Tags for books: code, description, price, author.
            myBook.setCode(productCode); // Product code comes from the user input.
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(10);
            myBook.setAuthor("James");
            p = myBook;
        }
        return p;
    }
}
