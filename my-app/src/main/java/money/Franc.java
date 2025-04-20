package money;

public class Franc extends Money {
    Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multipliction) {
        return Money.franc(this.amount * multipliction);
    }
}
