public class App {
    public static void main(String[] args) {
        Student Cadiz = new Student();
        Cadiz.surname = "Cadiz";
        Cadiz.firstname = "Marc Andrei";
        Cadiz.middleInitial = 'J';
        Cadiz.dateofBirth = "08/07/2004";
        Cadiz.StudentNumber = 2022104836;
        Cadiz.StudentEmailAddress = "cadizmj@students.national-u.edu.ph";
        Cadiz.AmIAwesome = true;
        Cadiz.sayMyStudentNumber();
        Cadiz.sayMyEmailAddress();
        Cadiz.sayMyamIAwesome();
    }
}
