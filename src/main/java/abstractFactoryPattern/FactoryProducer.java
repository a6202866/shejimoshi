package abstractFactoryPattern;


public class FactoryProducer {
    public  static AbstractFactory getFactory(String model){
        if("Phone".equals(model)){
            return new PhoneFactory();
        }else if("TV".equals(model)){
            return new TVFactory();
        }
        return null;
    }
}
