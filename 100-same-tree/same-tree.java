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
    public boolean isSameTree(TreeNode p, TreeNode q) {
       List<Integer> ans1=new ArrayList<>();
       List<Integer> ans2=new ArrayList<>();
       Trav1(p,ans1);
       Trav2(q,ans2);

    return ans1.equals(ans2);

    }

    public void Trav1(TreeNode p,List<Integer> ans1){
        if(p==null){
            ans1.add(null);
            return;
        }
        Trav1(p.left,ans1);
        Trav1(p.right,ans1);
        ans1.add(p.val);
    }
    public void Trav2(TreeNode q,List<Integer> ans2){
        if(q==null){
            ans2.add(null);
            return;
        }
        Trav2(q.left,ans2);
        Trav2(q.right,ans2);
        ans2.add(q.val);
    }
}