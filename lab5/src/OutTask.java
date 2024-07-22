public class OutTask implements Task{
    String msg;
    public OutTask(String msg) {
        this.msg = msg;
    }

    @Override
    public void execute() {
        System.out.println(msg);
    }
}
