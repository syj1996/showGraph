package main.webapp.scoreHttp;

import main.webapp.getdatabase.getDataBase;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/edgeTable")
public class edgeTable extends httpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getParameter("action");
        String SIP=req.getParameter("SIP");
        String DIP=req.getParameter("DIP");
        String  sql1="select * from message_feiq WHERE SIP='"+SIP+"' and DIP='"+DIP+"'";
        String  sql2="select * from message_feiq WHERE SIP='"+DIP+"' and DIP='"+SIP+"'";
        if(action.equals("search"))
        {
            resp.getWriter().println(new getDataBase().getMessage(sql1,sql2));
        }
    }
}
