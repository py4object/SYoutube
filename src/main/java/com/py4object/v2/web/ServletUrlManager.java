package com.py4object.v2.web;

import com.py4object.v2.modle.AppManager;
import com.py4object.v2.modle.URLManager;
import org.apache.commons.lang.RandomStringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kozo on 2/9/16.
 */
@WebServlet(name = "ServletUrlManager" ,urlPatterns = "/URLManager")
public class ServletUrlManager extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url=  request.getParameter("url");
        url=url.substring(url.indexOf("youtube.com/watch?v=")+"youtube.com/watch?v=".length());
        URLManager manager= (URLManager) getServletContext().getAttribute(AppManager.URLMANAGER);
        String mappedUrl=RandomStringUtils.random(20,"abcdefghijklmnopqurstuvwsyz1234567809");
        manager.put(mappedUrl,url);
        response.sendRedirect("u/"+mappedUrl);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
