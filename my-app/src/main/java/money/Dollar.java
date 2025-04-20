package money;

public class Dollar extends Money {
    Dollar(int amount, String currency) {
        super(amount, currency);
    }
    Money times(int multipliction) {
        return new Money(this.amount * multipliction, this.currency);
    }
    

}
