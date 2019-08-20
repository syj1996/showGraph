package main.webapp.scoreHttp;

import main.webapp.getdatabase.getDataBase;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.*;
@WebServlet("/httpServlet")
public class httpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getParameter("action");
        int number=Integer.valueOf(req.getParameter("number"));
        int interval=Integer.valueOf(req.getParameter("interval"));
        if(action.equals("start")){
            String  sql="select * from message_feiq WHERE Number>="+ String.valueOf(number) +" and Number<"+String.valueOf(number+interval);
            resp.getWriter().println(new getDataBase().getMessage(sql));
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
