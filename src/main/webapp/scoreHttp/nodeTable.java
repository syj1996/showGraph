package main.webapp.scoreHttp;

import com.google.gson.Gson;
import main.webapp.getdatabase.getDataBase;
import main.webapp.getdatabase.message;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/nodeTable")
public class nodeTable extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getParameter("action");
        String ip=req.getParameter("nodeIp");
        String  sql="select * from message_feiq WHERE SIP='"+ip+"' or DIP='"+ip+"'";
        if(action.equals("search"))
        resp.getWriter().println(new getDataBase().getMessage(sql));
    }
}
