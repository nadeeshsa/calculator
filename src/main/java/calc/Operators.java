package calc;

class Operators {

    static int add(Operands operands) {
        int sum = (operands.getA() + operands.getB());
        return sum;
    }

    static int substraction(Operands operands) {
        int sum = (operands.getA() - operands.getB());
        return sum;
    }
    static int multification(Operands operands) {
        int sum = (operands.getA() * operands.getB());
        return sum;
    }
    static double devide(Operands operands) {
        double a1 = (double) operands.getA();
        double a2 = (double) operands.getB();
        double sum = (a1 / a2);
        return sum;
    }
}
