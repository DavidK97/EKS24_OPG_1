import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BasketTest {


    @Test
    void calculateTotal() {
        //Arrange
        Basket basket = new Basket();

        Product clothes1 = new Clothes("T-shirt", 50, 10, "black");
        Product electronics1 = new Electronics("Laptop", 1000, 24);
        Product food1 = new Food("Milk", 1, "24/12/2024");

        basket.addProduct(clothes1);
        basket.addProduct(electronics1);
        basket.addProduct(food1);

        //Act
        double actual = basket.calculateTotal();
        double expected = 1051;

        //Assert
        assertEquals(actual, expected);
    }
}