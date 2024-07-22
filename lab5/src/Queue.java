import java.util.ArrayList;

public class Queue implements Container{
    private ArrayList<Task> queue = new ArrayList<>();
    public Queue() {}

    @Override
    public Task pop() {
        return queue.remove(0);
    }

    @Override
    public void push(Task task) {
        queue.add(task);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void transferFrom(Container container) {
        while (!container.isEmpty()) {
            this.push(container.pop());
        }
    }

    @Override
    public ArrayList<Task> getTasks() {
        return queue;
    }
}
