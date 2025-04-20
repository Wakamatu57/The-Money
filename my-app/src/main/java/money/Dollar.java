package money;

public class Dollar extends Money {
    private String currency;
    Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    String currency() {
        return this.currency;
    }

    Money times(int multipliction) {
        return new Dollar(this.amount * multipliction);
    }
    

}
