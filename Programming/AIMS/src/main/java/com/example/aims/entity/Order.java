package com.example.aims.entity;

import java.util.HashMap;
import java.util.List;

public class Order {
    private int shippingFee;
    private DeliveryAddress deliveryAddress;

    public Order(int shippingFee, DeliveryAddress deliveryAddress) {
        this.shippingFee = shippingFee;
        this.deliveryAddress = deliveryAddress;
    }

    public Order() {

    }

    public int getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(int shippingFee) {
        this.shippingFee = shippingFee;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
