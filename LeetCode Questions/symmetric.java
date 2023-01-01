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
    public boolean checkSymmetric(TreeNode leftTree , TreeNode rightTree){
        
        if(leftTree == null && rightTree== null){
            return true; 
        }
        if(leftTree ==null || rightTree ==null){
            return false; 

        }
        if(leftTree.val == rightTree.val){
            return checkSymmetric(leftTree.left,rightTree.right) && checkSymmetric(leftTree.right , rightTree.left);
        }else{
            return false;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        return checkSymmetric(root.left,root.right);
        
        
    }
