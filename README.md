# Group-13-Assignment

Repository folders description

#Full_Code_Folder
Contains all the code used for this assignment.

#Main_Code
Contains the main classes.

#Price_Files
Contains the files which provide the prices for apples, bananas, eggs and milk.

#Test_Code
Contains the GroceryStore.java file which is the test class for this assignment.

Test Methods

We used this class called GroceryStore as a test class
![Screenshot 2023-09-27 211010](https://github.com/EsotericProgrammer/Group-13-Assignment/assets/140844647/11f55950-a7fc-4be3-b506-912a7f218f41)
This class creates apple, banana, milk and egg factories and creates objects of each product using their respective factory objects. It then retrieves the names and prices of each grocery product object from text files that are saved on the system using the get name and get price methods.

![image](https://github.com/EsotericProgrammer/Group-13-Assignment/assets/140844647/4531866f-f7c6-47b9-ad51-b677d2ccaab5)


Interfaces and Base Classes:

GroceryProduct is an interface that defines three methods: getName(), getPrice(), and setPrice(double price). It's used as a common interface for grocery products.
Apple and Banana are base classes that implement the GroceryProduct interface. They have private fields for name and price, as well as setters and getters for these fields.

Subclasses:

RedApple, GreenApple, RawBanana, and RipenedBanana are subclasses of Apple and Banana. They inherit the properties and methods of their parent classes.

Factories:

AppleFactory and BananaFactory are responsible for creating instances of apple and banana products, respectively.
Each factory takes a file path as an argument to specify the location of the database (text file) containing product names and prices.

Factory Methods:

In each factory, the createProduct(String name) method creates an instance of the specified product based on the provided name.
The method reads the product's price from the database (text file) using the getPriceFromDatabase(name) method.
If the product name is not found in the database, an IllegalArgumentException is thrown.


Reading Prices from Database:

The getPriceFromDatabase(String productName) method reads the database (text file) line by line and extracts the price of the specified product.
If the product is found in the database, its price is returned; otherwise, an exception is thrown.


GroceryStore Class:

The FactoryTester class is the main class where the program starts.
It creates instances of AppleFactory and BananaFactory, specifying the path to the database (text file).
It demonstrates the creation of specific products (e.g., "Red Apple" and "Ripened Banana") using the factory methods.
If the product name is not found or is invalid, an IllegalArgumentException is caught and a corresponding error message is displayed.
