public class EvaluateExpression {
    public static int solveExpression(String[] operations) {
        int x = 0;
        for (String op : operations) {
            switch (op) {
                case "x++":
                case "++x":
                    x = x + 1;
                    break;
                default:
                    x = x - 1;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        String[] operations = {"x++", "++x", "--x"};
        System.out.println(solveExpression(operations));

        operations = new String[]{"++x", "++x", "x++"};
        System.out.println(solveExpression(operations));
    }
}
