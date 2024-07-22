import java.util.ArrayList;

public class Stack implements Container{
    private ArrayList<Task> stack = new ArrayList<>();
    public Stack() {}



    @Override
    public Task pop() {
        return stack.remove(stack.size()-1);
    }

    @Override
    public void push(Task task) {
        stack.add(task);
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public void transferFrom(Container container) {
        while (!container.isEmpty()) {
            this.push(container.pop());
        }
    }

    @Override
    public ArrayList<Task> getTasks() {
        return stack;
    }

}
