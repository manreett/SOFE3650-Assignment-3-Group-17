import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ProductDB {
    Product product = null;

    //gets product information with code

    public Product GetProductInfo(int UPCCode){
        try {
            File productDatabase = new File("C://Users//matta//OneDrive//Documents//School 2021-2022//Software Design and Architecture//SOFE3650 Assign 3//ProductDatabase.txt");
            Scanner myReader = new Scanner(productDatabase);

            while (myReader.hasNextLine()){
                String[] product = myReader.nextLine().split(",");
                int UPC = Integer.parseInt(product[0]);
                String name = product[1];
                double price = Double.parseDouble(product[2]);

                if (UPCCode == UPC) {
                    this.product = new Product(UPC,name,price);
                    break;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }
        return product;
    }
}
