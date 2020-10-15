package factoryPattern;

public class FactoryPattern {
    public interface shape{
        void draw();
    }

    public static class Apple implements shape{

        public void draw() {
            System.out.println("苹果哦");
        }
    }

    public static class Orange implements shape{

        public void draw() {
            System.out.println("桔子哦");
        }
    }

    public static class Banana implements shape{

        public void draw() {
            System.out.println("香蕉哦");
        }
    }

    public static class Factory{
        public shape getShape(String type){
            if("1".equals(type)){
                return new Apple();
            }else if("2".equals(type)){
                return new Orange();
            }else{
                return new Banana();
            }
        }
    }

    public static void main(String[] args) {
        Factory factory = new Factory();
        Shape shape1 = factory.getShape("1");
        shape1.draw();
    }
}
