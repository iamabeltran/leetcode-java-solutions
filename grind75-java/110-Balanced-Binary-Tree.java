import java.lang.Math;

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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true; //in case that there are not nodes we supose that the tree is balanced 
            
        int height_left=0; int height_right=0;
        height_left=counter(root.left);
        height_right=counter(root.right);
        if(Math.abs(height_left-height_right)>1 ){
            return false;
        }
        return (isBalanced(root.left)&&isBalanced(root.right));                     
    }
    public int counter(TreeNode root){
        if(root==null) return 0;
        return 1+(Math.max(counter(root.left), counter(root.right)));
    }

}