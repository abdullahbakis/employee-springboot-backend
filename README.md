# Employee Spring Boot React Full Stack
This is a full stack application that allows users to manage a list of employees. The frontend is built with React and the backend is built with Spring Boot.

## Features
Add, edit, and delete employees
View a list of employees
Search for employees by name or job title
## Technologies
React
Spring Boot
MySQL
## Requirements
Node.js
MySQL
## Setup
Clone the repository
  git clone https://github.com/abdullahbakis/employee-springboot-react-full-stack.git
Install the dependencies
  cd employee-springboot-react-full-stack/frontend
  npm install
    cd ../backend
mvn install
Set up the database
Create a MySQL database and run the employee.sql script to create the employee table
Update the database credentials in the application.properties file
Start the backend server
  cd backend
  mvn spring-boot:run
Start the frontend server
  cd frontend
  npm start
Open the application in a browser at http://localhost:3000
# Author
Abdullah Bakış - abdullahbakis
# License
This project is licensed under the MIT License - see the LICENSE file for details.
