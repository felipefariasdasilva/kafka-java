package com.felipe.ecommerce;

import java.math.BigDecimal;

public class Order {
    private final String userId;
    private final String orderId;
    private final BigDecimal amout;

    public Order(String userId, String orderId, BigDecimal amout) {
        this.userId = userId;
        this.orderId = orderId;
        this.amout = amout;
    }

    public BigDecimal getAmout() {
        return amout;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userId='" + userId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", amout=" + amout +
                '}';
    }
}
