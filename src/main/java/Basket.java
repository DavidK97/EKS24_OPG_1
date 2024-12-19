import java.util.ArrayList;
import java.util.List;


public class Basket {
    private List <Product> productList;


    public Basket (){
        this.productList = new ArrayList<>();
    }

    public void addProduct (Product product){
        productList.add(product);
    }

    public void removeProduct (Product product){
        productList.remove(product);
    }

    public void printAll() {
        for (Product product : productList) {
            if (product instanceof Clothes) {
                System.out.println("Clothes: \n " + product);
            } else if (product instanceof Electronics) {
                System.out.println("Electronics: \n " + product);
            } else if (product instanceof Food) {
                System.out.println("Food: \n " + product);
            }
        }
        System.out.println("\n Total: " + calculateTotal() + " euros");
    }

    public double calculateTotal (){
        double total = 0;
        for (Product product : productList) {
            total = total + product.getPrice();
        }
        return total;
    }

}
