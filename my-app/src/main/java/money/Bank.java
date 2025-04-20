package money;

public class Bank {
    Money reduced(Expression source, String to) {
        if (source instanceof Money) {
            return (Money) source;
        }
        Sum sum = (Sum) source;
        return sum.reduced(to);

    }
}
