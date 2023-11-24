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

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out1 = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:12002/bhavana", "root", "Qwerty@1234");
			Statement stmt = con.createStatement();
			String userid = request.getParameter("userid");
			String pass = request.getParameter("password");
			String conpass = request.getParameter("confirm_password");
			ResultSet rs = stmt.executeQuery("select * from student where regno='" + userid + "'");
			out1 = response.getWriter();
			if (rs.next()) {
				//if (userid.equals(rs.getString(1)) && (pass.equals(rs.getString(2)))) {
					out1.println("<h1>user already exist </h1>");
				}else if(pass.equals(conpass)){
					stmt.execute("insert into student values('"+userid+"','"+pass+"')");
							
					out1.println("<h1>user succesfully registered </h1>");
					
			} else {
				out1.println("<h1>password and confirm password  </h1>");
			}
			con.close();
		} catch (Exception ex) {
			System.out.println("error caught in servlet" + ex.getMessage());
		} finally {
			out1.close();
		}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
