import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/QuizServlet")
public class QuizServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Correct answers
        String[] correctAnswers = {"Delhi", "James Gosling", "Mars", "4", "CSS"};

        // User answers
        String[] userAnswers = new String[5];
        userAnswers[0] = request.getParameter("q1");
        userAnswers[1] = request.getParameter("q2");
        userAnswers[2] = request.getParameter("q3");
        userAnswers[3] = request.getParameter("q4");
        userAnswers[4] = request.getParameter("q5");

        int score = 0;

        // Calculate score using for loop + if-else
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers[i] != null && userAnswers[i].equals(correctAnswers[i])) {
                score++;
            }
        }

        // Display result
        out.println("<html><body>");
        out.println("<h2>Quiz Result</h2>");
        out.println("<p>Your Score: " + score + " out of 5</p>");
        out.println("<h3>Correct Answers:</h3>");

        out.println("<ol>");
        out.println("<li>Capital of India: Delhi</li>");
        out.println("<li>Developer of Java: James Gosling</li>");
        out.println("<li>Red Planet: Mars</li>");
        out.println("<li>2 + 2 = 4</li>");
        out.println("<li>Web page styling language: CSS</li>");
        out.println("</ol>");

        out.println("</body></html>");
    }
}
