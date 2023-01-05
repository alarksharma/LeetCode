package org.example;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l= new ArrayList<>();
        print(matrix, 0, 0, matrix.length-1, matrix[0].length-1,l);
        return l;
    }
    void print(int[][] a, int starti,int startj, int endi, int endj,List<Integer> l ){
        for(int j=startj;j<=endj;j++){
            l.add(a[starti][j]);
            System.out.print(a[starti][j]+", ");
        }
        for(int i=starti+1;i<=endi;i++){
            l.add(a[i][endj]);
            System.out.print(a[i][endj]+", ");
        }
        for(int j=endj-1;j>=startj;j--){
            l.add(a[endi][j]);
            System.out.print(a[endi][j]+", ");
        }
        for(int i=endi-1;i>=starti+1;i--){
            l.add(a[i][startj]);
            System.out.print(a[i][startj]+", ");
        }
        print(a, starti+1, startj+1,endi-1, endj-1,l);
    }
}
