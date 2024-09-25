# LabSeq

This project is an application with both frontend and backend components. Below are the instructions for setting up and running the application.

## Table of Contents
- [LabSeq](#labseq)
  - [Table of Contents](#table-of-contents)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
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

- `http://localhost:8080/q/swagger-ui`

## Features

- **API Integration**: Seamless communication between frontend and backend.
- **LabSeq Sequence**: Ability to return a value from the labseq sequence.
