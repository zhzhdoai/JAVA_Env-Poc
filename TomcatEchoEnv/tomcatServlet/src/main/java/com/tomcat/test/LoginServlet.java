package com.tomcat.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLClassLoader;

import org.apache.commons.collections.comparators.*;


public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println(System.getProperty("java.class.path"));
        ObjectInputStream objectInputStream = new ObjectInputStream(request.getInputStream());
        try {
            //Class.forName("[Lorg.apache.commons.collections.Transformer;", true, new URLClassLoader(new URL[]{new URL("file:///Users/osword/.m2/repository/commons-collections/commons-collections/3.2.1/commons-collections-3.2.1.jar")}));
            Object input = objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}