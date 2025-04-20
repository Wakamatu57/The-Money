package money;

public class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multipliction) {
        return new Franc(this.amount * multipliction);
    }
    public boolean equals(Object object) {
        Money franc = (Money) object;
        return this.amount == franc.amount;
    } 
}
