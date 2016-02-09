package com.py4object.v2.web;

import com.py4object.v2.modle.AppManager;
import com.py4object.v2.modle.PlayerSession;
import com.py4object.v2.modle.URLManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kozo on 2/9/16.
 */
@WebServlet(name = "ServletMapedUrlGrabber" ,urlPatterns = "/u/*")
public class ServletMapedUrlGrabber extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        URLManager urlManager= (URLManager) getServletContext().getAttribute(AppManager.URLMANAGER);
        String path=request.getRequestURI();
        PlayerSession pSession;

        try{
            pSession=urlManager.getPlaySession(path);
            request.setAttribute("Session",pSession);
            request.getRequestDispatcher("/play.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(path);

        }
    }
}
