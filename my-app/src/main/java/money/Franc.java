package money;

public class Franc extends Money {
    Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multipliction) {
        return new Money(this.amount * multipliction, this.currency);
    }
}
