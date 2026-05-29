package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

        // Send data to JSP
        request.setAttribute("name", name);

        request.setAttribute("studentId",
                             studentId);

        request.setAttribute("program",
                             program);

        request.setAttribute("email",
                             email);

        request.setAttribute("hobbies",
                             hobbies);

        request.setAttribute("intro",
                             intro);

        // Forward to result page
        request.getRequestDispatcher("result.jsp")
               .forward(request, response);
    }
}