package com.tiscon.dto;

public class priceDto {
    private int distanceInt;
    private int pricePerTruck;
    private int priceForOptionalService;

    public int getDistanceInt() {
        return distanceInt;
    }

    public void setDistanceInt(int distanceInt) {
        this.distanceInt = distanceInt;
    }

    public int getPricePerTruck() {
        return pricePerTruck;
    }

    public void setPricePerTruck(int pricePerTruck) {
        this.pricePerTruck = pricePerTruck;
    }

    public int getPriceForOptionalService() {
        return priceForOptionalService;
    }

    public void setPriceForOptionalService(int priceForOptionalService) {
        this.priceForOptionalService = priceForOptionalService;
    }

    public void getPriceForOptionalService(int priceForOptionalService) {
    }
}
