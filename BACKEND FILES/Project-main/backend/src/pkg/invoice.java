package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Feedback
 */
public class invoice extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public invoice() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        
      }

    

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
        
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String sale-id = request.getParameter("sale-id");
        String time = request.getParameter("time");
        String item-id = request.getParameter("item-id");
        
        String quantity = request.getParameter("quantity");
        String rate = request.getParameter("rate");
        String amount = request.getParameter("amount");
        try{
            Connection con = (Connection) DatabaseConnect.connect();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into appointment values(?,?,?,?,?,?)");
            ps.setString(1, sale-id);
            ps.setString(2, time);
            ps.setString(3, item-id);
            
            ps.setString(4, quantity);
            ps.setString(5, rate);
            ps.setString(6, amount);
            int i = ps.executeUpdate();
            
            if(i>0)
                
                
            }catch(Exception e2){
                System.out.println(e2);
            }
        out.close();
}
    }
