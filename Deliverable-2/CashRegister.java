public class CashRegister {
    //private Display display = new Display();
    //private TicketPrinter ticketPrinter = new TicketPrinter();
    private View view;

    private Product currentProduct;
    private ProductDB productDB = new ProductDB();
    private int UPCCode;


    //set UPC code for current scanned product

    public void setCurrentProductUPC(int UPCCode) {
        this.UPCCode = UPCCode;
        this.currentProduct = this.getCurrentProductInfo();

        //print view if object is defined

        if(this.currentProduct != null){
            //this.display.displayText(this.currentProduct.toString());
            //this.ticketPrinter.displayText(this.currentProduct.toString());

            view = new Display();
            view.displayProduct(currentProduct);

            view = new TicketPrinter();
            view.displayProduct(currentProduct);
        }
    }

    //gets product information for the latest scanned product

    public Product getCurrentProductInfo() {
        currentProduct = this.productDB.GetProductInfo(this.UPCCode);
        return currentProduct;
    }
}