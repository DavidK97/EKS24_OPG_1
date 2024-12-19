public class Clothes extends Product{
    private int size;
    private String color;

    public Clothes (String name, double price, int size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    public String toString (){
        return "Type: " + getName() + ", Size: " + getSize() + ", Color: " +  getColor() + ", Price: " + getPrice() + " euros";
    }

    public String getColor (){
        return color;
    }

    public int getSize (){
        return size;
    }
}
