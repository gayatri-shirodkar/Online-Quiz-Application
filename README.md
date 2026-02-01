# Online-Quiz-Application
A simple **Java Servlet-based Online Quiz Application** that allows users to take a multiple-choice quiz and view their score along with the correct answers. 
--------------------------

## 📂 Project Structure
OnlineQuiz/
│
├── index.html         # Quiz form (frontend)
├── style.css          # Styling for the quiz page
├── WEB-INF/
│   └── web.xml        # Deployment descriptor (Servlet configuration)
└── src/
└── QuizServlet.java   # Servlet to process quiz answers
--------------------------

## 🚀 Features
- 5 multiple-choice questions.
- Clean UI styled with CSS.
- Servlet processes form submissions and calculates score.
- Displays:
  - User’s score
  - Correct answers for all questions
--------------------------

## ⚙️ Technologies Used
- **Java (Jakarta Servlets)**
- **HTML5**
- **CSS3**
- **Apache Tomcat** (or any Jakarta EE compatible server)
--------------------------

## ▶️ How to Run
1. Copy project files into your web application directory.
2. Place `index.html` and `style.css` inside the **webapp** folder.
3. Place `QuizServlet.java` inside the **src** folder of your project package.
4. Configure `web.xml` inside:WEB-INF/web.xml
5. Compile and deploy the project on a servlet container (e.g., Tomcat).
6. Start the server and open:http://localhost:8080/OnlineQuiz/index.html
7. Take the quiz and submit. The servlet will evaluate your answers and display the result.
--------------------------

## 📌 Notes
- Ensure **Jakarta Servlet API** is in your classpath.
- Tested on **Tomcat 10+** (Jakarta EE 9/10 compatible).
- Extendable: add more questions, connect to a database, or track user performance.
--------------------------

## 👨‍💻 Author
Developed as a simple **Java Web Application** project using Servlets.
