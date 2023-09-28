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
#This class creates apple, banana, milk and egg factories and creates objects of each product using their respective factory objects. It then retrieves the names and prices of each grocery product object from text files that are saved on the system using the get name and get price methods.

![image](https://github.com/EsotericProgrammer/Group-13-Assignment/assets/140844647/4531866f-f7c6-47b9-ad51-b677d2ccaab5)


GroceryProduct Interface: This is an interface that defines two methods: getName() and getPrice(). Any class that implements this interface must provide implementations for these methods.

GroceryProductFactory Interface: Another interface that defines a single method createProduct(). Classes that implement this interface will be responsible for creating instances of grocery products.

Apple, Banana, Eggs, and Milk Classes: These are concrete classes that implement the GroceryProduct interface. Each class represents a specific grocery product and provides its name and price.

AppleFactory, BananaFactory, EggFactory, and MilkFactory Classes: These are factory classes that implement the GroceryProductFactory interface. Each factory is responsible for creating instances of a specific grocery product. They read the product's price from a text file (apple_prices.txt, banana_prices.txt, egg_prices.txt, and milk_prices.txt) and then create a product instance with the appropriate name and price.

GroceryStore Class: This is the main class of the program. In its main method, it does the following for each product:
It creates an instance of the corresponding factory (e.g., BananaFactory for bananas).
It calls the createProduct method on the factory to create a product.
It prints the name and price of the created product.


When you run the GroceryStore program, it will simulate a grocery store by creating instances of various grocery products (apples, bananas, milk, and eggs) using their respective factories and then printing out the names and prices of these products. The prices are read from external text files as specified in each factory class.
