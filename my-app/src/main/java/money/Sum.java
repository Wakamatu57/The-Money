package money;

public class Sum implements Expression {
    Money augend;
    Money addend;
    Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }
    public Money reduced(Bank bank, String to) {
        int amount = this.augend.reduced(bank, to).amount + this.addend.reduced(bank, to).amount;
        return new Money(amount, to);
    }
}
