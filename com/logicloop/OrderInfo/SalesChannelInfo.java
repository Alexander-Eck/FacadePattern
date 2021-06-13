package com.logicloop.OrderInfo;

public abstract class SalesChannelInfo {

    protected String channelStatus;

    public abstract String queryChannelStatus(String vehicleId);

}
