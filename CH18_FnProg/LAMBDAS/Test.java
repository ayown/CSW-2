package CH18_FnProg.LAMBDAS;

public class Test {
    interface printingSomeText {
        void print(String anyValue);
    }

    public static void main(String[] args) {
        String lambdaText = " Understanding Lambdas";
        printingSomeText pst = (String letsPrint) -> { System.out.println(letsPrint); };

        pst.print(lambdaText);
    }
}
