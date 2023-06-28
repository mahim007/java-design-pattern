package creational.abstractfactory;

public class VisaBlackValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
