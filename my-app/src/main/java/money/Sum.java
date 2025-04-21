package money;

public class Sum implements Expression {
    Expression augend;
    Expression addend;
    Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }
    public Money reduced(Bank bank, String to) {
        int amount = this.augend.reduced(bank, to).amount + this.addend.reduced(bank, to).amount;
        return new Money(amount, to);
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public Expression times(int multiplication) {
        return new Sum(augend.times(multiplication), addend.times(multiplication));
    }
}
