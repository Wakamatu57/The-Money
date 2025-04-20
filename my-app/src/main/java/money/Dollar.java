package money;

public class Dollar extends Money {
    Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    Money times(int multipliction) {
        return new Dollar(this.amount * multipliction);
    }
    

}
