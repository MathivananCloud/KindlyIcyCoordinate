import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    /*
     * Scanner scanner = new Scanner(System.in);
     * Trees tree = new Trees();
     * tree.populate(scanner);
     */

    BinarySearchTrees bst = new BinarySearchTrees();
    bst.insert(11);
    bst.insert(10);
    bst.insert(12);
    bst.insert(5);
    bst.insert(14);
    bst.insert(15);
    bst.insert(13);
    bst.display(bst.getNode());

  }
}