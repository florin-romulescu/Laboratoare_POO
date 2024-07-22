import javax.xml.crypto.Data;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String firstName;
    private String lastName;
    private Map<String, Integer> subjects;

    public Student(String firstName, String lastName, Map<String, Integer> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    public Student(Student student) {
        firstName = new String(student.firstName);
        lastName = new String(student.lastName);

        for (Map.Entry<String, Integer> entry : student.subjects.entrySet()) {
            subjects.put(
                    entry.getKey(),
                    entry.getValue()
            );
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashMap<String, Integer> subjects) {
        this.subjects = subjects;
    }

    public double averageGrade() {
        double mean = 0;

        for (Map.Entry<String, Integer> entry : subjects.entrySet()) {
            mean += entry.getValue();
        }

        return mean / subjects.size();
    }

    public List<Teacher> getAllTeachers() {
        return Collections.unmodifiableList(
                Database.getDatabase().findAllTeachers()
        );
    }

    public int getGradeForSubject(String subject) {
        return subjects.get(subject);
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        return Collections.unmodifiableList(
                Database.getDatabase().findTeachersBySubject(subject)
        );
    }

    public List<Student> getAllStudents() {
        return Collections.unmodifiableList(
                Database.getDatabase().findAllStudents()
        );
    }

    public List<Student> getStudentsBySubject(String subject) {
        return Collections.unmodifiableList(
                Database.getDatabase().getStudentsBySubject(subject)
        );
    }

    public List<Student> getStudentsByAverageGrade() {
        return Collections.unmodifiableList(
                Database.getDatabase().getStudentsByAverageGrade()
        );
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        return Collections.unmodifiableList(
                Database.getDatabase().getStudentsByGradeForSubject(subject)
        );
    }
}
