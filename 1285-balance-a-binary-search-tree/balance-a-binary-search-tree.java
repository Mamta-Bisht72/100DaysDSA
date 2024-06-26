/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<TreeNode> sorted = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return sortedToBst(0,sorted.size()-1);
    }
    
   void inorder(TreeNode root)
    {
        if(root==null)
            return;
       inorder(root.left);
       sorted.add(root);
       inorder(root.right);
        
    }
   TreeNode sortedToBst(int left,int right)
  {
      if(right<left)
          return null;
      int mid=left+(right-left)/2;
      TreeNode node=sorted.get(mid);
      node.left=sortedToBst(left,mid-1);
      node.right=sortedToBst(mid+1,right);
     return node;      
  }

}