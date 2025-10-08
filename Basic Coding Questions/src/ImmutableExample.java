import java.util.*;

final class Student{

    private final int id;
    private final String name;
    private final List<String> subjects;

    public Student(int id, String name, List<String> subjects) {
        this.id = id;
        this.name = name;
        this.subjects = new ArrayList<>(subjects);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getSubjects() {
        return Collections.unmodifiableList(subjects);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}

public class ImmutableExample {

    public static void main(String[] args) {

        List<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Bio");
        Student student = new Student(12, "Amit" , subjects);

        System.out.println("student before modifying :: "+student);

        subjects.add("English");

        System.out.println("student after modifying :: "+student);


    }

}
