package simpleFactory;

/**
 *
 */
public class Client {
    public static void main(String[] args) {

    }

    public interface Product{
        void show();
    }

    public static class ConcreteProduct1 implements Product{

        public void show() {
            System.out.println("产品展示1");
        }
    }

    public static class ConcreteProduct2 implements Product{

        public void show() {
            System.out.println("产品展示2");
        }
    }

    final class Const {
        static final int PRODUCT_A = 0;
        static final int PRODUCT_B = 1;
        static final int PRODUCT_C = 2;
    }

    public static class SimpleFactory {

        public static Product makeProduct(int kind){
            switch (kind){
                case Const.PRODUCT_A:
                    return new ConcreteProduct1();
                case Const.PRODUCT_B:
                    return new ConcreteProduct2();
            }
            return null;
        }
    }
}
