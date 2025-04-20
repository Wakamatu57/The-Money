package money;

public class Dollar extends Money {
    Dollar(int amount, String currency) {
        super(amount, currency);
    }
    Money times(int multipliction) {
        return Money.dollar(this.amount * multipliction);
    }
    

}
