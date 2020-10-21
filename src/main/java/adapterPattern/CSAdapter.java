package adapterPattern;

/**
 * 国服国际服适配器  就类似steam登录cs的选择页面
 */
public class CSAdapter implements CS{
    CSType csType;
    public CSAdapter (String type){
        if(type.equals("国服")){
            csType = new GuofuCS();
        }else if(type.equals("国际服")){
            csType = new GuojifuCS();
        }
    }
    public void play(String type) {
        if(type.equals("国服")){
            csType.playGuofu();
        }else if(type.equals("国际服")){
            csType.playGuojifu();
        }
    }
}
