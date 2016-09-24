package behavioral.interpreter.expression;

/**
 * Created by ML3426 on 2016/9/24.
 *
 * @author ML3426
 */
public abstract class SymbolNode implements Node {

    protected Node leftNode;
    protected Node rightNode;

    public SymbolNode(Node leftNode, Node rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}
