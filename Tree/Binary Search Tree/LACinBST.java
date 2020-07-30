/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


// My first solution
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        // if root.val is between p and q, then root is the LCA
        if(((root.val > p.val) && (root.val < p.val)) || ((root.val < p.val) && (root.val > p.val))){
            return root;
        }
        if((p.val < root.val) && (q.val < root.val)){
            root = lowestCommonAncestor(root.left, p, q);
        }
        if((p.val > root.val) && (q.val > root.val)){
           root = lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}

// A more concise version
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(p.val > root.val && q.val > root.val){
           return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        } 
    }
}