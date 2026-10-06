

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
    public int maxDepth(TreeNode root) {
        //base case when the root is null because the function is recursive so there is the option
        //that the method calls a null node
        if (root==null) return 0;
        return (1 +  Math.max(maxDepth(root.left), maxDepth(root.right)));
    }
}    