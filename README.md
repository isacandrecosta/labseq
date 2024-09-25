# LabSeq

This project is an application with both frontend and backend components. Below are the instructions for setting up and running the application.

## Table of Contents
- [LabSeq](#labseq)
  - [Table of Contents](#table-of-contents)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
    - [Using Docker](#using-docker)
      - [Steps to Build the Docker Image](#steps-to-build-the-docker-image)
      - [Steps to Start the Containers](#steps-to-start-the-containers)
      - [Access the Application](#access-the-application)
      - [Stop the Containers](#stop-the-containers)
    - [Frontend](#frontend)
    - [Backend](#backend)
    - [API Documentation](#api-documentation)
  - [Features](#features)

## Prerequisites

Before you begin, ensure you have met the following requirements:
- Node.js (version 14.x or later)
- npm (version 6.x or later)
- Java (version 11 or later)
- Maven (version 3.6.3 or later)
- Docker
- Docker Compose

## Installation

1. Clone the repository:
        ```sh
        git clone https://github.com/isacandrecosta/labseq.git
        cd labseq
        ```

2. Install dependencies for both frontend and backend:
        ```sh
        cd frontend
        npm install
        cd ../backend
        mvn clean install
        ```

## Running the Application

### Using Docker

You can use Docker to build and run the application easily.

#### Steps to Build the Docker Image

1. **Build the Docker Image:**

   Make sure you are in the root directory of the project where the `docker-compose.yml` file is located and run the command:

   ```sh
   docker-compose build
   ```
   
#### Steps to Start the Containers

 1. **Start the Containers:**

   After successfully building the images, start the containers:

   ```sh
   docker-compose up
   ```

2. **Check the Logs:**

   Check the logs in the terminal to ensure all services have started correctly.

#### Access the Application

   - Backend: Access the backend in the browser or using a tool like curl or Postman. If the backend is configured to run on port 8080, you can access http://localhost:8080/api/labseq/2

   - Frontend: Access the frontend in the browser. If the frontend is configured to run on port 80, you can access http://localhost

#### Stop the Containers

   To stop the containers, you can use the command:

   ```sh
   docker-compose up
   ```

### Frontend

1. Navigate to the frontend directory:
        ```sh
        cd frontend
        ```

2. Start the frontend server:
        ```sh
        npm start
        ```

3. Open your browser and navigate to `http://localhost:4200`.

### Backend

1. Navigate to the backend directory:
        ```sh
        cd backend
        ```

2. Start the backend server:
        ```sh
        mvn quarkus:dev
        ```

3. The backend server will be running on `http://localhost:8080`.


### API Documentation

The API documentation is available via Swagger. Once the backend server is running, you can access the Swagger UI at:

- `http://localhost:8080/swagger-ui/`

## Features

- **API Integration**: Seamless communication between frontend and backend.
- **LabSeq Sequence**: Ability to return a value from the labseq sequence.
