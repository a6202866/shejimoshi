package abstractFactoryPattern;

class test {
    public static void main(String[] args) {
        AbstractFactory phoneFactory = FactoryProducer.getFactory("Phone");
        phoneFactory.getPhone("M9").produce();
        phoneFactory.getTV("17").produce();
        AbstractFactory tvFactory = FactoryProducer.getFactory("TV");
        tvFactory.getTV("17").produce();
        tvFactory.getPhone("M9");
    }
}
