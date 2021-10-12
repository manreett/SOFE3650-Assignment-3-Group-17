public class Display implements View{
    //DIsplays text
    public void displayText(String code) {
        System.out.println("Display:");
        System.out.println(code);
    }

    @Override
    public void displayProduct(Product p) {
        System.out.println("Display:");
        System.out.println(p);
    }
}
