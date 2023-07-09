package bahavioral.interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
//        String context = "Lions";
//        String context = "Tigers";
//        String context = "Bears";
//        String context = "Lions Tigers";
//        String context = "Lions Bears";
        String context = "Tigers Bears";


        Expression define = buildInterpreterTree();
        System.out.println(context + " is " + define.interpret(context));
    }

    private static Expression buildInterpreterTree() {
        Expression expression1 = new TerminalExpression("Lions");
        Expression expression2 = new TerminalExpression("Tigers");
        Expression expression3 = new TerminalExpression("Bears");

        //Tigers and Bears
        AndExpression andExpression = new AndExpression(expression2, expression3);

        // Lions or (Tigers and Bears)
        OrExpression orExpression = new OrExpression(expression1, andExpression);

        // (Lions and Bears) or (Tigers and Bears)
        return new AndExpression(expression3, orExpression);
    }
}
