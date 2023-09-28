import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class AppleFactory implements GroceryProductFactory {
    @Override
    public GroceryProduct createProduct() {
        double price = readPriceFromFile("apple_prices.txt");
        return new Apple("Apple", price);
    }

    private double readPriceFromFile(String filename) {
        double price = 0.0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            price = Double.parseDouble(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return price;
    }
}