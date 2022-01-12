package chapterThree;

public class Invoice {
//   An Invoice should include four instance variables—a part number (type String),
//   a part description (type String), a quantity of the
//   item being purchased (type int) and a price per item (double).
//   Provide a set and a get method for each instance variable.
//   provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
//  multiplies the quantity by the price per item), then returns the amount as a double value. If the
//    quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
//0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.

    private String partNumber;
    private String partDescription;
    private int itemQuantity;
    private double itemPrice;

    public void setPartNumber(String partNumber){
        this.partNumber= partNumber;
    }
    public String getPartNumber(){
        return partNumber;
    }

    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }
    public String getPartDescription(){
        return partDescription;
    }
    public void setItemQuantity(int quantity){
        itemQuantity=quantity;
    }
    public int getItemQuantity(){
        return itemQuantity;
    }
    public void setItemPrice(double price){
        itemPrice = price;
    }
    public double getItemPrice(){
        return itemPrice;
    }

}
