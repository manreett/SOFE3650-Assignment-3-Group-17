public class Display extends Observer{
    private ProductDB productDB = new ProductDB();
    //DIsplays text

    public void displayText(String code) {
        System.out.println("Display:");
        System.out.println(code);
    }

    public Display(CashRegister cashRegister){
        this.cashRegister = cashRegister;
        this.cashRegister.attach(this);
    }

    //Overridden by observer class

    @Override
    public void update() {
        System.out.println("Display: " + this.productDB.GetProductInfo(cashRegister.getState()));

    }
}
