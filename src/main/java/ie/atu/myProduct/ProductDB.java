package ie.atu.myProduct;

public class ProductDB {
    public static Product getProduct(String productCode) {
        Product canItBeAnyName = null;

        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            // Tags for books: code, description, price, author.
            myBook.setCode(productCode); // Product code comes from the user input.
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(10);
            myBook.setAuthor("James");
            canItBeAnyName = myBook;
        }

        if (productCode.equalsIgnoreCase("mc")) {
            Software mySoftware = new Software();
            // price, description, code; version
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Minecraft by Mojang");
            mySoftware.setPrice(25);
            mySoftware.setVersion("1.19.2");
            canItBeAnyName = mySoftware;
        }

        if (productCode.equalsIgnoreCase("c4ll4")) {
            Music myMusic = new Music();
            // price, description, code; artist label
            myMusic.setCode(productCode);
            myMusic.setDescription("Calladita");
            myMusic.setPrice(5);
            myMusic.setArtist("Bad Bunny");
            myMusic.setLabel("Some Label");
            canItBeAnyName = myMusic;
        }

        return canItBeAnyName;
    }
}
