package task2;

public class JobMarket {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Gigel", 7.0);
        students[1] = new Student("Marcel", 4.7);
        students[2] = new Student("Dorel", 9.3);
        students[3] = new Student("Ionel", 8.4);

        Internship[] internships = new Internship[4];
        internships[0] = new Internship("Google", 7.0, students);
        internships[1] = new Internship("Amazon", 6.5, students);
        internships[2] = new Internship("Facebook", 8.2, students);
        internships[3] = new Internship("Microsoft", 7.1, students);

        for (int i = 0; i < 4; ++i) {
            internships[i].chooseCandidatesForInterview();
            System.out.println();
        }

        Student st1 = new Student("Florin", 10);
        Student st2 = new Student("Florin", 10.0);

        if (st1.equals(st2)) {
            System.out.println("Studenti identici.");
        } else {
            System.out.println("Studenti diferiti.");
        }
    }
}
