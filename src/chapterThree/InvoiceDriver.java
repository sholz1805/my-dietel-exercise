package chapterThree;

public class InvoiceDriver {
    public static void main(String[] args) {
        Invoice supermarket = new Invoice();
        //Invoice supermarketB = new Invoice();

        supermarket.setPartNumber("SKU001");
        String partNumber = supermarket.getPartNumber();
        System.out.printf("Part Number is: %s%n", partNumber);

        supermarket.setPartDescription("Binatone Microwave Oven - BL0234");

        String partDescription = supermarket.getPartDescription();
        System.out.printf("Product Name is: %s%n", partDescription);

        supermarket.setItemQuantity(-5);
        int quantity = supermarket.getItemQuantity();
        if(quantity<=-1){
            quantity=0;
        }
        System.out.print("Quantity : ");
        System.out.println(quantity);


        supermarket.setItemPrice(60_000);
        double price = supermarket.getItemPrice();
        System.out.printf("Total Amount: %.2f%n", price * quantity);

    }
}

