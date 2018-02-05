package basico;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculo
 */
@WebServlet("/Calculo")
public class Calculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Calculo() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String codigo= request.getParameter("codigo");
		request.setAttribute("codigo", codigo);
		getServletContext().getRequestDispatcher("/url.jsp").forward(request, response);

	
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String c = request.getParameter("ciudad");
		
		request.getSession().setAttribute("ciudad", c);
		
		
		
		int u= Integer.parseInt(request.getParameter("unidades"));
		request.setAttribute("unidades", u*5);
		
		
		
		getServletContext().getRequestDispatcher("/segunda.jsp").forward(request, response);
		
//		response.sendRedirect("segunda.jsp");
		
	}

}
