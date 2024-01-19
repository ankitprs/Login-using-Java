# Login Microservice in Java

## Project Description

This project is a Login Microservice implemented in Java using the Spring Boot framework. It provides a secure and scalable solution for user authentication and authorization, employing JSON Web Tokens (JWT) for secure communication.


## Project Features
 - **User Authentication and Authorization**: The microservice allows users to securely authenticate via the login endpoint, generating a JWT upon successful authentication. This token is required to access protected resources.

 - **User Registration (Signup)**: Users can create new accounts using the signup endpoint. User details are stored securely in the H2 database.

 - **Hello Endpoint**: A simple hello endpoint is provided, accessible only post-authentication. It responds with "Hello from GreenStitch."


## Project Setup

1. Clone the repository: `git clone <repository-url>`
2. Navigate to the project directory: `cd <project-directory>`
3. Run the application: `./mvnw spring-boot:run`

## API Endpoints

- POST /api/auth/login
    - Body: {"username": "user", "password": "password"}
    - Response: JWT token

- POST /api/auth/signup
    - Body: {"username": "newUser", "password": "newPassword"}
    - Response: "User registered successfully"

- GET /api/hello
    - Requires JWT token in the Authorization header
    - Response: "Hello from GreenStitch"

## Dependencies

- Spring Boot
- Spring Security
- H2 Database
- JSON Web Token (JWT)
