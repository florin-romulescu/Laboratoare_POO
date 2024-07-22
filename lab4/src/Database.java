import java.util.*;
import java.util.stream.Collectors;

public class Database {
    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();
    private static Database instance = null;
    private static int size = 0;

    private Database() {
        size += 1;
    }
    public static Database getDatabase() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public static int getNumberOfInstances() {
        return size;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        List<Teacher> teacherBySubject = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.getSubjects().contains(subject)) {
                teacherBySubject.add(teacher);
            }
        }
        return teacherBySubject;
    }

    public List<Student> findAllStudents() {
        return students;
    }

    public List<Teacher> findAllTeachers() {
        return teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> studentsBySubject = new ArrayList<>();
        for (Student student : students) {
            if (student.getSubjects().containsKey(subject)) {
                studentsBySubject.add(student);
            }
        }
        return studentsBySubject;
    }

    public List<Student> getStudentsByAverageGrade() {
        return students.stream()
                .sorted(Comparator.comparing(Student::averageGrade))
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        return getStudentsBySubject(subject)
                .stream()
                .sorted(Comparator.comparing(student -> {return student.getGradeForSubject(subject);}))
                .collect(Collectors.toList());
    }
}
