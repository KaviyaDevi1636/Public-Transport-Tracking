# Real Time Public Transport Tracking System for Small Cities

## Overview
The Real Time Public Transport Tracking System is a Java-based simulation project designed to demonstrate how public transport vehicles such as buses can be monitored and tracked in small cities. The system allows users to view available buses, track a specific bus, and check its current status and estimated arrival time.

This project demonstrates basic concepts of Object-Oriented Programming (OOP) in Java.

---

## Features
- View all available buses in the system
- Track a bus using its bus number
- Display route information
- Show bus status (On Time / Delayed)
- Display estimated arrival time
- Show current location using latitude and longitude

---

## Technologies Used
- Java
- Object-Oriented Programming (OOP)
- ArrayList
- Basic Console Interface

---

## Project Structure

```
Real-Time-Public-Transport-Tracking-System
│
├── Main.java           - Entry point of the program
├── Bus.java            - Stores bus information
├── Location.java       - Stores latitude and longitude
├── TrackingSystem.java - Handles tracking logic
└── README.md           - Project documentation
```
---

## How the System Works
1. The system stores bus details such as bus number, route, location, status, and arrival time.
2. Users can choose options from the menu.
3. The system allows users to:
   - View all buses
   - Track a specific bus
4. The program displays the bus location and estimated arrival time.

---

## Example Output
--- Public Transport Tracking System ---

View All Buses

Track Bus by Number

Exit

---

## Future Improvements
- Integration with GPS for real-time tracking
- Mobile application interface
- Map visualization using APIs
- Database integration

---

## System Architecture

User
  |
  v
+-------------------+
|      Main.java    |
|  (User Interface) |
+-------------------+
          |
          v
+----------------------+
|  TrackingSystem.java |
|    (System Logic)    |
+----------------------+
      |            |
      v            v
+-----------+   +-------------+
|  Bus.java |   | Location.java|
| Bus Data  |   | Lat / Long   |
+-----------+   +-------------+
          |
          v
+-----------------------+
|     Console Output    |
| Bus Status & Arrival  |
+-----------------------+

## System Flowchart

          Start
            |
            v
   +--------------------+
   |   Display Menu     |
   +--------------------+
              |
              v
    +--------------------+
    |  User Selects Menu |
    +--------------------+
               |
               v
   +------------------------------+
   | 1. View All Buses            |
   | → Display Bus Details        |
   +------------------------------+
                 |
                 v
   +------------------------------+
   | 2. Track Bus by Number       |
   | → Search Bus                 |
   | → Show Location & Arrival    |
   +------------------------------+
                 |
                 v
   +------------------------------+
   | 3. Exit Program              |
   +------------------------------+
                 |
                 v
               End

## Sample Output

```
--- Public Transport Tracking System ---

1. View All Buses
2. Track Bus by Number
3. Exit

Enter choice: 1

Bus Number: B101
Route: Central Bus Stand
Status: On Time
Arrival Time: 10 minutes
Location: 10.92 , 78.08

Bus Number: B102
Route: Railway Station
Status: Delayed
Arrival Time: 20 minutes
Location: 10.93 , 78.10
```

## Author
Kaviya Devi S
