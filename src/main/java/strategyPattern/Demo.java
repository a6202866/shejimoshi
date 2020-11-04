package strategyPattern;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new AddSomething());
        System.out.println(context.execute(50,10));
        context = new Context(new SubtractSomething());
        System.out.println(context.execute(50,10));
    }

}
