package builder;

/**
 * 具体建造者：实现了抽象建造者接口。
 */
public class ConcreteBuilder extends Builder {

    @Override
    public void buildPartA() {
        product.setPartA("建partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建partB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建partC");
    }
}
