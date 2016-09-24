package behavioral.interpreter;

import java.util.ArrayDeque;
import java.util.Deque;

import behavioral.interpreter.expression.Node;
import behavioral.interpreter.expression.ValueNode;
import behavioral.interpreter.expression.impl.DivNode;
import behavioral.interpreter.expression.impl.ModNode;
import behavioral.interpreter.expression.impl.MulNode;

/**
 * Created by ML3426 on 2016/9/24.
 *
 * @author ML3426
 */
public class Calculator {

    private String calStatement;
    private Node node;

    public void build(String calStatement) {
        Node leftNode = null, rightNode = null;

        Deque<Node> stack = new ArrayDeque<>();

        final String[] statementElem = calStatement.split(" ");
        for (int i = 0; i < statementElem.length; i++) {
            if (statementElem[i].equalsIgnoreCase("*")) {
                leftNode = stack.pop();
                rightNode = new ValueNode(Integer.parseInt(statementElem[++i]));
                stack.push(new MulNode(leftNode, rightNode));
            } else if (statementElem[i].equalsIgnoreCase("/")) {
                leftNode = stack.pop();
                rightNode = new ValueNode(Integer.parseInt(statementElem[++i]));
                stack.push(new DivNode(leftNode, rightNode));
            } else if (statementElem[i].equalsIgnoreCase("%")) {
                leftNode = stack.pop();
                rightNode = new ValueNode(Integer.parseInt(statementElem[++i]));
                stack.push(new ModNode(leftNode, rightNode));
            } else {
                stack.push(new ValueNode(Integer.parseInt(statementElem[i])));
            }
        }

        this.node = stack.pop();
    }

    public int compute() {
        return node.interpret();
    }
}
