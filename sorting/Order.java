package sorting;

import java.util.Date;

public class Order {
    private Date Date1;
    private String orderId;
    private double amount;
    private String status;

    public Order(Date Date1, String orderId, double amount, String status) {
        this.Date1 = Date1;
        this.orderId = orderId;
        this.amount = amount;
        this.status = status;
    }

    public Date getDate() {
        return Date1;
    }

    public double getamount(){
        return amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderDate=" + Date1 +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
