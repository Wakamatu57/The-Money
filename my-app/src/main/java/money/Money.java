package money;

class Money implements Expression {
    protected int amount;
    protected String currency;
    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    Expression times(int multipliction) {
        return new Money(this.amount * multipliction, this.currency);
    }
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }
    public Money reduced(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }
    String currency() {
        return this.currency;
    }
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount
            && currency().equals(money.currency());
    }

    public String toString() {
        return this.amount + " " + this.currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }
}


