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
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root==null)
            return null;
        if(root.val==key)
        {
            //0 child and 1 child 
            
            if(root.right==null)
                return root.left;
            else if(root.left==null)
                return root.right;              
            
            // 2 child
            // find min value from right subtree and replace root with it.

            TreeNode min=findMin(root.right);
            root.val=min.val;
            root.right=deleteNode(root.right,root.val);
            
        }
        else if(key<root.val)
        {
            //left side
           root.left= deleteNode(root.left,key);
        }
        
        else
        {
            //right side
           root.right= deleteNode(root.right,key);
        }
        return root;
    }
    
    private TreeNode findMin(TreeNode node)
    {
        while(node.left!=null)
        {
            node=node.left;
        }
        return node;
    }
    
    
}