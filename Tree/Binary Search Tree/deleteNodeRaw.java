class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        
        // If root.val < key, go to right sub tree
        if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        if(root.val > key){
            root.left = deleteNode(root.left, key);
        }
                
        if(root.val == key){
            
            if(root.left == null && root.right == null){
                root = null;
                return null;
            }
            
            // has one child
            if(root.left != null && root.right == null){
                return  root.left;
            }
            if(root.right != null && root.left == null){
                return root.right;
            }
            
            //has two children
            //find leftmost node, swap and delete
            if(root.left != null && root.right != null){
               TreeNode minOnRightTree = findMin(root);
               System.out.println("The min on the right sub tree is: " + minOnRightTree.val);
                TreeNode minCopy = new TreeNode(minOnRightTree.val);
                minCopy.left = root.left;
                minCopy.right = root.right;
                minOnRightTree = root;
                return minCopy;
            }
                        
        }
        
        
       // print(root);
        return root; 
       
    }
     private void print(TreeNode root){
            if(root == null) return;
            print(root.left);
            System.out.print(root.val + "-->");
            print(root.right);
        }
    private TreeNode findMin(TreeNode root){
        if(root == null) return root;
        if(root.right == null) return root;
        
        root = root.right;
        
       // TreeNode curr = root;
        while(root.left != null){
            root = root.left;
        }
        System.out.println("min node: " + root.val);
        return root;
    }

}