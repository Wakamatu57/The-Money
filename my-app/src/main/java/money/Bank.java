package money;

import java.util.Map;
import java.util.HashMap;

public class Bank {
    private Map<Pair, Integer> rates = new HashMap<>();
    Money reduced(Expression source, String to) {
        return source.reduced(this, to);

    }
    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    int rate(String from, String to) {
        if (from.equals(to)) {
            return 1;
        }
        return rates.get(new Pair(from, to));
    }
}
