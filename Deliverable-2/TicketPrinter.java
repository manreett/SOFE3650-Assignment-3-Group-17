public class TicketPrinter implements View{
    public void displayText(String text) {
        System.out.println("Ticket Printer:");
        System.out.println(text);
    }

    @Override
    public void displayProduct(Product p) {
        System.out.println("Ticket Printer:");
        System.out.println(p);
    }
}
