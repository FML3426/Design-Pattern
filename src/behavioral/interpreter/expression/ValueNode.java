package behavioral.interpreter.expression;

/**
 * Created by ML3426 on 2016/9/24.
 *
 * @author ML3426
 */
public class ValueNode implements Node {

    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
