package strategyPattern;

public class Context {
    private DoSomething doSomething;
    public Context(DoSomething doSomething){
        this.doSomething = doSomething;
    }
    public int execute(int a,int b){
        return doSomething.dosth(a,b);
    }

}
