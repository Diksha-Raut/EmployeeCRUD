# EmployeeCRUD
Employee Crud Operations Using RESTAPI

# Spring Boot Project Setup Guide with MySQL and Spring Tool Suite (STS)

This guide will help you set up a Spring Boot project using MySQL as the database and Spring Tool Suite (STS) as the IDE.

## Prerequisites
- Java Development Kit (JDK) installed on your machine
- Spring Tool Suite (STS) installed on your machine
- MySQL installed on your machine
- Basic knowledge of Java and Spring Boot

## Steps

1. Extract zip file to local machine:

2. Open Spring Tool Suite (STS) and import the project:
- File -> Import -> Existing Maven Projects
- Browse to the location of the cloned repository and select the project folder
- Click "Finish" to import the project into STS

3. Configure MySQL database:
- Open MySQL Workbench or any MySQL client tool
- Create a new database named `emp_sys`

4. Update application.properties file:
- Open `src/main/resources/application.properties` file
- Update the database connection properties with your MySQL credentials:
  ```
  spring.datasource.url=jdbc:mysql://localhost:3306/emp_sys
  spring.datasource.username=your-username
  spring.datasource.password=your-password
  ```

5. Run the application:
- Right-click on the project in STS -> Run As -> Spring Boot App
- The application should start up and be accessible at http://localhost:8080


This Postman Collection provides a set of pre-defined requests to interact with the Employee Management System API.

## Prerequisites

- Postman installed on your system

## Getting Started

1. Download and install Postman from [https://www.postman.com/downloads/](https://www.postman.com/downloads/).




- **Add Employee:** Use the `Add Employee` request to add a new employee to the system.
  - create POST request = http://localhost:8080/employees
  - select Body-> raw = JSON object containing employee details (EmployeeName, PhoneNumber, Email, ReportsTo, ProfileImage)
  - Example Body:
    ```
    {
        "EmployeeName": "John Doe",
        "PhoneNumber": "1234567890",
        "Email": "john.doe@example.com",
        "ReportsTo": "1",
        "ProfileImage": "https://example.com/profile.jpg"
    }
    ```

- **Get All Employees:** Use the `Get All Employees` request to retrieve a list of all employees in the system.
  - Endpoint: GET http://localhost:8080/employees

- **Delete Employee by ID:** Use the `Delete Employee by ID` request to delete an employee by their ID.
  - Endpoint: DELETE http://localhost:8080/employees/{employeeId}

- **Update Employee by ID:** Use the `Update Employee by ID` request to update an existing employee's information.
  - create PUT request = http://localhost:8080/employees/{employeeId}
  - select -> Body -> raw = JSON object containing updated employee details (EmployeeName, PhoneNumber, Email, ReportsTo, ProfileImage)
  - Example Body:
    ```
    {
        "EmployeeName": "Updated Name",
        "PhoneNumber": "9876543210",
        "Email": "updated.email@example.com",
        "ReportsTo": "new-manager-id",
        "ProfileImage": "https://example.com/updated-profile.jpg"
    }
    ```

OR

You can import databse in mysql using employee.csv and perform operations using postman API


## Support

If you encounter any issues or have any questions, please feel free to contact us at diksharaut2511@gmail.com


