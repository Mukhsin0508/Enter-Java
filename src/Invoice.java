import java.util.ArrayList;
import java.util.List;

// Class to represent an item in the invoice
class Item {
    private final String description;
    private final int quantity;
    private final double price;

    public Item(String description, int quantity, double price) {
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }


    public double getTotalPrice() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return description + ": " + quantity + " x " + price + " = " + getTotalPrice();
    }
}


// Class to represent an invoice
public class Invoice {
    private final List<Item> items;

    public Invoice() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getTotalInvoicePrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            sb.append(item.toString()).append("\n");
        }
        sb.append("Total Invoice Price: ").append(getTotalInvoicePrice());
        return sb.toString();
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addItem(new Item("Laptop", 1, 1500.00));
        invoice.addItem(new Item("Mouse", 2, 25.00));
        invoice.addItem(new Item("Sneakers", 4, 50.00));
        System.out.println(invoice);
    }
}
