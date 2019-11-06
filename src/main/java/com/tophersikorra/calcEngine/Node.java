package main.java.com.tophersikorra.calcEngine;



public class Node {
    NodeID id;
    NodeInfo info = NodeInfo.NO_INFO;
    int precedence = 10;
    double value = 0;
    Node left = null;
    Node right = null;
    Node parent = null;

    Node node;

    public Node(NodeID ID, int precedence, double value) {
        this.id = ID;
        this.precedence = precedence;
        this.value = value;
    }

    public void insert(Node current_node, Node new_node, NodeInfo info) {
        if (info != NodeInfo.DONT_CLIMB) {
            while (current_node.precedence >= new_node.precedence) {
                current_node = current_node.get_parent();
            }
        }

        if (new_node.id == NodeID.CLOSE_BRACKET) {
            node = current_node.get_parent();
            node.right = current_node.get_right();

            if (node.right != null)
                node.right.parent = node;
        }
    }



    public Node get_parent() {
        return this.parent;
    }
    public Node get_right() {
        return this.right;
    }
    public Node get_left() { return this.left; }
}
