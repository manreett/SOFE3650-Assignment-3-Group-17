public class TesterCashRegister {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();

        new Display(cashRegister);
        new TicketPrinter(cashRegister);

        //setting state to whatever the UPC code is. You must use the same values as me, or otherwise change the txt file to what you want

        System.out.println("UPCCode: 4321");
        cashRegister.setState(4321);
        System.out.println("UPCCode: 9876");
        cashRegister.setState(9876);


    }
}

