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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int sum=root.val;
        int max=root.val;
        int val=1;
        int c=1;
        while(!q.isEmpty()){
            int n=q.size();
            
            sum=0;
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                sum +=temp.val;
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            c++;
            if(sum>max){
                max=Math.max(max,sum);
                val=c;
            }
        }
        return val==1?val:val-1;
    }
}