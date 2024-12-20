package com.tpe.hotelManagementSystem.exceptons;

public class GuestNotFoundException extends RuntimeException {
    public GuestNotFoundException(String message) {
        super(message);
    }
}
