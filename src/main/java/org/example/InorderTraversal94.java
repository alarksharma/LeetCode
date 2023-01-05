package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal94 {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> lst=new ArrayList<>();
            Stack<TreeNode> s=new Stack<>();
            while(!(root==null && s.isEmpty())){
                while(root!=null) {
                    s.push(root);
                    root = root.left;
                }
                root=s.pop();
                lst.add(root.val);
                root=root.right;
            }
            return lst;
        }
}
