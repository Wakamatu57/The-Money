package money;

public class Dollar extends Money {
    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multipliction) {
        return new Dollar(this.amount * multipliction);
    }
    

}
