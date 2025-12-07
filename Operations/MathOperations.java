package Operations;

public class MathOperations {

    public static int calculateVal(int firstNum, String operation, int secondNum) {

        if (operation.equals("+")) {
            return firstNum + secondNum;
        } else if (operation.equals("-")) {
            return firstNum - secondNum;
        } else if (operation.equals("/")) {
            return secondNum != 0 ? firstNum / secondNum : 0;
        } else if (operation.equals("*") || operation.equals("x")) {
            return firstNum * secondNum;
        }

        throw new IllegalArgumentException("Operation Error! Please try again");
    }

    public static boolean isValidOperation(String operation) {
        return operation.equals("+") || operation.equals("-") ||
                operation.equals("×") || operation.equals("*") || operation.equals("/");
    }
}



