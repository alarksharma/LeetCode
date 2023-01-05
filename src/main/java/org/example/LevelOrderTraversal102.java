package org.example;

import java.util.*;

public class LevelOrderTraversal102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultLst=new ArrayList<>();
        Stack s=new Stack();
        Queue q= new LinkedList();
        if(root==null){
            return resultLst;
        }
        q.add(root);
        TreeNode p;
        while(!q.isEmpty()){
            List<Integer> ls=new LinkedList<>();
            int size=q.size();
            while(size!=0){
               p=(TreeNode)q.poll();
                size--;
               ls.add(p.val);
               if(p.left!=null)
                   q.add(p.left);
               if(p.right!=null)
                   q.add(p.right);
            }
            resultLst.add(ls);
        }
        return resultLst;
    }
}
