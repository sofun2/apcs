// @Authors: Tim Chuang, Anne Ouyang

/*
[ok] Display Menu
[ok] User Interface
[ok] Matrix Input / Output
[ok] Scalar multiplication of a single matrix. (a matrix multiplied by a constant)
[ok] Addition of two matrices.
[ok] Subtraction of two matrices.
[ok] Determinant of a matrix. 
[ok] Multiplication of two matrices.
[ok] Finding inverse of a matrix.
[ok] Reduced row echelon form.
*/

import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.println("1: Scalar Multiplication");
            System.out.println("2: Addition");
            System.out.println("3: Subtraction");
            System.out.println("4: Determinant");
            System.out.println("5: Multiplication");
            System.out.println("6: Inverse");
            System.out.println("7: Reduced Row Echelon Form");
            System.out.print("Pick an option: ");
            int op = in.nextInt();
            switch(op) {
                case(1):
                    System.out.println("Enter your matrix:");    
                    double[][] a = getMatrix();
                    System.out.print("Scalar: ");
                    double scalar = in.nextDouble();
                    double[][] result = scalarMult(a, scalar);
                    dispMatrix(result);
                    break;
                case(2):
                    System.out.println("Enter your first matrix:");
                    a = getMatrix();
                    System.out.println("Enter your second matrix:");
                    double[][] b = getMatrix();
                    result = addition(a, b);
                    dispMatrix(result);
                    break;
                case(3):
                    System.out.println("Enter your first matrix:");
                    a = getMatrix();
                    System.out.println("Enter your second matrix:");
                    b = getMatrix();
                    result = subtraction(a, b);
                    dispMatrix(result);
                    break;
                case(4):
                    System.out.println("Enter your matrix:");    
                    a = getMatrix();
                    double c = determinant(a);
                    System.out.print(c);
                    break;
                case(5):
                    System.out.println("Enter your first matrix:");    
                    a = getMatrix();
                    System.out.println("Enter your second matrix:");
                    b = getMatrix();
                    result = multiplication(a, b);
                    dispMatrix(result);
                    break;
                case(6):
                    System.out.println("Enter your matrix:");
                    a = getMatrix();
                    result = inverse(a);
                    dispMatrix(result);
                    break;
                case(7):
                    System.out.println("Enter your matrix:");
                    a = getMatrix();
                    result = reducedRowEchelon(a);
                    dispMatrix(result);
                    break;
                default:
                    break;
            }
            in.nextLine();
            System.out.print("Continue? [y][n]: ");
            String cont = in.nextLine();
            if(cont.equalsIgnoreCase("n")) break;
        }
    }

    public static double[][] getMatrix() {
        String tmp;
        Scanner in = new Scanner(System.in);
        System.out.print("Number of Rows: ");
        int r = in.nextInt();
        tmp = in.nextLine();
        System.out.print("Number of Columns: ");
        int c = in.nextInt();
        double [][] a = new double[r][c];
        boolean confirm = true;
        while (confirm) {
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    System.out.printf("Input row %d column %d: ", i, j);
                    a[i][j] = in.nextDouble();
                    in.nextLine();
                }
            }
            dispMatrix(a);
            boolean rerestart = true;
            while (rerestart) {
                System.out.print("Confirm? [y][n]: ");
                String check = in.next();
                if (check.equalsIgnoreCase("y")) {
                    confirm = false;
                    rerestart = false;
                    break;
                }
                else if (check.equalsIgnoreCase("n")) {
                    confirm = true;
                    rerestart = false;
                    break;
                }
                else {
                    System.out.println("Please enter 'y' or 'n'");
                    rerestart = true;
                }
            }
        }
        return a;
    }
    
    public static void dispMatrix(double [][] a) {
        double eps = 1e-10;
        if(a.length == 0) return;
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                if(Math.abs(a[i][j]) <= eps) a[i][j] = 0;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static double [][] scalarMult(double [][] a, double k) {
        if(a.length == 0) return null;
        double [][] b = new double[a.length][a[0].length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                b[i][j] = a[i][j] * k;
            }
        }
        return b;
    }

    public static double [][] addition(double [][] a, double [][] b) {
        if(a.length == 0 || b.length == 0) return null;
        if(a.length != b.length || a[0].length != b[0].length) return null;
        double [][] c = new double[a.length][a[0].length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static double [][] subtraction(double [][] a, double [][] b) {
        return addition(a, scalarMult(b, -1));
    }

    public static double [][] multiplication(double [][] a, double [][] b) {
        if(a.length == 0 || b.length == 0) return null;
        if(a[0].length != b.length) return null;
        double [][] c = new double[a.length][b[0].length];
        for(int i = 0; i < c.length; i++) {
            for(int j = 0; j < c[0].length; j++) {
                c[i][j] = 0;
                for(int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static double [][] minor(double [][] a, int r, int c) {
        int n = a.length - 1;
        double [][] b = new double [n][n];
        int ii = 0;
        for(int i = 0; i < a.length; i++) {
            if(i == r) continue;
            int jj = 0;
            for(int j = 0; j < a[0].length; j++) {
                // System.out.printf("i: %d\t j: %d\t, ii: %d\t, jj: %d\n", i, j, ii, jj);
                if(j == c) continue;
                b[ii][jj] = a[i][j];
                jj++;
            }
            ii++;
        }
        return b;
    }

    // oops laplace expansion is O(n!)
    // implement lower upper decomposition if there is time
    public static double determinant(double [][] a) {
        if(a.length == 0 || a.length != a[0].length) return Double.NaN;
        double det = 0;
        int n = a.length;
        if(n == 1) return a[0][0];
        int sign = 1;
        for(int i = 0; i < n; i++) {
            double [][] tmp = minor(a, 0, i);
            det += (sign * a[0][i] * determinant(tmp));
            sign = -sign;
        }
        return det;
    }

    public static double [][] transpose(double [][] a) {
        double [][] b = new double [a.length][a[0].length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }

    // try to find inverse with gauss jordan
    public static double [][] inverse(double [][] a) {
        double det = determinant(a);
        if(det == 0 || Double.isNaN(det)) return null;
        // 1: adjoint matrix
        // 1.1: cofactor matrix
        double [][] b = new double [a.length][a[0].length];
        for(int i = 0; i < a.length; i++) {
            int sign = (i % 2 == 0 ? 1 : -1);
            for(int j = 0; j < a[0].length; j++) {
                b[i][j] = sign * determinant(minor(a, i, j));
                sign = -sign;
            }
        }
        // dispMatrix(b);
        // 1.2: transpose
        b = transpose(b);
        // 2: divide by determinant
        return scalarMult(b, 1.0/det);
    }

    public static double[][] reducedRowEchelon(double a[][]) {
        int r = a.length;
        if(r == 0) return null;
        int c = a[0].length;
        int p = 0;
        for(int i = 0; i < r; i++) {
            if(p >= c) break;
            // find the nonzero pivot and swap rows
            int ii = i;
            while(a[ii][p] == 0) {
                ii++;
                if(ii == r) {
                    ii = i;
                    p++;
                    if(p == c) return a;
                }
            }
            double [] ta = a[i];
            a[i] = a[ii];
            a[ii] = ta;
            // divide entire row by a[i][p] to make pivot 1;
            double dv = a[i][p];
            for(int j = 0; j < c; j++) {
                a[i][j] = a[i][j] / dv;
            }
            // make the elements in the column 0
            for(ii = 0; ii < r; ii++) {
                if(ii == i) continue;
                double m = -1 * a[ii][p];
                for(int j = 0; j < c; j++) {
                    a[ii][j] = a[ii][j] + a[i][j] * m;
                }
            }
            p++;
        }
        return a;
    }
}
