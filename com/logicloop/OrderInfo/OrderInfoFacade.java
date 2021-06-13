package com.logicloop.OrderInfo;

public class OrderInfoFacade {
    private String vehicleId;
    private String latestStatus;
    
    public String queryStatus(String orderId) {
        // TODO implement more sophisticated query logic
        this.vehicleId = new VehicleInfo().findVehicleId(orderId);
        this.latestStatus = new DealerInfo().queryChannelStatus(this.vehicleId);
        if (this.latestStatus == null) {
            this.latestStatus = new ImporterInfo().queryChannelStatus(this.vehicleId);
        }
        if (this.latestStatus == null) {
            this.latestStatus = new FactoryInfo().queryStatus(this.vehicleId);
        }
        if (this.latestStatus == null) {
            this.latestStatus = "NO INFORMATION OR NOT YET PRODUCED";
        }
        return this.latestStatus;
    }
}
