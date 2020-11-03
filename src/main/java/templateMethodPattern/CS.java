package templateMethodPattern;

public class CS extends Game {
    @Override
    void init() {
        System.out.println("初始化cs");
    }

    @Override
    void startPlay() {
        System.out.println("开始玩CS");
    }

    @Override
    void endPlay() {
        System.out.println("结束玩CS");
    }
}
