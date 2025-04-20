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
    ArrayList<Integer> ls=new ArrayList<>();
    void in(TreeNode root){
        if(root!=null){
            in(root.left);
            ls.add(root.val);
            in(root.right);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        in(root);
        return ls.get(k-1);
    }
}