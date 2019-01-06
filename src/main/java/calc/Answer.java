package calc;

public class Answer {
    private String a;
    private String b;
    private String result;
    private String operation;

    public Answer(String a, String b, String operation, String result) {
        this.a = a;
        this.b = b;
        this.result = result;
        this.operation = operation;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getOperation() {
        return operation;
    }

    public String getResult() {
        return result;
    }
}
