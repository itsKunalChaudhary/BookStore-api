Here you go! 📄 Below is the full `README.md` content — simply:

1. Open IntelliJ or your code editor
2. Create a new file in your project root called `README.md`
3. Copy and paste the following into it
4. Save, commit, and push to GitHub 🚀

---

### ✅ `README.md`

```markdown
# 📚 Bookstore API

A RESTful API built using Spring Boot with JWT-based authentication and role-based access control. This project simulates a backend for a bookstore, enabling users to sign up, log in, and interact with books based on their roles (`USER` or `ADMIN`).

---

## 🧰 Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Security 6 (with JWT)
- PostgreSQL
- Maven

---

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/bookstore-api.git
cd bookstore-api
```

### 2. Configure the Database

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/bookstore
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

> Ensure PostgreSQL is running and the database `bookstore` is created.

### 3. Run the Application

```bash
./mvnw spring-boot:run
```

Server will start at:  
`http://localhost:8080`

---

## 🔐 User Roles

| Role  | Description                     |
|-------|---------------------------------|
| USER  | Can view books                  |
| ADMIN | Can add, update, delete books   |

To make a user an admin:

```sql
UPDATE users SET role = 'ROLE_ADMIN' WHERE email = 'admin@example.com';
```

---

## 🧪 API Endpoints

### ✅ Authentication

**Sign Up**  
`POST /api/auth/signup`

```json
{
  "email": "user@example.com",
  "password": "password123"
}
```

**Login**  
`POST /api/auth/login`

```json
{
  "email": "user@example.com",
  "password": "password123"
}
```

**Response**

```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR..."
}
```

---

### 📚 Book APIs

**Get All Books**  
`GET /api/books`  
_Role: USER / ADMIN_

**Add Book**  
`POST /api/books`  
_Role: ADMIN_

```json
{
  "title": "1984",
  "author": "George Orwell",
  "description": "Dystopian novel"
}
```

**Update Book**  
`PUT /api/books/{id}`  
_Role: ADMIN_

```json
{
  "title": "Updated Title",
  "author": "Updated Author",
  "description": "Updated description"
}
```

**Delete Book**  
`DELETE /api/books/{id}`  
_Role: ADMIN_

---

## 📌 Assumptions

- Users are created with the `ROLE_USER` role by default
- Admins must be promoted manually via SQL
- JWT token is used in `Authorization` header for all protected endpoints
- Database schema is auto-generated (`spring.jpa.hibernate.ddl-auto=update`)

---

## 🚀 Possible Enhancements

- Swagger/OpenAPI documentation
- Pagination and filtering for book listing
- Book cover image upload
- Email verification and password reset
- Admin dashboard or analytics
- React or Angular frontend client

---

## 📜 License

MIT License
```

---

Let me know when you’re ready to push this to GitHub, or if you want help writing a `.gitignore` or deploying the project online!