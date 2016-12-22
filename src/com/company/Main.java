package com.company;

public class Main {

    public static void main(String[] args) {
	double[][] d = { {1, 2, 3}, {4, 5, 6}, {9, 1, 3} };
	Matrix D = new Matrix(d);
	    D.show();
	    StdOut.println();
	Matrix A = Matrix.random(5, 5);
	    A.show();
	    StdOut.println();
	    A.swap(1, 2);
	    A.show();
	    StdOut.println();
	Matrix B = A.transpose();
	    B.show();
	    StdOut.println();
	Matrix C = Matrix.identity(5);
	    C.show();
	    StdOut.println();
	    A.plus(B).show();
	    StdOut.println();
	    B.times(A).show();
	    StdOut.println();
	    StdOut.println(A.times(B).eq(B.times(A)));
	    StdOut.println();
	Matrix b = Matrix random (5, 1);
	    b.show();
	    StdOut.println();
	Matrix x = A.solve(b);
	    x.show();
	    StdOut.println();
	    A.times(x).show();
	    
	    
		  
    }
}
