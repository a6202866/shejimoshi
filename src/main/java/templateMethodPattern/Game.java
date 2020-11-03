package templateMethodPattern;

/**
 * 创建一个抽象类，它的模板方法被设置为 final。
 */
public abstract class Game {
    abstract void init();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        //初始化游戏
        init();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }
}
