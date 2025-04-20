package money;

public class Bank {
    Money reduced(Expression source, String to) {
        Sum sum = (Sum) source;
        return sum.reduced(to);

    }
}
