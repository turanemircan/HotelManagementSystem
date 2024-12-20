package com.tpe.hotelManagementSystem.exceptons;

public class HotelResourceNotFoundException extends RuntimeException {
    public HotelResourceNotFoundException(String message) {
        super(message);
    }
}
