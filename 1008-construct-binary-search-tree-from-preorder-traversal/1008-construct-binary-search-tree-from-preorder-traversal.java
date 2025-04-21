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
   
    TreeNode insert(TreeNode root,int val ){
        TreeNode temp=new TreeNode(val);
        if(root==null)return temp;
        if(root.val>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] nums) {
        TreeNode root=null;
        for(int x:nums){
            root=insert(root,x);
        }
        return root;
    }
}

