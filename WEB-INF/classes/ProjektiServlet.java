import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProjektiServlet")
public class ProjektiServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><head><title>Prisma-IT</title></head><body>");
        out.println("<h1>Tervetuloa Prisma-IT projekteihin</h1>");
        out.println("<form action=\"/ProjektiServlet\" method=\"post\">");
        out.println("Anna projektin numero: <input type=\"text\" name=\"projektiNumero\"><br>");
        out.println("<input type=\"submit\" value=\"Tarkista projektikoodi\">");
        out.println("</form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String projektiNumero = request.getParameter("projektiNumero");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><head><title>Prisma-IT</title></head><body>");
        
        if (projektiNumero != null && projektiNumero.matches("\\d{4}")) {
            out.println("Projektikoodi oikein. Siirry projektille<br>");
            out.println("<a href=\"/\">Takaisin alkuun</a>");
        } else {
            out.println("Virheellinen projektikoodi. Anna nelinumeroinen koodi.<br>");
            out.println("<a href=\"/\">Takaisin alkuun</a>");
        }
        
        out.println("</body></html>");
    }
}
