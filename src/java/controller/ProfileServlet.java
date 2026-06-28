package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.ProfileBean;
import dao.ProfileDAO;

@WebServlet(name = "ProfileServlet",
            urlPatterns = {"/ProfileServlet"})

public class ProfileServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        // Receive form data
        String name =
                request.getParameter("name");

        String studentId =
                request.getParameter("studentId");

        String program =
                request.getParameter("program");

        String email =
                request.getParameter("email");

        String hobbies =
                request.getParameter("hobbies");

        String intro =
                request.getParameter("intro");

        // Create JavaBean object
        ProfileBean profile = new ProfileBean();

        profile.setName(name);
        profile.setStudentId(studentId);
        profile.setProgramme(program);
        profile.setEmail(email);
        profile.setHobbies(hobbies);
        profile.setIntroduction(intro);

        // Save into database
        ProfileDAO dao = new ProfileDAO();

        boolean success = dao.saveProfile(profile);

        // Send bean and save status to JSP
        request.setAttribute("profile", profile);
        request.setAttribute("success", success);

        // Forward to result page
        request.getRequestDispatcher("result.jsp")
               .forward(request, response);
    }
}