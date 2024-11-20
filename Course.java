import java.util.List;

public class Course {
    private int id;
    private String title;
    private String description;
    private float price;
    private List<Quiz> quizzes;
    private List<Student> students;

    public void addQuiz(Quiz quiz) { }
    public void getStudentProgress(Student student) { }
    public void issueCertificate (Student student) { }
}
