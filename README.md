# Fullstack CRUD Application

This repository demonstrates a **Fullstack CRUD Application** that showcases the essential Create, Read, Update, and Delete operations. The project is built with **ReactJS**, **Vanilla JavaScript**, **Java Spring Boot**, and integrates with a **MySQL database** for data persistence. It provides a comprehensive example of a modern full-stack solution.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Architecture](#architecture)
- [Setup and Installation](#setup-and-installation)
  - [Prerequisites](#prerequisites)
  - [Backend Setup](#backend-setup)
  - [Frontend Setup](#frontend-setup)
  - [Database Setup](#database-setup)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributing](#contributing)

---

## Features
- User management with Create, Read, Update, and Delete operations.
- Frontend implemented in **ReactJS** and **Vanilla JavaScript**.
- Backend powered by **Java Spring Boot**.
- Database integration using **MySQL** for persistent storage.

---

## Technologies Used

### Frontend:
- **ReactJS**: For dynamic UI development.
- **Vanilla JavaScript**: For simpler frontend implementations.
- **HTML5**, **CSS3**, and **JavaScript**: Core web technologies.

### Backend:
- **Java Spring Boot**: For creating RESTful APIs.
- **MySQL**: For relational database management.
- **Maven**: Build automation and dependency management.

---

## Architecture
The application follows a standard **three-tier architecture**:
1. **Frontend**: User interface built with ReactJS and Vanilla JavaScript.
2. **Backend**: RESTful API services implemented with Java Spring Boot.
3. **Database**: MySQL for persistent data storage.

---

## Setup and Installation

### Prerequisites
1. **Node.js** and **npm/yarn** (for React frontend).
2. **Java JDK 8+** and **Maven** (for backend).
3. **MySQL** installed and running locally or remotely.
4. A code editor (e.g., Visual Studio Code, IntelliJ IDEA).

---

### Frontend Setup

#### ReactJS Frontend
1. Navigate to the ReactJS frontend directory:
   ```bash
   cd front-user (react js)
   ```
   
2. Install dependencies and start the development server:
   ```bash
   npm install
   npm run dev
   ```

#### Vanilla JavaScript Frontend
1. Navigate to the Vanilla JavaScript frontend directory:
   ```bash
   cd front-user (vanilla js)
   ```
2. Open `index.html` in your browser to view the application.

---

### Backend Setup
1. Navigate to the backend directory:
   ```bash
   cd src
   ```
2. Configure the MySQL database in `application.properties`:
   ```properties

   #MySQL Configuration
    spring.datasource.url=jdbc:mysql://localhost:3306/YOUR_DATABASE_NAME
    spring.datasource.username=YOUR_USERNAME
    spring.datasource.password=YOUR_PASSWORD
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

    #Hibernate configurations
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
   ```
3. Build and run the backend application:
   ```bash
   mvn install
   mvn spring-boot:run
   ```

---

### Database Setup
1. Create a new database in MySQL:
   ```sql
   CREATE DATABASE fullstack_crud;
   ```
2. Update the `application.properties` file with your MySQL credentials (refer to the [Backend Setup](#backend-setup) section).

---

## Usage
1. Start the backend server using Spring Boot.
2. Run the desired frontend (ReactJS or Vanilla JavaScript).
3. Access the application in your web browser:
   - For ReactJS: `http://localhost:3000`
   - For Vanilla JavaScript: Open `index.html` directly.

---

## Project Structure
```plaintext
fullstack-crud/
├── src/                      # Backend Java Spring Boot source code
├── front-user (react js)/    # ReactJS frontend
├── front-user (vanilla js)/  # Vanilla JS frontend
├── pom.xml                   # Maven configuration
└── README.md                 # Documentation
```

---

## Contributing
Contributions are welcome! Please follow these steps:
1. Fork this repository.
2. Create a new branch for your feature or bug fix:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes and push the branch:
   ```bash
   git commit -m "Add new feature"
   git push origin feature-name
   ```
4. Submit a pull request for review.

