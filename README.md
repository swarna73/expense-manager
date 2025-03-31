#  Expense Tracker REST API

A simple and modular Expense Tracker built with **Spring Boot**, **Spring Data JPA**, and **H2 Database**.  
Users can log expenses by category, view reports, and manage their data via RESTful APIs.

---

##  Features

- CRUD operations for Users, Categories, and Expenses
- Filter expenses by user and date range
- Built-in Swagger UI for testing and documentation
- H2 in-memory database for fast prototyping
- Clean layered architecture (Controller → Service → Repository → Entity)

---

##  Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Data JPA (with Hibernate)
- H2 Database
- Lombok
- Swagger/OpenAPI (SpringDoc)

---

##  Project Structure

com.swarnalatha.expensetracker
├── controller
├── entity
├── repository
├── service
└── ExptrackApplication.java

---

## ⚙Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/<your-username>/expense-tracker.git
cd expense-tracker

2. Build and Run

Make sure you have Java 17+ and Maven installed.

./mvnw spring-boot:run



⸻

🔄 API Endpoints

Users

Method	Endpoint	Description
POST	/api/users	Create a new user
GET	/api/users	Get all users
GET	/api/users/{id}	Get user by ID
DELETE	/api/users/{id}	Delete user

Categories

Method	Endpoint	Description
POST	/api/categories	Create a new category
GET	/api/categories	Get all categories

Expenses

Method	Endpoint	Description
POST	/api/expenses	Create a new expense
GET	/api/expenses/user/{userId}	Get all expenses for user
GET	/api/expenses/user/{userId}/range?from=YYYY-MM-DD&to=YYYY-MM-DD	Filter expenses by date range
DELETE	/api/expenses/{id}	Delete expense



⸻

🔍 API Documentation (Swagger UI)

Once the app is running, visit:

http://localhost:8080/swagger-ui.html

Use the interface to explore and test all API endpoints.

⸻

🧪 Sample JSON: Create an Expense

{
  "description": "Uber Ride",
  "amount": 18.75,
  "date": "2025-03-30",
  "user": { "id": 1 },
  "category": { "id": 2 }
}



⸻

🛤️ Roadmap
	•	✅ Basic CRUD with JPA & H2
	•	🔄 JWT Authentication (Coming Soon)
	•	📈 Monthly summary reports
	•	💾 PostgreSQL integration

⸻

👩‍💻 Author

Swarnalatha Swaminathan
Fintech Enthusiast | Java Backend Developer
https://www.linkedin.com/in/swarnalathatech/

⸻

📝 License

This project is licensed under the MIT License - see the LICENSE file for details.
