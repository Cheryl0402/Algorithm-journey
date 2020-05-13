public void preorder(root){
if(root==null){return;}
System.out.println(root.value);
preorder(root.left);
preorder(root.right);
}
