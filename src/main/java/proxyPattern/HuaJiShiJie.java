package proxyPattern;

public class HuaJiShiJie implements Xiaomi {
    private XiaomiPhone xiaomiPhone = new XiaomiPhone();
    public void sale() {
        System.out.println("话机世界代理小米开始");
        xiaomiPhone.sale();
        System.out.println("话机世界代理小米结束");
    }
}
