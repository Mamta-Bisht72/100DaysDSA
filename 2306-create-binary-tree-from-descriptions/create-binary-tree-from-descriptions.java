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
    public TreeNode createBinaryTree(int[][] descriptions) {
            HashMap<Integer, TreeNode> hmap = new HashMap();
           Set<Integer> children = new HashSet();
          for (int[] arr : descriptions) {
            int parent = arr[0], child = arr[1], isLeft = arr[2];
            children.add(child);
            TreeNode node = hmap.getOrDefault(parent, new TreeNode(parent));
            if (isLeft == 1) {
                node.left = hmap.getOrDefault(child, new TreeNode(child));
                hmap.put(child, node.left);
            } else {
                node.right = hmap.getOrDefault(child, new TreeNode(child));
                hmap.put(child, node.right);
            }
            hmap.put(parent, node);
        }
        int root = -1;
        for (int [] arr: descriptions) {
            if (!children.contains(arr[0])) {
                root = arr[0];
                break;
            }
        }
        
        return hmap.getOrDefault(root, null);
    }
}