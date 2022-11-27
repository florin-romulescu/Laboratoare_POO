import java.util.ArrayList;

public interface Container {
    Task pop();

    void push(Task task);

    int size();

    boolean isEmpty();

    void transferFrom(Container container);

    ArrayList<Task> getTasks();
}
