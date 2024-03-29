package bahavioral.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        StringTokenizer tokenizer = new StringTokenizer(context);
        while (tokenizer.hasMoreElements()) {
            String token = tokenizer.nextToken();
            if (token.equals(data)) {
                return true;
            }
        }

        return false;
    }
}
