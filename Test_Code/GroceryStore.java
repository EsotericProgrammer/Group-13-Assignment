public class GroceryStore {
    public static void main(String[] args) {
        // Create Banana product
        GroceryProductFactory bananaFactory = new BananaFactory();
        GroceryProduct banana = bananaFactory.createProduct();
        System.out.println("Product: " + banana.getName());
        System.out.println("Price: $" + banana.getPrice());

        // Create Apple product
        GroceryProductFactory appleFactory = new AppleFactory();
        GroceryProduct apple = appleFactory.createProduct();
        System.out.println("Product: " + apple.getName());
        System.out.println("Price: $" + apple.getPrice());

        // Create Milk product
        GroceryProductFactory milkFactory = new MilkFactory();
        GroceryProduct milk = milkFactory.createProduct();
        System.out.println("Product: " + milk.getName());
        System.out.println("Price: $" + milk.getPrice());

        // Create Egg product
        GroceryProductFactory eggFactory = new EggFactory();
        GroceryProduct egg = eggFactory.createProduct();
        System.out.println("Product: " + egg.getName());
        System.out.println("Price: $" + egg.getPrice());
    }
}