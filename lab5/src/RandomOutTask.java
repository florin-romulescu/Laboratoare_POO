import java.util.Random;

public class RandomOutTask implements Task{
    private static Random random = new Random(12345);
    private int rand;
    public RandomOutTask() {
        rand = random.nextInt();
    }

    @Override
    public void execute() {
        System.out.println(Integer.toString(rand));
    }
}
