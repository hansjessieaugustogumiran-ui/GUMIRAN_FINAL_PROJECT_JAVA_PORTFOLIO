package com.store.order;

public abstract class Order {

    private int orderId;
    private double amount;
    private OrderStatus status;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        setAmount(amount);
        this.status = OrderStatus.PENDING;
    }

    
    public abstract void processOrder();

   
    public String getOrderSummary() {
        return "Order ID: " + orderId +
               ", Amount: $" + amount +
               ", Status: " + status;
    }


    public int getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public OrderStatus getStatus() {
        return status;
    }


    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else {
            System.out.println("Amount cannot be negative.");
        }
    }


    protected void setStatus(OrderStatus status) {
        this.status = status;
    }


    public void cancelOrder() {
        this.status = OrderStatus.CANCELLED;
    }
}

// GUMIRAN, HANS JESSIE AUGUSTO M.
// BSCS-2D
// AI USED: CHATGPT
// LINK CONVO: https://chatgpt.com/share/696cf453-e8b0-8005-8304-112cef24edbd
