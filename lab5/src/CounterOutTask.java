public class CounterOutTask implements Task{
    private static int contor = 0;
    public CounterOutTask() {
    }

    @Override
    public void execute() {
        contor += 1;
        System.out.println(Integer.toString(contor));
    }
}
