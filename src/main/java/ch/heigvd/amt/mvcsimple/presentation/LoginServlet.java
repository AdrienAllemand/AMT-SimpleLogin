package ch.heigvd.amt.mvcsimple.presentation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, String> messages = new HashMap<String,String>();

        request.setAttribute("messageMap", messages);

        String name = request.getParameter("name");
        String pass = request.getParameter("pass");

        if(name == null) {
            messages.put("name", "Please enter a username!");
        } else if (name != "admin"){
            messages.put("name", "Unknown username!");
        }

        if(pass == null){
            messages.put("pass", "Please enter password!");
        } else if(pass != "admin"){
            messages.put("pass", "Wrong password");
        }

        if(messages.isEmpty()){
            messages.put("success", String.format("Welcome %s", name));

            request.getRequestDispatcher("/WEB-INF/pages/hello.jsp").forward(request, response);
        } else {

            request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
        }

    }
}
