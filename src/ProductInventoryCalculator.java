public class ProductInventoryCalculator {
    public static void main(String []args){
        System.out.println("text");
        System.out.println("---Inventory Receipt---");
        //product seal
        String firstname ="WIRELESS";
        String lastname ="MOUSE";
        String Product = firstname  + lastname;
        System.out.println("Product :"+ Product);

        //price
        double price = 24.99;
        System.out.println("Price :"+ price);

        //Quantity
        int quantity = 15;
        System.out.println("Quantity :"+ quantity);

        //Status
        boolean OnSale = true;
        boolean onSale = OnSale;
        System.out.println("Status :"+ onSale);

        //Total value
        double price1 = 24.99;
        int quantity1 = 15;
        double total =(price1 * quantity1);
        System.out.println("Total value :"+ total);

        int result = (int) total;
        System.out.println("Rounded total:"+ result);





    }
}
