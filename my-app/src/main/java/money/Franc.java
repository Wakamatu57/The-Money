package money;

public class Franc {
    private int amount;
    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multipliction) {
        return new Franc(this.amount * multipliction);
    }
    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return this.amount == franc.amount;
    } 
}
