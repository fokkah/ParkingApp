package se.lexicon.controller;

import se.lexicon.dao.CustomerDao;
import se.lexicon.dao.CustomerDaoImpl;
import se.lexicon.model.Customer;
import se.lexicon.view.ConsoleUI;

public class ParkingController {

    ConsoleUI consoleUI;
    CustomerDao customerDao;


    public ParkingController() {
        consoleUI = new ConsoleUI();
        customerDao = new CustomerDaoImpl();
    }

    public void run() {
        boolean running = true;
        while (running) {
            consoleUI.displayMenu();
            String choice = consoleUI.getInput("Choose an option: "); // get use choice

            switch (choice) {
                case "1":
                    registerCustomer();
                    break;
                case "2":
                    displayParkingSpots();
                    break;
                case "3":
                    reserveParkingSpot();
                    break;
                case "4":
                    vacateParkingSpot();
                    break;
                case "5": {
                    consoleUI.displayMessage("Exiting the app. Goodbye!");
                    running = false;
                    break;
                }
                default:
                    consoleUI.displayMessage("Invalid Option. Please try again.");
            }


        }
    }

    private void registerCustomer() {

        Customer customerData = consoleUI.getCustomerInfoWithVehicle();
        Customer createdCustomer = customerDao.create(customerData);
        consoleUI.displaySuccessMessage("Customer registered successfully with Id: " + createdCustomer.getId());

    }




    private void displayParkingSpots() {
        // todo implement later
    }


    private void reserveParkingSpot() {
        // todo implement later
    }


    private void vacateParkingSpot() {
        // todo implement later
    }


}
