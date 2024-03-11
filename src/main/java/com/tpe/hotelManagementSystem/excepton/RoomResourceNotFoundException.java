package com.tpe.hotelManagementSystem.excepton;

public class RoomResourceNotFoundException extends RuntimeException {
    public RoomResourceNotFoundException(String message) {
        super(message);
    }
}
