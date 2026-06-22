import java.util.ArrayList;

public class OnlineOrder {
    private String customer;
    private ArrayList<String> items;
    private boolean delivered;

    public OnlineOrder(String customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.delivered = false;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public boolean removeItem(String item) {
        return items.remove(item);
    }

    public void markDelivered() {
        delivered = true;
    }

    public int getItemCount() { return items.size(); }
    public boolean isDelivered() { return delivered; }
}