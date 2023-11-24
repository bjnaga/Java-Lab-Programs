servlet file:
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Login() {
        super();
         
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter obj=null;
			try {
				obj=response.getWriter();

				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:12002/bhavana","root","Qwerty@1234");
				Statement stmt=con.createStatement();
				String userid=request.getParameter("userid");
				String pass=request.getParameter("password");
				ResultSet rs=stmt.executeQuery("select *from student where id='"+userid+"'");
				if(rs.next()) {
					if(userid.equals(rs.getString(1))&&(pass.equals(rs.getString(2)))){
						obj.println("<h1> successfully logged in</h1>");
					}
					else {
						obj.println("<h1> userid and password doesn't match</h1>" );
					}
				}else {
					obj.println("<h1> user doesn't exists</h1>");
				}
				
				con.close();

				
			}catch(Exception e) {
			System.out.println(e);
			}
			finally {
				obj.close();

			}
		 
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}

}
