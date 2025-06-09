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
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        return ans;
    }
    public int solve(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftDia=solve(root.left);
        int rightDia=solve(root.right);
        ans=Math.max(ans,leftDia+rightDia);
        return Math.max(leftDia,rightDia)+1;

    }
}