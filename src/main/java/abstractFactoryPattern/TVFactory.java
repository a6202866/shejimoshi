package abstractFactoryPattern;

public class TVFactory extends AbstractFactory {
    @Override
    public Phone getPhone(String model) {
        return null;
    }

    @Override
    public TV getTV(String model) {
        if("17".equals(model)){
            return new M17TV();
        }else if("24".equals(model)){
            return new M24TV();
        }
        return null;
    }
}
