package OpenClose;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new Strategy1());
        context.executeTheStrategy();

        context = new Context(new Strategy2());
        context.executeTheStrategy();
    }
}