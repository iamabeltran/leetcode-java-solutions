

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
    public int diameterOfBinaryTree(TreeNode root) {

        if(root==null)return 0;
        if(isLeaf(root))return 0;
        int deep_l=0;
        int deep_r=0;
        TreeNode n_left=root.left;
        TreeNode n_right=root.left;
        while (n_left!=null || n_right!=null) {
            deep_l=Math.max(deepest(root.left),root);
            deep_r=Math.max(deepest(root.right),root);
        }
        return deep_l +deep_r;
        //return deepest(root.left)+deepest(root.right);
        //return deepest(root)+ (Math.max(deepest(root.right),deepest(root.left)));
        
    }
    
    public boolean isLeaf(TreeNode node){
        if(node.left==null && node.right==null) return true;
        return false;
    }
    
    public int deepest(TreeNode node){
        if(node==null) return 0;
        return Math.max(deepest(node.right) , deepest(node.left))+1;
    }
    public int shallowest(TreeNode node){
        if(node==null) return 0;
        return Math.min(shallowest(node.right), shallowest(node.left))+1;
    }
    
    
}