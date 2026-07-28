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
    
    int leavesum=0;

    public boolean checkTree(TreeNode root) {
        if(root==null){
            return false;
        }
        int rootsum=root.val;

        if(root.left==null && root.right==null){
            leavesum+=root.val;
        }

        checkTree(root.left);
        checkTree(root.right);

        return rootsum==leavesum;
        
    }
}