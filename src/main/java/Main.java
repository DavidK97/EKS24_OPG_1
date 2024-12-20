public class Main {

    public static void main (String [] args){

        Basket basket1 = new Basket();

        //TODO Lav eventuelt en metode til at fylde basket
        //TODO Lav eventuelt TextUI og en switch
        //TODO Sorter eventuelt efter pris også


        Product clothes1 = new Clothes("T-shirt", 50, 10, "black");
        Product electronics1 = new Electronics("Laptop", 1000, 24);
        Product food1 = new Food("Milk", 1, "24/12/2024");

        basket1.addProduct(clothes1);
        basket1.addProduct(electronics1);
        basket1.addProduct(food1);

        basket1.printAll();

    }
}
