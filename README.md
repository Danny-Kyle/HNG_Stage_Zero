# HNG internship Backend Track Stage Zero Assignment

## Project Description
This is a simple REST API built using **Spring Boot 3.4.2** and **Java 21**. The API returns user information, including:
- Email
- Current timestamp in **ISO 8601** format
- GitHub repository URL of the project

The API also supports **CORS** to allow cross-origin requests.
---

## Setup Instructions

### **1. Prerequisites**
Ensure you have the following installed on your machine:
- [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com/)

### **2. Clone the Repository**
```sh
git clone https://github.com/Danny-Kyle/HNG_Stage_Zero.git
cd your-repo
```

### **3. Build the Project**
```sh
mvn clean install
```

### **4. Run the Application**
```sh
mvn spring-boot:run
```
The application will start on **http://localhost:8080**.

---

## API Documentation

### **Endpoint**
- **GET /api/user** - Returns user information in JSON format.

### **Request Format**
No request body required.

### **Response Format**
```json
{
  "email": "dikedaniel7917@gmail.com",
  "github_url": "https://github.com/Danny-Kyle/HNG_Stage_Zero",
  "current_datetime": "2025-02-01T16:02:40.729643700Z"
}
```

### **Example Usage**
Using **cURL**:
```sh
curl -X GET http://localhost:8080/api/user
```

Using **Postman**:
1. Open Postman.
2. Set method to `GET`.
3. Enter `http://localhost:8080/api/user`.
4. Click **Send**.

---

## 🔧 Technologies Used
- **Java 21**
- **Spring Boot 3.4.2**
- **Maven**
- **Spring Web** (for REST API)
- **CORS Configuration**

---

## 📜 License
This project is licensed under the [MIT License](LICENSE).

---

## 🤝 Contributing
1. Fork the repository.
2. Create a new branch: `git checkout -b feature-branch`
3. Commit your changes: `git commit -m "Added a new feature"`
4. Push to the branch: `git push origin feature-branch`
5. Submit a pull request!

---

## 📞 Contact
For any inquiries or feedback, reach out via:
- Email: `dikedaniel7917@gmail.com`
- GitHub Issues: [Open an Issue](https://github.com/Danny-Kyle/HNG_Stage_Zero/issues)


- HNG Link: `https://hng.tech/hire/java-developers`

