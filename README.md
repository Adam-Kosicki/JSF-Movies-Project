# Movie Theater Management System

This project is a Java-based application for managing movie theaters, movies, and showtimes. It allows users to view a list of theaters, movies, and their showtimes, as well as make purchases for movie tickets.

## Technologies Used

- Java
- JavaServer Faces (JSF)
- Enterprise JavaBeans (EJB)
- Java Persistence API (JPA)
- Java Database Connectivity (JDBC)
- MySQL (Database)

## Overview

The project consists of several Java classes and entities that enable the management of movie theaters, movies, and showtimes. It utilizes JavaServer Faces (JSF) for the web interface, Enterprise JavaBeans (EJB) for business logic, and Java Persistence API (JPA) for database operations. The project interacts with a MySQL database to store information about theaters, movies, and showtimes.

## Code Structure

The project contains the following Java classes and entities:

### `movieEJB.java`

This class is a stateless Enterprise JavaBean (EJB) that serves as the business logic for managing movie theaters, movies, and showtimes. It contains methods for retrieving information from the database, such as finding all theaters, getting theater details, finding movies for a specific theater, and finding showtimes for a particular movie at a given theater.

### `Movies.java`

This entity class represents movies in the application. It contains attributes such as `movieid`, `title`, and `description`, which store information about each movie.

### `Theaters.java`

This entity class represents theaters in the application. It contains attributes such as `theaterid`, `name`, and `location`, which store information about each theater.

### `Playing.java`

This entity class represents the relationship between movies and theaters, which stores information about showtimes. It contains a composite primary key `PlayingPK` that includes `theaterid`, `movieid`, `dayofshowing`, and `timeofshowing`.

### `PlayingPK.java`

This class represents the composite primary key for the `Playing` entity. It contains attributes for `theaterid`, `movieid`, `dayofshowing`, and `timeofshowing`.

### Beans

The project also includes several managed beans that handle the presentation logic for different pages:

- `ShowTheaterBean.java`: Handles displaying information about a specific theater, including the list of movies playing at that theater.
- `MainPageBean.java`: Handles displaying the main page with a list of all available theaters.
- `PurchasePageBean.java`: Handles the purchase page where users can buy movie tickets.

## Getting Started

To run this project, you need to have the following software installed:

1. Java Development Kit (JDK)
2. Java IDE (Eclipse, NetBeans, IntelliJ, etc.)
3. MySQL Database Server

## Installation

1. Clone the repository from GitHub:


2. Import the project into your Java IDE.

3. Set up the database schema using the provided SQL scripts.

4. Configure the database connection properties in the `persistence.xml` file.

5. Deploy the application to your Java EE application server.

## Features

- View a list of theaters and their details.
- View a list of movies and their descriptions.
- View showtimes for each movie at different theaters.
- Purchase movie tickets with credit card information.

## Usage

1. Run the application on your Java EE application server.
2. Access the main page to see a list of available theaters.
3. Click on a theater to see a list of movies playing at that theater.
4. Click on a movie to view its description and available showtimes.
5. Select a showtime and the number of tickets to purchase.
6. Provide credit card information and complete the purchase.


