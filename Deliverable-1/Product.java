public class Product {
    private int UPCCode;
    private String name;
    private double price;


    //set code price and name

    public Product(int UPCCode, String name, double price){
        this.UPCCode = UPCCode;
        this.name = name;
        this.price = price;
    }


    //set code
    public void setUPCCode(int UPCCode) {
        this.UPCCode = UPCCode;
    }

    //return code
    public int getUPCCode() {
        return UPCCode;
    }

    @Override
    public String toString() {
        return "Product: " + "UPC Code = " + UPCCode + ", Name = " + name + ", Price = " + price;
    }
}
