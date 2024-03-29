package com.tpe.hotelManagementSystem.controller;

import java.util.Scanner;

public class HotelManagementSystem {

    private static Scanner scanner;

    public static void displayMenuHotelManagementSystem() {
        scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("==== Hotel Management System  Menu ====");
            System.out.println("1. Hotel Operations");
            System.out.println("2. Room Operations");
            System.out.println("3. Guest Operations");
            System.out.println("4. Reservation Operations");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    displayHotelOperationsMenu();
                    break;
                case 2:
                    displayRoomOperationsMenu();
                    break;
                case 3:
                    displayGuestOperationsMenu();
                    break;
                case 4:
                    displayReservationOperationsMenu();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Good bye");
                    break;
                default:
                    System.out.println("Invalid choice. Please try gain");
                    break;
            }
        }
    }

    private static void displayHotelOperationsMenu() {
        System.out.println("HotelOperationMenu"); //Step 14
        scanner = new Scanner(System.in); //Step 15
        boolean exit = false;
        while (!exit) {
            System.out.println("==== Hotel Operations ====");
            System.out.println("1. Add a new hotel");
            System.out.println("2. Find Hotel By ID");
            System.out.println("3. Delete Hotel By ID");
            System.out.println("4. Find All Hotels");
            System.out.println("5. Update Hotel By ID");
            System.out.println("6. Return to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    //saveHotel
                    System.out.println("==== Add a new hotel ====");
                    break;
                case 2:
                    //findHotelById
                    System.out.println("Enter the hotel ID: ");
                    Long hotelId = scanner.nextLong();
                    break;
                case 3:
                    //deleteHotelById
                    System.out.print("Enter the hotel ID to delete: ");
                    Long id = scanner.nextLong();
                    break;
                case 4:
                    //findAllHotels
                    System.out.println("==== Find All Hotels ====");
                    break;
                case 5:
                    //updateHotelById
                    System.out.println("==== Update Hotel By ID ====");
                    System.out.print("Enter the hotel ID to update: ");
                    Long hotelId1 = scanner.nextLong();
                    scanner.nextLine(); // Consume the newline character
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void displayRoomOperationsMenu() {
        System.out.println("RoomOperationMenu"); //Step 14
        scanner = new Scanner(System.in);  //Step 15
        boolean exit = false;
        while (!exit) {
            System.out.println("==== Room Operations ====");
            System.out.println("1. Add a new room");
            System.out.println("2. Find Room By ID");
            System.out.println("3. Delete Room By ID");
            System.out.println("4. Find All Rooms");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    //saveRoom
                    System.out.println("==== Add New Room ====");
                    break;
                case 2:
                    //findRoomById
                    System.out.print("Enter the Room ID to Find: ");
                    Long roomId = scanner.nextLong();
                    break;
                case 3:
                    //findAllRoom
                    System.out.println("==== Delete Room By ID ====");
                    System.out.print("Enter the room ID to delete: ");
                    Long roomIdToDelete = scanner.nextLong();
                    scanner.nextLine(); // Consume the newline character
                    break;
                case 4:
                    //deleteRoomById
                    System.out.println("==== Find All Rooms ====");
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void displayGuestOperationsMenu() {
        System.out.println("GuestOperationMenu"); //Step 14
        scanner = new Scanner(System.in);  //Step 15
        boolean exit = false;
        while (!exit) {
            System.out.println("==== Guest Operations ====");
            System.out.println("1. Add a new guest");
            System.out.println("2. Find Guest By ID");
            System.out.println("3. Delete Guest By ID");
            System.out.println("4. Find All Guests");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    //saveGuest
                    System.out.println("==== Add New Guest ====");
                    break;
                case 2:
                    //findGuestById
                    System.out.print("Enter the Guest ID to Find: ");
                    Long guestId = scanner.nextLong();
                    break;
                case 3:
                    //DeleteGuestById
                    System.out.println("==== Delete Guest By ID ====");
                    System.out.print("Enter the Guest ID to delete: ");
                    Long guestIdToDelete = scanner.nextLong();
                    scanner.nextLine(); // Consume the newline character
                    break;
                case 4:
                    //FindAllGuest
                    System.out.println("==== Find All Guests ====");
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void displayReservationOperationsMenu() {
        System.out.println("ReservationOperationMenu"); //Step 14
        scanner = new Scanner(System.in);  //Step 15
        boolean exit = false;
        while (!exit) {
            System.out.println("==== Reservation Operations ====");
            System.out.println("1. Add a new reservation");
            System.out.println("2. Find Reservation By ID");
            System.out.println("3. Find All Reservations");
            System.out.println("4. Delete Reservation By ID");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    System.out.println("==== Add a new reservation ====");
                    //saveReservation
                    break;
                case 2:
                    //step 27e ::findReservationById
                    System.out.print("Enter the reservation ID: ");
                    Long reservationId = scanner.nextLong();
                    scanner.nextLine(); // Consume the newline character
                    break;
                case 3:
                    //step 28e ::findAllReservations
                    System.out.println("==== Find All Reservations ====");
                    break;
                case 4:
                    //deleteReservationById
                    System.out.print("Enter the reservation ID to delete: ");
                    Long reservationIdToDelete = scanner.nextLong();
                    scanner.nextLine(); // Consume the newline character
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
