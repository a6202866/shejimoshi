package singleton;

public class SingleTonDouble {
    private static SingleTonDouble singleTonDouble;
    private SingleTonDouble(){}

    /**
     * 双重校验锁
     * 采用双锁机制，在多线程情况下还能保持安全和高效
     * @return
     */
    public static SingleTonDouble getSingleTonDouble(){
        if(singleTonDouble==null){
            //锁住对象
            synchronized (SingleTonDouble.class){
                if(singleTonDouble==null){
                    singleTonDouble = new SingleTonDouble();
                }
            }
        }
        return singleTonDouble;
    }
}
