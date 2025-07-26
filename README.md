# CareCompare - Healthcare Comparison Platform

CareCompare is a comprehensive healthcare comparison and management platform that allows users to compare insurance plans, find hospitals that accept their insurance, schedule appointments, and track medical records.

## Features

- **Authentication**: Secure login and registration with JWT tokens
- **User Profiles**: Manage personal information and contact details
- **Insurance Plans**: View and compare insurance plan benefits and coverage
- **Hospital Finder**: Locate hospitals that accept specific insurance policies
- **Appointment Booking**: Schedule medical appointments with hospitals and doctors
- **Treatment Information**: Get explanations of medical treatments in simple terms
- **Symptom Checker**: Check symptoms and get possible conditions and advice
- **Dashboard**: View and compare insurance plans and other healthcare information

## Technology Stack

- **Backend**: Spring Boot (Java) with MVC architecture
- **Database**: PostgreSQL for relational data storage
- **Security**: JWT for stateless authentication
- **Frontend** (planned): React with Vite

## Prerequisites

- Java 17 or newer
- Maven
- PostgreSQL

## Database Setup

1. Install PostgreSQL on your system
2. Create a new database:
```sql
CREATE DATABASE carecompare;
```
3. Configure database connection in `src/main/resources/application.properties`:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/carecompare
spring.datasource.username=postgres
spring.datasource.password=your_password
```

## Building and Running

### Backend Setup

1. Clone the repository:
```bash
git clone https://github.com/your-username/carecompare.git
cd carecompare
```

2. Build the application:
```bash
mvn clean package
```

3. Run the application:
```bash
java -jar target/care-compare-app-0.0.1-SNAPSHOT.jar
```

4. The application will start on http://localhost:8080

## API Documentation

Once the application is running, you can access the API documentation at:
- http://localhost:8080/ - Interactive HTML documentation
- http://localhost:8080/api/docs - JSON API documentation

## Testing the API

You can use tools like Postman or curl to test the API endpoints:

### Authentication Example

```bash
# Login
curl -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{"username":"admin","password":"admin123"}'
```

### Using JWT Token

```bash
# Get user profile (replace TOKEN with the actual token from login)
curl -X GET http://localhost:8080/api/profile/1 \
  -H "Authorization: Bearer TOKEN"
```

## Future Enhancements

1. Frontend implementation with React and Vite
2. Enhanced LLM integration for treatment explanations
3. Advanced symptom checking with more accurate condition matching
4. Insurance plan recommendation based on user medical history
5. Map integration for finding nearby hospitals

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is licensed under the MIT License - see the LICENSE file for details. 