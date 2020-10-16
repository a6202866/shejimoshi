package abstractFactoryPattern;

public class PhoneFactory extends AbstractFactory {
    @Override
    public Phone getPhone(String model) {
        if("M9".equals(model)){
            return new M9();
        }else if("M10".equals(model)){
            return new M10();
        }
        return null;
    }

    @Override
    public TV getTV(String model) {
        return null;
    }
}
