package abstractFactoryPattern;

/**
 * 为手机和TV创建抽象类获取工厂
 */
public abstract class AbstractFactory {
    public abstract Phone  getPhone(String model);
    public abstract TV getTV(String model);
}
