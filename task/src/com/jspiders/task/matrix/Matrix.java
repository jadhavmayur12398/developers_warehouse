package com.jspiders.task.matrix;

public class Matrix {
	public static void main(String[] args) {
		int mat1 [] [] = {{1,1,1},{2,2,2},{3,3,3}};
		int mat2 [] [] = {{1,1,1},{2,2,2},{3,3,3}};
		int result [] [] = new int[3] [3];
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result [i] [j] =0;
				for (int j2 = 0; j2 < result.length; j2++) {
					result [i][j]+=mat1[i][j2]*mat2[j2][i];
				}
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
