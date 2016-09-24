package behavioral.interpreter;

/**
 * Created by ML3426 on 2016/9/24.
 *
 * @author ML3426
 */
public class Client {

    public static void main(String[] args) {
        String calStatement = "3 * 2 * 4 / 6 % 5";

        Calculator calculator = new Calculator();

        calculator.build(calStatement);

        int result = calculator.compute();

        System.out.println(calStatement + " = " + result);
    }
}
