package com.tpe.hotelManagementSystem.excepton;

public class HotelResourceNotFoundException extends RuntimeException {
    public HotelResourceNotFoundException(String message) {
        super(message);
    }
}
