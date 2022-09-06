public class Student {
    String surname;
    String firstname;
    Character middleInitial;
    String dateofBirth;
    Integer StudentNumber;
    String StudentEmailAddress;
    boolean AmIAwesome;

    public void sayMyStudentNumber() {
        System.out.println("My student number is " + StudentNumber);
    }
    public void sayMyEmailAddress() {
        System.out.println("My Email is " + StudentEmailAddress);
    }
    public void sayMyamIAwesome() {
        System.out.println("Am I Awesome? " + AmIAwesome);
    }
}
