<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bean.ProfileBean"%>

<%
    ProfileBean profile = (ProfileBean) request.getAttribute("profile");
    Boolean success = (Boolean) request.getAttribute("success");
%>

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

    <% if (success != null && success) { %>

        <h3 style="color:green;">
            Profile saved successfully!
        </h3>

    <% } else { %>

        <h3 style="color:red;">
            Failed to save profile.
        </h3>

    <% } %>

    <p>
        <strong>Name:</strong>
        <%= profile.getName() %>
    </p>

    <p>
        <strong>Student ID:</strong>
        <%= profile.getStudentId() %>
    </p>

    <p>
        <strong>Program:</strong>
        <%= profile.getProgramme() %>
    </p>

    <p>
        <strong>Email:</strong>
        <%= profile.getEmail() %>
    </p>

    <p>
        <strong>Hobbies:</strong>
        <%= profile.getHobbies() %>
    </p>

    <p>
        <strong>Introduction:</strong>
        <%= profile.getIntroduction() %>
    </p>

    <br>

    <a href="index.html">Add Another Profile</a>

    <br><br>

    <a href="viewProfiles.jsp">View All Profiles</a>

</div>

</body>
</html>