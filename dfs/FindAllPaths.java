import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int v){
        val=v;
    }  

}

public class FindAllPaths {

  

   private static List<List<Integer>> AllPaths(TreeNode root){


        List<List<Integer>> paths = new ArrayList<List<Integer>>();
        List<Integer> currentPath =new ArrayList<>();

        findAllPaths(root,paths,currentPath);
        return paths;

   }
   private static void findAllPaths(TreeNode node, List<List<Integer>> paths,List<Integer> currentPath){

       if(node==null){
           return;
       }
       currentPath.add(node.val);

       if(node.left==null && node.right==null){
           paths.add(new ArrayList<>(currentPath));
       }

       findAllPaths(node.left,paths,currentPath);
       findAllPaths(node.right, paths, currentPath);

       currentPath.remove(currentPath.size()-1);
       return;
   }




    public static void main(String[] args) {
        
        TreeNode root=new TreeNode(12);
        TreeNode seven=new TreeNode(7);
        TreeNode ten = new TreeNode(10);
        root.left=seven;
        root.right=ten;
        TreeNode five = new TreeNode(5);
        TreeNode four = new TreeNode(4);
        TreeNode two = new TreeNode(2);
        seven.left = five;
        seven.right=two;
        ten.left=four;

        List<List<Integer>> paths =AllPaths(root);
        System.out.print("[");
        for(int i=0;i<paths.size();i++){
            System.out.print("[");
            for(int j=0;j<paths.get(i).size();j++){
                System.out.print(paths.get(i).get(j)+",");
            }
            System.out.print("],");


        }
        System.out.println("]");

    }
    
}
