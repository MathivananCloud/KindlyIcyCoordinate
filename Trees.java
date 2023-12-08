import java.util.Scanner;

class Trees {

  private Node node;  

  private static class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
      this.value = value;
    }

    public int getValue()
    {
      return this.value;
    } 
  }

  public void populate(Scanner scanner) {

    System.out.println("Enter the root node value:");
    int rootValue = scanner.nextInt();
    Node node = new Node(rootValue);
    populateNode(scanner, node);

  }

  public void populateNode(Scanner scanner, Node Node) {

    System.out.println("Do you have left Node:");
    boolean isLeft = scanner.nextBoolean();

    if (isLeft) {
      System.out.println("Enter the left child node value:");
      int leftValue = scanner.nextInt();
      Node left = new Node(leftValue);
      populateNode(scanner, left);
    }

    System.out.println("Do you have Right Node:");
    boolean isRight = scanner.nextBoolean();

    if (isRight) {
      System.out.println("Enter the right child node value:");
      int rightValue = scanner.nextInt();
      Node right = new Node (rightValue);
      populateNode(scanner, right);
    }

  }

}
