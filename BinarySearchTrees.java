class BinarySearchTrees {

  public Node node;

  public static class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
      this.value = value;
    }

  }

  public void insert(int value) {
    this.node = insert(value, this.node);
  }

  public Node insert(int value, Node node) {

    if (node == null) {
      node = new Node(value);
      return node;
    }
    if (value < node.value) {
      node.left = insert(value, node.left);
    } else {
      node.right = insert(value, node.right);
    }

    return node;
  }

  public void display(Node node) {
    {

      if (node == null) {
        return;
      }
      System.out.println(node.value);
      display(node.left);
      display(node.right);

    }
  }

}