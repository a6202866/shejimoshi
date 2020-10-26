package facadePattern;

/**
 * 看病窗口
 */
public class Window {
    private Foot foot;
    private Head head;
    public Window (){
        foot = new Foot();
        head = new Head();
    }
    public void seeFoot(){
        foot.see();
    }
    public void seeHead(){
        head.see();
    }
}
