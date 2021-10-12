public class Keyboard {
    private CashRegister cashRegister = new CashRegister();
    public void setUPCCode(int UPCCode){
        this.cashRegister.setCurrentProductUPC(UPCCode);
    }
}
