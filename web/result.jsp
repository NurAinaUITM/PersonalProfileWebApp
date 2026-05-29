<%-- 
    Document   : result
    Created on : May 29, 2026, 11:24:28 PM
    Author     : NurAinaNajwaNorDaumi
--%>

<%@page contentType="text/html"
        pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

    <title>Profile Result</title>

    <link rel="stylesheet"
          type="text/css"
          href="style.css">

</head>

<body>

<div class="container">

    <h1>Student Profile</h1>

    <p>
        <strong>Name:</strong>
        ${name}
    </p>

    <p>
        <strong>Student ID:</strong>
        ${studentId}
    </p>

    <p>
        <strong>Program:</strong>
        ${program}
    </p>

    <p>
        <strong>Email:</strong>
        ${email}
    </p>

    <p>
        <strong>Hobbies:</strong>
        ${hobbies}
    </p>

    <p>
        <strong>Introduction:</strong>
        ${intro}
    </p>

</div>

</body>
</html>