package com.company;



final public class Matrix {
    private final int M;
    private final int N;
    private final double[][] data;

    public Matrix(int M, int N){
        this.M = M;
        this.N = N;
            data = new double[M][N];
    }

    public Matrix(double[][] data)
    {
        M = data.length;
        N = data[0].length;
            this.data = new double[M][N];
            for(int i = 0; i < M; i++)
                for(int j = 0; j < N; j++)
                this.data[i][j] = data[i][j];
    }

    private Matrix(Matrix A)
    {
        this(A.data);
    }

    public static Matrix random(int M, int N)
    {
        Matrix A = new Matrix(M, N);
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                A.data[i][j] = Math.random();
        return A;
    }

    public static Matrix identity(int N)
    {
        Matrix I = new Matrix(N, N);
        for(int i = 0; i < N; i++)
            I.data[i][i]= 1;
        return I;
    }

    private void swap(int i, int j)
    {
        double[] temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public Matrix transpose()
    {
        Matrix A = new Matrix(N, M);
        for(int i = 0; i < M; i++)
            for(int j = 0; j < N; j++)
                A.data[j][i] = this.data[i][j];
        return A;
    }

    


}
