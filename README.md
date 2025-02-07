
# 🏥 SUST Medical Centre Management System

A simple Java console application that simulates a basic medical center management system. It supports multiple user roles—**Doctors**, **Patients**, and **Pharmacists**—each with distinct functionalities. This project is designed to demonstrate object-oriented programming (OOP) principles, exception handling, and basic user authentication.

---

## 🚀 Features

- **User Authentication:**  
  Secure login for Doctors, Patients, and Pharmacists using predefined credentials.

- **Role-Based Functionalities:**  
  - **Doctor:** Prescribe medicine to patients.
  - **Patient:** View prescribed medications.
  - **Pharmacist:** Manage medicine stock (simulated).

- **Error Handling:**  
  Robust input validation and exception handling to prevent crashes due to invalid inputs.

- **Object-Oriented Design:**  
  Implements abstraction, inheritance, and polymorphism through an abstract `User` class.

---

## 🛠️ Technologies Used

- **Java**: Core programming language.
- **OOP Principles**: Abstraction, Inheritance, Polymorphism.
- **Data Structures**: `ArrayList` for managing users and prescriptions.
- **Exception Handling**: Manages invalid inputs using `try-catch` blocks.

---

## 📥 Getting Started

### Prerequisites

- **Java Development Kit (JDK)** installed on your system.
- A text editor or IDE like **IntelliJ IDEA**, **Eclipse**, or **VS Code** with Java support.

### Running the Project

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/medical-center-system.git
   cd medical-center-system

2. Compile & Run

   javac MedicalCenterSystem.java
   java MedicalCenterSystem
   
3.Sample Login Credentials:

Role	    Username	Password
Doctor	  doctor	      d
Pharmacist pharmacist	p
Patient	  2007331039	mokarrom

How to Use

Login:
Run the program and enter your username and password based on the role you want to simulate.
Role-Based Menus:
Doctors can prescribe medicine by entering the patient’s username and prescription details.
Patients can view their prescriptions after logging in.
Pharmacists can simulate managing medicine stock.
Logout:
After performing the required actions, select the logout option to return to the login screen.


🐛 Error Handling

Invalid Input Handling:
The program checks for incorrect data types when selecting menu options, ensuring it doesn’t crash on invalid inputs.
Login Validation:
Displays user-friendly messages for incorrect login credentials.
Exception Logging:
Captures and displays unexpected errors for easier debugging.


🚀 Future Enhancements

Database Integration:
Replace the in-memory ArrayList with a persistent database like MySQL or SQLite.
Graphical User Interface (GUI):
Develop a GUI using JavaFX or Swing to enhance user experience.
User Registration:
Implement dynamic user creation and password recovery features.
Security Improvements:
Add password hashing and more robust authentication mechanisms.
Unit Testing:
Use JUnit to add test cases for critical functionalities.

📄 License

This project is open-source and available under the MIT License.

🤝 Contributing

Contributions are welcome! If you'd like to improve this project, follow these steps:

Fork the repository.
Create a new branch (git checkout -b feature-branch).
Make your changes and commit (git commit -m 'Add new feature').
Push to the branch (git push origin feature-branch).
Open a Pull Request.

🙌 Acknowledgements

Developed as part of a learning exercise on Java and Object-Oriented Programming.
Inspired by real-world medical management systems.


---

### **Next Steps:**

1. **Save the README file:**
   - Create a `README.md` file in your project folder and paste the content above.

2. **Upload to GitHub:**
   If you haven't pushed the project to GitHub yet:
   ```bash
   git init
   git add .
   git commit -m "Initial commit: Medical Center System"
   git remote add origin https://github.com/your-username/medical-center-system.git
   git push -u origin main

Happy Coding! 🎉
