package com.litmus;

import java.util.Arrays;

public class WorkWith2DArrays {
    public  static  void  main(String[] args){
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j){
                    board[i][j] = '0';
                }
                else {
                    board[i][j] = '-';
                }
            }
            
        }
        char[][] boardTwo = new char[][]{
            new char[] {'-', '-','-'},
                new char[] {'-', '-','-'},
                new char[] {'-', '-','-'},
        };
        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
