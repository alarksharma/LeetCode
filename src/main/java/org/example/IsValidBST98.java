package org.example;
// leetcode#98

public class IsValidBST98 {
    long last=Long.MIN_VALUE;
    boolean result=true;
    public boolean isValidBST(TreeNode root) {
        printIn(root);
        return result;
    }
    void printIn(TreeNode root){
        if(root!=null){
            printIn(root.left);
            if(root.val>last) {
                last = root.val;
                printIn(root.right);
            }else {
                result=false;
            }
        }
    }
}
