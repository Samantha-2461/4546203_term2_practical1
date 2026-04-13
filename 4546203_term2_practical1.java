/* I acknowledge the use of a large language model named Gemini 3.1, to help me understand what are generic types, what is a constructor and 
how to use them in binary trees
the prompt used was " what are constructors and provide example of generic default and load constructors in encapsultation of binary trees"
and the prompt " how do you create getter and setter in binary trees" 
*/
public class BinaryTreeNode<E> {
  private E value;
  private BinaryTreeNode<E> left;
  private BinaryTreeNode<E> right;
  
  // default constructor 
  public class BinaryTreeNode(T value){
  this.value=value;
  this.left=null;
  this.Right=null;
}
// the load constructor 
public class BinaryTreeNode( ) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
// Getter method 
public int getValue() { return value;}
public BinaryTreeNode getLeft() { return left;}
public BinaryTreeNode getRight() { return Right;}

//Setter method
public void setValue (int Value) {this.value = value;}
public void setLeft (BinaryTreeNode Left) {this.left = left;}
public void setRight ( BinaryTreeNode Right) {this.right = right;}


    }
  }

