package com.company;

import java. util. Scanner;
import java.util.Random;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class ProactiveSD extends SocialBubble{
    public static void main(String[] args) {
        LocationDatabase LocObj = new LocationDatabase(); //Object creation for each nested class within LocationDatabase
        LocationDatabase.Loc1 L1 = LocObj.new Loc1();//Location Database
        LocationDatabase.Loc2 L2 = LocObj.new Loc2();
        LocationDatabase.Loc3 L3 = LocObj.new Loc3();
        LocationDatabase.Loc4 L4 = LocObj.new Loc4();
        LocationDatabase.Loc5 L5 = LocObj.new Loc5();

        ProactiveSD social = new ProactiveSD(); //ProactiveSD

        Random Cap = new Random(); //Random number for capacity

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); //Date and time
        LocalDateTime now = LocalDateTime.now();

        //Variable declarations
        int choice = 0;
        int num_visitors = 0;
        int wait_choice=0;
        double north, south, east, west;
        boolean casualtrue = false;

        do {
            System.out.println("Please pick which location you wish to enter :\n1. One Utama \n2. Mid Valley \n3. Sunway Pyramid \n4. Pavilion \n5. Suria KLCC");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            //Make sure valid number
            while (choice < 0 || choice > 5) {
                System.out.println("Please pick a number from 1 to 5");
                choice = input.nextInt();
                if (choice > 0 && choice < 6) {
                    break;
                }
            }


            switch (choice) {
                case 1:
                    System.out.println("You have chosen One Utama");
                    num_visitors = Cap.nextInt(L1.max_capacity+1); //Calculate number of visitors in building
                    if (num_visitors == L1.max_capacity) { //If the building is at max capacity
                        System.out.println("The average wait time is : " + L1.average_time + " minutes, do you want to wait? (1:Yes, Other:No)"); //Ask whether they want to wait
                        wait_choice = input.nextInt();
                        if (wait_choice == 1) { //Allowed to enter, ask for  distance from other people
                            System.out.println("You are now allowed to enter, please input your distance from other people in the North, East, South, West direction (In metres)");
                            System.out.println("Enter distance for North");
                            north = input.nextDouble();
                            System.out.println("Enter distance for East");
                            east = input.nextDouble();
                            System.out.println("Enter distance for South");
                            south = input.nextDouble();
                            System.out.println("Enter distance for West");
                            west = input.nextDouble();
                            if (north >= 2 && south >= 2 && east >= 2 && west >= 2){ //If customer is social distancing correctly
                                System.out.println("Thank you for social distancing");
                            }
                            else{
                                if (north < 2){ //Less than 2m away from the North
                                    social.MoveBack(north, "North");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (south < 2){ //Less than 2m away from the South
                                    social.MoveBack(south, "South");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (east < 2){ //Less than 2m away from the East
                                    social.MoveBack(east, "East");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (west < 2){ //Less than 2m away from the West
                                    social.MoveBack(west, "West");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (casualtrue == true){
                                    System.out.println("20411640, Ivan Lee Xin Liang, "+L1.location_id+", "+L1.name+", "+DTF.format(now)+", Status : Casual Contact");
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    else { //If the building is not at max capacity
                        System.out.println("You are now allowed to enter, please input your distance from other people in the North, East, South, West direction (In metres)");
                        System.out.println("Enter distance for North");
                        north = input.nextDouble();
                        System.out.println("Enter distance for East");
                        east = input.nextDouble();
                        System.out.println("Enter distance for South");
                        south = input.nextDouble();
                        System.out.println("Enter distance for West");
                        west = input.nextDouble();
                        if (north >= 2 && south >= 2 && east >= 2 && west >= 2){ //If customer is social distancing correctly
                            System.out.println("Thank you for social distancing");
                        }
                        else{
                            if (north < 2){ //Less than 2m away from the North
                                social.MoveBack(north, "North");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (south < 2){ //Less than 2m away from the South
                                social.MoveBack(south, "South");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (east < 2){ //Less than 2m away from the East
                                social.MoveBack(east, "East");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (west < 2){ //Less than 2m away from the West
                                social.MoveBack(west, "West");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (casualtrue == true){
                                System.out.println("20411640, Ivan Lee Xin Liang, "+L1.location_id+", "+L1.name+", "+DTF.format(now)+", Status : Casual Contact");
                            }
                        }
                        System.out.println("Thank you for visiting One Utama");
                        wait_choice = 1;
                    }
                    break;

                case 2:
                    System.out.println("You have chosen Mid Valley");
                    num_visitors = Cap.nextInt(L2.max_capacity+1); //Calculate number of visitors in building
                    if (num_visitors == L2.max_capacity) { //If the building is at max capacity
                        System.out.println("The average wait time is : " + L2.average_time + " minutes, do you want to wait? (1:Yes, Other:No)"); //Ask whether they want to wait
                        wait_choice = input.nextInt();
                        if (wait_choice == 1) { //Allowed to enter, ask for  distance from other people
                            System.out.println("You are now allowed to enter, please input your distance from other people in the North, East, South, West direction (In metres)");
                            System.out.println("Enter distance for North");
                            north = input.nextDouble();
                            System.out.println("Enter distance for East");
                            east = input.nextDouble();
                            System.out.println("Enter distance for South");
                            south = input.nextDouble();
                            System.out.println("Enter distance for West");
                            west = input.nextDouble();
                            if (north >= 2 && south >= 2 && east >= 2 && west >= 2){ //If customer is social distancing correctly
                                System.out.println("Thank you for social distancing");
                            }
                            else{
                                if (north < 2){ //Less than 2m away from the North
                                    social.MoveBack(north, "North");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (south < 2){ //Less than 2m away from the South
                                    social.MoveBack(south, "South");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (east < 2){ //Less than 2m away from the East
                                    social.MoveBack(east, "East");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (west < 2){ //Less than 2m away from the West
                                    social.MoveBack(west, "West");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (casualtrue == true){
                                    System.out.println("20411640, Ivan Lee Xin Liang, "+L2.location_id+", "+L2.name+", "+DTF.format(now)+", Status : Casual Contact");
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    else { //If the building is not at max capacity
                        System.out.println("You are allowed to enter, please input your distance from other people in the North, East, South, West direction (In metres)");
                        System.out.println("Enter distance for North");
                        north = input.nextDouble();
                        System.out.println("Enter distance for East");
                        east = input.nextDouble();
                        System.out.println("Enter distance for South");
                        south = input.nextDouble();
                        System.out.println("Enter distance for West");
                        west = input.nextDouble();
                        if (north >= 2 && south >= 2 && east >= 2 && west >= 2){ //If customer is social distancing correctly
                            System.out.println("Thank you for social distancing");
                        }
                        else{
                            if (north < 2){ //Less than 2m away from the North
                                social.MoveBack(north, "North");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (south < 2){ //Less than 2m away from the South
                                social.MoveBack(south, "South");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (east < 2){ //Less than 2m away from the East
                                social.MoveBack(east, "East");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (west < 2){ //Less than 2m away from the West
                                social.MoveBack(west, "West");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (casualtrue == true){
                                System.out.println("20411640, Ivan Lee Xin Liang, "+L2.location_id+", "+L2.name+", "+DTF.format(now)+", Status : Casual Contact");
                            }
                        }
                        System.out.println("Thank you for visiting Mid Valley");
                        wait_choice = 1;
                    }
                    break;

                case 3:
                    System.out.println("You have chosen Sunway Pyramid");
                    num_visitors = Cap.nextInt(L3.max_capacity+1); //Calculate number of visitors in building
                    if (num_visitors == L3.max_capacity) { //If the building is at max capacity
                        System.out.println("The average wait time is : " + L3.average_time + " minutes, do you want to wait? (1:Yes, Other:No)"); //Ask whether they want to wait
                        wait_choice = input.nextInt();
                        if (wait_choice == 1) { //Allowed to enter, ask for  distance from other people
                            System.out.println("You are now allowed to enter, please input your distance from other people in the North, East, South, West direction (In metres)");
                            System.out.println("Enter distance for North");
                            north = input.nextDouble();
                            System.out.println("Enter distance for East");
                            east = input.nextDouble();
                            System.out.println("Enter distance for South");
                            south = input.nextDouble();
                            System.out.println("Enter distance for West");
                            west = input.nextDouble();
                            if (north >= 2 && south >= 2 && east >= 2 && west >= 2){ //If customer is social distancing correctly
                                System.out.println("Thank you for social distancing");
                            }
                            else{
                                if (north < 2){ //Less than 2m away from the North
                                    social.MoveBack(north, "North");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (south < 2){ //Less than 2m away from the South
                                    social.MoveBack(south, "South");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (east < 2){ //Less than 2m away from the East
                                    social.MoveBack(east, "East");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (west < 2){ //Less than 2m away from the West
                                    social.MoveBack(west, "West");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (casualtrue == true){
                                    System.out.println("20411640, Ivan Lee Xin Liang, "+L3.location_id+", "+L3.name+", "+DTF.format(now)+", Status : Casual Contact");
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    else { //If the building is not at max capacity
                        System.out.println("You are allowed to enter, please input your distance from other people in the North, East, South, West direction (In metres)");
                        System.out.println("Enter distance for North");
                        north = input.nextDouble();
                        System.out.println("Enter distance for East");
                        east = input.nextDouble();
                        System.out.println("Enter distance for South");
                        south = input.nextDouble();
                        System.out.println("Enter distance for West");
                        west = input.nextDouble();
                        if (north >= 2 && south >= 2 && east >= 2 && west >= 2){ //If customer is social distancing correctly
                            System.out.println("Thank you for social distancing");
                        }
                        else{
                            if (north < 2){ //Less than 2m away from the North
                                social.MoveBack(north, "North");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (south < 2){ //Less than 2m away from the South
                                social.MoveBack(south, "South");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (east < 2){ //Less than 2m away from the East
                                social.MoveBack(east, "East");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (west < 2){ //Less than 2m away from the West
                                social.MoveBack(west, "West");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (casualtrue == true){
                                System.out.println("20411640, Ivan Lee Xin Liang, "+L3.location_id+", "+L3.name+", "+DTF.format(now)+", Status : Casual Contact");
                            }
                        }
                        System.out.println("Thank you for visiting Sunway Pyramid");
                        wait_choice = 1;
                    }
                    break;

                case 4:
                    System.out.println("You have chosen Pavilion");
                    num_visitors = Cap.nextInt(L4.max_capacity+1); //Calculate number of visitors in building
                    if (num_visitors == L4.max_capacity) { //If the building is at max capacity
                        System.out.println("The average wait time is : " + L4.average_time + " minutes, do you want to wait? (1:Yes, Other:No)"); //Ask whether they want to wait
                        wait_choice = input.nextInt();
                        if (wait_choice == 1) { //Allowed to enter, ask for  distance from other people
                            System.out.println("You are now allowed to enter, please input your distance from other people in the North, East, South, West direction (In metres)");
                            System.out.println("Enter distance for North");
                            north = input.nextDouble();
                            System.out.println("Enter distance for East");
                            east = input.nextDouble();
                            System.out.println("Enter distance for South");
                            south = input.nextDouble();
                            System.out.println("Enter distance for West");
                            west = input.nextDouble();
                            if (north >= 2 && south >= 2 && east >= 2 && west >= 2){ //If customer is social distancing correctly
                                System.out.println("Thank you for social distancing");
                            }
                            else{
                                if (north < 2){ //Less than 2m away from the North
                                    social.MoveBack(north, "North");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (south < 2){ //Less than 2m away from the South
                                    social.MoveBack(south, "South");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (east < 2){ //Less than 2m away from the East
                                    social.MoveBack(east, "East");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (west < 2){ //Less than 2m away from the West
                                    social.MoveBack(west, "West");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (casualtrue == true){
                                    System.out.println("20411640, Ivan Lee Xin Liang, "+L4.location_id+", "+L4.name+", "+DTF.format(now)+", Status : Casual Contact");
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    else { //If the building is not at max capacity
                        System.out.println("You are allowed to enter, please input your distance from other people in the North, East, South, West direction (In metres)");
                        System.out.println("Enter distance for North");
                        north = input.nextDouble();
                        System.out.println("Enter distance for East");
                        east = input.nextDouble();
                        System.out.println("Enter distance for South");
                        south = input.nextDouble();
                        System.out.println("Enter distance for West");
                        west = input.nextDouble();
                        if (north >= 2 && south >= 2 && east >= 2 && west >= 2){ //If customer is social distancing correctly
                            System.out.println("Thank you for social distancing");
                        }
                        else{
                            if (north < 2){ //Less than 2m away from the North
                                social.MoveBack(north, "North");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (south < 2){ //Less than 2m away from the South
                                social.MoveBack(south, "South");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (east < 2){ //Less than 2m away from the East
                                social.MoveBack(east, "East");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (west < 2){ //Less than 2m away from the West
                                social.MoveBack(west, "West");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (casualtrue == true){
                                System.out.println("20411640, Ivan Lee Xin Liang, "+L4.location_id+", "+L4.name+", "+DTF.format(now)+", Status : Casual Contact");
                            }
                        }
                        System.out.println("Thank you for visiting Pavilion");
                        wait_choice = 1;
                    }
                    break;

                case 5:
                    System.out.println("You have chosen Suria KLCC");
                    num_visitors = Cap.nextInt(L5.max_capacity+1); //Calculate number of visitors in building
                    if (num_visitors == L5.max_capacity) { //If the building is at max capacity
                        System.out.println("The average wait time is : " + L5.average_time + " minutes, do you want to wait? (1:Yes, Other:No)"); //Ask whether they want to wait
                        wait_choice = input.nextInt();
                        if (wait_choice == 1) { //Allowed to enter, ask for  distance from other people
                            System.out.println("You are now allowed to enter, please input your distance from other people in the North, East, South, West direction (In metres)");
                            System.out.println("Enter distance for North");
                            north = input.nextDouble();
                            System.out.println("Enter distance for East");
                            east = input.nextDouble();
                            System.out.println("Enter distance for South");
                            south = input.nextDouble();
                            System.out.println("Enter distance for West");
                            west = input.nextDouble();
                            if (north >= 2 && south >= 2 && east >= 2 && west >= 2){ //If customer is social distancing correctly
                                System.out.println("Thank you for social distancing");
                            }
                            else{
                                if (north < 2){ //Less than 2m away from the North
                                    social.MoveBack(north, "North");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (south < 2){ //Less than 2m away from the South
                                    social.MoveBack(south, "South");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (east < 2){ //Less than 2m away from the East
                                    social.MoveBack(east, "East");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (west < 2){ //Less than 2m away from the West
                                    social.MoveBack(west, "West");
                                    if (social.CasualContact() == 2){ //Randomised casual contact
                                        casualtrue = true;
                                    }
                                }
                                if (casualtrue == true){
                                    System.out.println("20411640, Ivan Lee Xin Liang, "+L5.location_id+", "+L5.name+", "+DTF.format(now)+", Status : Casual Contact");
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    else { //If the building is not at max capacity
                        System.out.println("You are allowed to enter, please input your distance from other people in the North, East, South, West direction (In metres)");
                        System.out.println("Enter distance for North");
                        north = input.nextDouble();
                        System.out.println("Enter distance for East");
                        east = input.nextDouble();
                        System.out.println("Enter distance for South");
                        south = input.nextDouble();
                        System.out.println("Enter distance for West");
                        west = input.nextDouble();
                        if (north >= 2 && south >= 2 && east >= 2 && west >= 2){ //If customer is social distancing correctly
                            System.out.println("Thank you for social distancing");
                        }
                        else{
                            if (north < 2){ //Less than 2m away from the North
                                social.MoveBack(north, "North");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (south < 2){ //Less than 2m away from the South
                                social.MoveBack(south, "South");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (east < 2){ //Less than 2m away from the East
                                social.MoveBack(east, "East");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (west < 2){ //Less than 2m away from the West
                                social.MoveBack(west, "West");
                                if (social.CasualContact() == 2){ //Randomised casual contact
                                    casualtrue = true;
                                }
                            }
                            if (casualtrue == true){
                                System.out.println("20411640, Ivan Lee Xin Liang, "+L5.location_id+", "+L5.name+", "+DTF.format(now)+", Status : Casual Contact");
                            }
                        }
                        System.out.println("Thank you for visiting Suria KLCC");
                        wait_choice = 1;
                    }
                    break;

            }
        }while(wait_choice !=1); //Loop to return to main menu
    }
}

class LocationDatabase {
    //Every location is stored inside a class
    class Loc1 {
        int location_id = 1;
        String name = "One Utama";
        int area = 520000; //square metres
        int average_time = 120; // minutes
        int max_capacity = area / 4; //Each person can be considered a 2x2 m square

    }

    class Loc2 {
        int location_id = 2;
        String name = "Mid Valley";
        int area = 420000;
        int average_time = 110;
        int max_capacity = area / 4;
    }

    class Loc3 {
        int location_id = 3;
        String name = "Sunway Pyramid";
        int area = 400000;
        int average_time = 120;
        int max_capacity = area / 4;
    }

    class Loc4 {
        int location_id = 4;
        String name = "Pavilion";
        int area = 150000;
        int average_time = 100;
        int max_capacity = area / 4;
    }

    class Loc5 {
        int location_id = 5;
        String name = "Suria KLCC";
        int area = 140000;
        int average_time = 120;
        int max_capacity = area / 4;
    }

}

class SocialBubble {
    double c;
    public void MoveBack(double a, String b){
        c = 2 - a;
        System.out.println("Please move "+String.format("%.1f", c)+"m away from the "+b);
    }
    public int CasualContact(){
        Random casual = new Random();
        int casualContact = casual.nextInt(3);
        return casualContact;

    }

}