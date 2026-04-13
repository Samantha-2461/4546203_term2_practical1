public class main {

    public static void main(String[] args) {
        //binary tree one
        BinaryTreeNode<String> binarynode1 = new BinaryTreeNode<>("a");
        BinaryTreeNode<String> binarynode2 = new BinaryTreeNode<>("b");
        BinaryTreeNode<String> binarynode3 = new BinaryTreeNode<>("c");
         BinaryTreeNode<String> binarynode4 = new BinaryTreeNode<>("d");
          BinaryTreeNode<String> binarynode5 = new BinaryTreeNode<>("e");
        node1.setLeft(binarynode2);
        node1.setRight(binarynode3);
        node2.setLeft(binarynode4);
        node2.setRight(binarynode5);
        node3.setLeft(null);
        node3.setRight(null);
        BinaryTree<String> bt1 = new BinaryTree<>(5, binarynode1);
       
        System.out.println("Root value bt1: " + bt1.getRoot().getValue());
        System.out.println("Left child value bt1: " + bt1.getRoot().getLeft().getValue());
        System.out.println("Right child value bt1: " + bt1.getRoot().getRight().getValue());
        System.out.println("Left child of left child value bt1: " + bt1.getRoot().getLeft().getLeft().getValue());
        System.out.println("Right child of left child value bt1: " + bt1.getRoot().getLeft().getRight().getValue());
        
        //binary tree two
        BinaryTreeNode<Double> binarynode6 = new BinaryTreeNode<>(3.4);
        BinaryTreeNode<Double> binarynode7 = new BinaryTreeNode<>(-1.5);
        BinaryTreeNode<Double> binarynode8 = new BinaryTreeNode<>(2.9);
        BinaryTreeNode<Double> binarynode9 = new BinaryTreeNode<>(-9.3);
        node6.setLeft(binarynode7);
        node6.setRight(binarynode8);
        node7.setLeft(binarynode9);
        node7.setRight(null);
        node8.setLeft(null);
        node8.setRight(null);
        BinaryTree<Double> bt2 = new BinaryTree<>(5, binarynode6);
        System.out.println();
        System.out.println("Root value of bt2: " + bt2.getRoot().getValue());
        System.out.println("Left child value of bt2: " + bt2.getRoot().getLeft().getValue());
        System.out.println("Right child value of bt2: " + bt2.getRoot().getRight().getValue());
        System.out.println("Left child of left child value of bt2: " + bt2.getRoot().getLeft().getLeft().getValue());
    
    }
}
