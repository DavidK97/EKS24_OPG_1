public class Food extends Product{
    private String expireDate;

    public Food (String name, float price, String expireDate){
        super(name, price);
        this.expireDate = expireDate;
    }


    public String toString (){
        return "Type: " + getName() + ", Expire date: " + getExpireDate() + ", Price: " + getPrice() + " euros";
    }


    public String getExpireDate () {
        return expireDate;
    }
}
