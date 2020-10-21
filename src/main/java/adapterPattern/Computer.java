package adapterPattern;

/**
 * 创建玩cs的实体类
 */
public class Computer implements CS {
    CSAdapter csAdapter;
    public void play(String type) {
        if(type.equals("国服")){
            csAdapter = new CSAdapter("国服");
            csAdapter.play("国服");
        }else if("国际服".equals(type)){
            csAdapter = new CSAdapter("国际服");
            csAdapter.play("国际服");
        }
    }
}
