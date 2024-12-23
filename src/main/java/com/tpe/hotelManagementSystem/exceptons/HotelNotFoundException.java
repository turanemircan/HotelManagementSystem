package com.tpe.hotelManagementSystem.exceptons;

public class HotelNotFoundException extends RuntimeException {
    public HotelNotFoundException(String message) {
        super(message);
    }
}
