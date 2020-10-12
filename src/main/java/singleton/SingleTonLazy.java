package singleton;

public class SingleTonLazy {
    private static SingleTonLazy instance;
    private SingleTonLazy(){};

    /**
     * 懒汉式线程不安全
     * 最基本的实现方式，不支持多线程，因为没有加锁。
     * @return
     */
    public static SingleTonLazy getInstance(){
        if(instance==null){
            instance = new SingleTonLazy();
        }
        return instance;
    }

    /**
     * 懒汉式线程安全
     * 这种方式具备很好的懒加载，能在线程中很好的工作的，但是效率很低，99%的情况下不需要同步
     * @return
     */
    public static synchronized SingleTonLazy getInstanceLazySur(){
        if(instance==null){
            instance = new SingleTonLazy();
        }
        return instance;
    }

}
