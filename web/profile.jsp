<%-- 
    Document   : profile
    Created on : Jun 28, 2026, 10:43:55 PM
    Author     : NurAinaNajwaNorDaumi
--%>
<%@page import="bean.ProfileBean"%>
<%
    ProfileBean profile = (ProfileBean) request.getAttribute("profile");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
    </head>
    <body>
        <% if (profile == null) { %>
            <p style="color:red;">Error: No profile data found.</p>
        <% } else { %>
            <h2>Profile Saved Successfully</h2>
            <p><strong>Name:</strong> <%= profile.getName() %></p>
            <p><strong>Student ID:</strong> <%= profile.getStudentId() %></p>
            <p><strong>Programme:</strong> <%= profile.getProgramme() %></p>
            <p><strong>Email:</strong> <%= profile.getEmail() %></p>
            <p><strong>Hobbies:</strong> <%= profile.getHobbies() %></p>
            <p><strong>Introduction:</strong> <%= profile.getIntroduction() %></p>
        <% } %>

        <br>
        <a href="index.html">Add Another Profile</a>
        <br><br>
        <a href="ViewProfilesServlet">View All Profiles</a>
    </body>
</html>