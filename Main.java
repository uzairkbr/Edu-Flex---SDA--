// import java.util.Date;

// public class Main {
//     public static void main(String[] args) {
//         // Create an admin user
//         Admin admin = new Admin();
//         admin.login();
//         System.out.println("Admin logged in!");

//         // Create an instructor
//         Instructor instructor = new Instructor();
//         System.out.println("Instructor created.");

//         // Create a course
//         Course course = new Course();
//         course.setTitle("Java Programming");
//         course.setDescription("Learn the basics of Java.");
//         course.setPrice(99.99f);
//         System.out.println("Course created: " + course.getTitle());

//         // Instructor adds the course
//         instructor.createCourse(course);
//         System.out.println("Instructor added the course: " + course.getTitle());

//         // Create a student
//         Student student = new Student();
//         System.out.println("Student created.");

//         // Student enrolls in the course
//         student.enrollInCourse(course);
//         System.out.println("Student enrolled in the course: " + course.getTitle());

//         // Create a quiz for the course
//         Quiz quiz = new Quiz();
//         Question question1 = new Question();
//         question1.setContent("What is Java?");
//         Answer answer1 = new Answer();
//         answer1.setContent("A programming language.");
//         question1.setCorrectAnswer(answer1);

//         quiz.addQuestion(question1);
//         course.addQuiz(quiz);
//         System.out.println("Quiz added to the course: " + course.getTitle());

//         // Process payment
//         Payment payment = new Payment();
//         payment.setAmount(99.99f);
//         payment.setDate(new Date());
//         payment.setPaymentMethod("Credit Card");
//         payment.processPayment();
//         System.out.println("Payment processed: $" + payment.getAmount());

//         // Issue a certificate
//         Certificate certificate = new Certificate();
//         certificate.setCourse(course);
//         certificate.setDateIssued(new Date());
//         System.out.println("Certificate issued for course: " + certificate.getCourse().getTitle());

//         // Display review
//         Review review = new Review();
//         review.setRating(5);
//         review.setComment("Great course!");
//         review.displayReview();
//     }
// }
