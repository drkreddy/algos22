import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};

public class LevelOrderT {
  public static TreeNode findSuccessor(TreeNode root, int key) {
    // TODO: Write your code here

    Queue<TreeNode> q=new LinkedList<>();
    q.offer(root);
    boolean found=false;

    while(!q.isEmpty()){
      int ls=q.size();
      for(int i=0;i<ls;i++){
        TreeNode n= q.poll();
        if(found){
          return n;
        }
        if(n.val==key){
          found=true;
        }
        if(n.left!=null)
           q.offer(n.left);
        if(n.right!=null)
           q.offer(n.right);

      }

    }

    return null;    
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(12);
    root.left = new TreeNode(7);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(9);
    root.right.left = new TreeNode(10);
    root.right.right = new TreeNode(5);
    TreeNode result = LevelOrderT.findSuccessor(root, 12);
    if (result != null)
      System.out.println(result.val + " ");
    result = LevelOrderT.findSuccessor(root, 9);
    if (result != null)
      System.out.println(result.val + " ");
  }
}
