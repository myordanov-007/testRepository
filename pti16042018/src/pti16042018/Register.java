package pti16042018;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;



/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try(PrintWriter out = response.getWriter()){
			String nameU = request.getParameter("name");
			String lnameU = request.getParameter("lastname");
			String emailU = request.getParameter("email");
			String passU = request.getParameter("password");
			String repassU = request.getParameter("repassword");
			out.println(nameU);
			out.println(lnameU);
			out.println(emailU);
			out.println(passU);
			out.println(repassU);
			if( repassU.equals(passU))
			{
				out.println("Register Success");
				User newUser = new User();
				newUser.setName(nameU);
				newUser.setLName(lnameU);
				newUser.setEmail(emailU);
				newUser.setPass(passU);
				newUser.setRePass(repassU);
				UserStorage add = new UserStorage();
				
				add.addUser(nameU,  lnameU, emailU,  passU,  repassU);
				out.println("ggjjgjgjg");
				
				
			}
			else{
				out.println("Register Failed");
			
			}
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doGet(request, response);
	}

}