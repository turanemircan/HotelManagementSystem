package com.tpe.hotelManagementSystem.exceptons;

public class RoomResourceNotFoundException extends RuntimeException {
    public RoomResourceNotFoundException(String message) {
        super(message);
    }
}
