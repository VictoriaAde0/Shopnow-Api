# ShopNow E-commerce API

## Introduction
ShopNow is an open-source e-commerce API built with Spring Boot, MySQL database, Flyway for database migrations, Lombok for boilerplate code reduction, and Jakarta Validation for input validation.

## Features
Product Management
Create a Product: Add new products with essential details like name, description, price, and stock quantity.
Get All Products: Retrieve a list of all available products in the catalog.
Get Product by ID: Obtain detailed information about a specific product using its unique identifier.
Order Management
Create an Order: Allow customers to place orders by specifying products and quantities.
Get All Orders: View a list of all orders, including order details and items.
Get Order by ID: Access specific order details using its unique identifier.
# Technical Stack
Framework: Spring Boot
Database: MySQL
Documentation: Swagger/OpenAPI
Getting Started
Prerequisites
Ensure you have the following installed:

Java Development Kit (JDK)
MySQL Database, or any working Database
A working Backend server(Springboot)
# Installation
Clone the repository: git clone https://github.com/VictoriaAde0/ShoplineApi.git
Navigate to the directory --cd ShoplineApi
Build the Project --./mvnw clean install
# Configuration
Configure the MySQL database properties:
Open src/main/resources/application.properties and set the appropriate database configurations.
Run the application: --./mvnw spring-boot:run
The API will be accessible at http://localhost:8080.
# API Documentation
Explore and interact with the API using Swagger documentation available at http://localhost:8080/swagger-ui.html.
Authentication: Allow users to register, log in, and manage their accounts.
Product Catalog: Display a range of products with search and filter options.
Shopping Cart: Enable users to add products to their cart and proceed to checkout.
Order Management: Track orders and provide updates to users.
Admin Dashboard: Efficiently manage products, orders, and user accounts.
# Technologies Used
Frontend: HTML, CSS, JavaScript Backend: Springboot.

# Contributing
Contributions are welcome! Please follow the guidelines outlined in CONTRIBUTING.md.

# License
This project is licensed under the MIT License - see the LICENSE file for details.
