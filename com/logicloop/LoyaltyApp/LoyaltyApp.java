package com.logicloop.LoyaltyApp;

import com.logicloop.OrderInfo.OrderInfoFacade;

class LoyaltyApp {
    public static void main(String[] args) {
        String orderStatus = new OrderInfoFacade().queryStatus("myOrderId");
        System.out.println(orderStatus);
    }
}
