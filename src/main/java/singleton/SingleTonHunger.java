package singleton;

public class SingleTonHunger {
    private static SingleTonHunger instance = new SingleTonHunger();
    private SingleTonHunger(){};


    /**
     * 饿汉式加载线程安全
     * 没有加锁，执行效率提高。
     * 如果没用到他，就容易产生垃圾对象，类加载就初始化了，也容易浪费内存
     * @return
     */
    public static SingleTonHunger getInstance(){
       return instance;
    }
}
