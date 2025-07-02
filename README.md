# 🗂️ DAO Database Project

![License](https://img.shields.io/github/license/PeeterDalVitt/demo-dao-dbc)

## 📝 Overview

This is a Java-based DAO architecture project created using **Eclipse IDE** and **MySQL**. It demonstrates CRUD operations via JDBC and showcases how to cleanly separate data persistence logic using the DAO design pattern.

Entities like `Seller` and `Department` are mapped to corresponding database tables and managed through DAO interfaces and implementations.

## 📦 Project Structure

- `application`: Contains the main `Program.java` to run and test all database operations.
- `db`: Handles connection creation and closure, exception handling, and properties loading.
- `model.entities`: Includes data models for the `Seller` and `Department` entities.
- `model.dao`: Contains interfaces for DAO abstraction (`SellerDao`, `DepartmentDao`).
- `model.dao.impl`: Implements DAO interfaces using raw JDBC queries (`SellerDaoJDBC`, `DepartmentDaoJDBC`).

## 🚀 Features

- 🔍 **Find by ID**: Fetch seller or department by ID.
- 🏢 **Find by Department**: List sellers in a specific department.
- 📋 **List All**: Retrieve all sellers and departments.
- ➕ **Insert**: Add new seller or department entries.
- 🔄 **Update**: Modify existing records.
- ❌ **Delete**: Remove entries by ID.

## 🛠️ How to Run

Here’s a quick and friendly guide for getting things up and running:

1. 🗃️ **Create Your Database**  
   Manually set up your MySQL database with tables for `department` and `seller`. Make sure it aligns with your Java entity fields.

2. ⚙️ **Configure Connection**  
   Set up a `db.properties` file at the root of your project with something like:

dburl=jdbc:mysql://localhost:3306/your_database_name 

user=root password=your_password

3. 🔌 **Connection Handling**  
The `DB.java` class takes care of creating and maintaining the database connection using `DriverManager`. It loads your properties from the `db.properties` file and handles opening/closing statements and result sets gracefully.

4. ▶️ **Run the Application**  
Open the project in Eclipse and run `Program.java` inside the `application` package. You’ll see test output for each CRUD operation like:
- Find by ID
- Find by Department
- Insert new data
- Update entries
- Delete records

5. ✨ **Enjoy the DAO Magic**  
The DAO pattern keeps everything neat and modular. Each DAO class (like `SellerDaoJDBC`) encapsulates operations through methods like `insert`, `update`, `findById`, etc.—making your code reusable and well-organized.

## 📜 License

This project is licensed under the [MIT License](https://github.com/PeeterDalVitt/demo-dao-dbc/blob/main/LICENSE).
