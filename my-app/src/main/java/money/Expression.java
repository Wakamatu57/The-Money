package money;

interface Expression {
    Money reduced(Bank bank, String to);
    Expression plus(Expression addend);
}
