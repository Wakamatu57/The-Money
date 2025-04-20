package money;

public class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multipliction) {
        return new Franc(this.amount * multipliction);
    }
}
