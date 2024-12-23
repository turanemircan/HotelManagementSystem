package com.tpe.hotelManagementSystem.exceptons;

public class RoomNotFoundException extends RuntimeException {
    public RoomNotFoundException(String message) {
        super(message);
    }
}
