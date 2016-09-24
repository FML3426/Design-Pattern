package behavioral.interpreter.expression.impl;

import behavioral.interpreter.expression.Node;
import behavioral.interpreter.expression.SymbolNode;

/**
 * Created by ML3426 on 2016/9/24.
 *
 * @author ML3426
 */
public class DivNode extends SymbolNode {

    public DivNode(Node leftNode, Node rightNode) {
        super(leftNode, rightNode);
    }

    @Override
    public int interpret() {
        return leftNode.interpret() / rightNode.interpret();
    }
}
