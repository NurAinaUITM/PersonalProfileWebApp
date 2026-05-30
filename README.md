# Personal Profile Web Application

## Project Overview

This project is a simple **Personal Profile Web Application** developed using:

* HTML
* CSS
* Java Servlet
* JSP
* GlassFish Server
* NetBeans IDE 8.2

The application allows users to submit their personal information through an HTML form. The submitted data is processed using a Java Servlet and displayed neatly on a JSP page.

---

# Objectives

The objectives of this project are:

* To understand the integration between HTML, Servlet, and JSP.
* To practice handling HTTP POST requests.
* To design a responsive and user-friendly web interface.
* To display dynamic content using JSP technology.

---

# Features

## User Information Form

The application collects the following user information:

* Full Name
* Student ID
* Program
* Email
* Hobbies
* Short Self-Introduction

---

# System Flow

1. User opens the HTML form page.
2. User enters personal information.
3. Form data is submitted using the **HTTP POST** method.
4. Servlet receives and processes the data.
5. Processed data is forwarded to the JSP page.
6. JSP displays the submitted information neatly.

---

# Technologies Used

| Technology       | Purpose                 |
| ---------------- | ----------------------- |
| HTML             | Create form interface   |
| CSS              | Styling and layout      |
| Java Servlet     | Process form requests   |
| JSP              | Display submitted data  |
| GlassFish Server | Application server      |
| NetBeans IDE 8.2 | Development environment |

---

# Project Structure

```plaintext
PersonalProfileApp/
│
├── Source Packages/
│   └── controller/
│       └── ProfileServlet.java
│
├── Web Pages/
│   ├── index.html
│   ├── result.jsp
│   └── style.css
│
└── README.md
```

---

# Requirements

The project contains:

* One HTML page
* One Servlet class
* One JSP page
* CSS styling for interface design

Database integration is **not required**.

---

# Interface Design

The application interface includes:

* Clean and modern layout
* Responsive form design
* Readable fonts
* User-friendly structure
* Simple color styling

---

# How to Run the Project

## Prerequisites

Make sure the following software is installed:

* JDK 8
* NetBeans IDE 8.2
* GlassFish Server

---

# Steps to Run

1. Open NetBeans IDE 8.2.
2. Create or open the `PersonalProfileApp` project.
3. Ensure GlassFish Server is configured in NetBeans.
4. Build the project.
5. Run the application using:

   * Right click project → Run
   * OR press `F6`
6. Browser opens automatically.

---

# Application URL

```plaintext
http://localhost:8080/PersonalProfileApp
```

---

# Expected Output

The system should:

* Accept user input from the HTML form
* Process the data through Servlet
* Display profile information dynamically on JSP page
* Provide a clean and responsive interface

<img width="1385" height="1000" alt="image" src="https://github.com/user-attachments/assets/c47e08b2-7e0b-4694-a76e-d2c2577287fa" />
<img width="1150" height="532" alt="image" src="https://github.com/user-attachments/assets/cb980802-5dbd-4180-93bd-35255b50f0ae" />

---

# Learning Outcomes

By completing this project, students will be able to:

* Build a simple Java web application
* Understand Servlet and JSP integration
* Handle HTTP requests and responses
* Design responsive web interfaces
* Deploy applications using GlassFish Server

---

# Author

Developed for educational purposes using Java Web Technologies and NetBeans IDE 8.2.
