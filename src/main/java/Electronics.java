public class Electronics extends Product{
    private int warrantyNoOfMonths;

    public Electronics (String name, double price, int warrantyNoOfMonths){
        super(name, price);
        this.warrantyNoOfMonths = warrantyNoOfMonths;

    }

    public String toString (){
        return "Type: " + getName() + ", Months of warranty: " + getWarrantyNoOfMonths() + ", Price: " + getPrice() + " euros";
    }

    public int getWarrantyNoOfMonths () {
        return warrantyNoOfMonths;
    }

}
