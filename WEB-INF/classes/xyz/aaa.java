 package xyz;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class aaa extends HttpServlet
{
public void doGet(HttpServletRequest rq,HttpServletResponse rs)
{
try
{
String nn=rq.getParameter("nm");
String cc=rq.getParameter("city");
String gg=rq.getParameter("gdr");
System.out.println("Request Arrived.");
System.out.println("Name : "+nn);
System.out.println("City : "+cc);
System.out.println("Gender : "+gg);
PrintWriter pw;
pw=rs.getWriter();
rs.setContentType("text/html");
pw.println("<!DOCKTYPEhtml>");
pw.println("<html lang='en'>");
pw.println("<head>");
pw.println("<meta charset='utf-8'>");
pw.println("<title>My first web application</title>");
pw.println("</head>");
pw.println("<body>");
pw.println("<h3>Data Saved</h3>");
pw.println("<form action='/one/index.html'>");
pw.println("<button type='submit'>Ok</button>");
pw.println("</form>");
pw.println("</body>");
pw.println("</html>");
}catch(Exception e)
{
System.out.println(e);
}
}
}