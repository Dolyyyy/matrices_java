package Ex2;


public class Main {
    public static void main(String[] args) {
        Matrice mat1 = new Matrice(3, 3);
        Matrice mat2 = new Matrice(3, 3);
        Matrice matRes = new Matrice(3, 3);
        
        mat1.data[0][0] = 1.0;
        mat1.data[0][1] = 2.0;
        mat1.data[0][2] = 3.0;
        mat1.data[1][0] = 4.0;
        mat1.data[1][1] = 5.0;
        mat1.data[1][2] = 6.0;
        mat1.data[2][0] = 7.0;
        mat1.data[2][1] = 8.0;
        mat1.data[2][2] = 9.0;
    
        mat2.data[0][0] = 9.0;
        mat2.data[0][1] = 8.0;
        mat2.data[0][2] = 7.0;
        mat2.data[1][0] = 6.0;
        mat2.data[1][1] = 5.0;
        mat2.data[1][2] = 4.0;
        mat2.data[2][0] = 3.0;
        mat2.data[2][1] = 2.0;
        mat2.data[2][2] = 1.0;

        if (MatriceOperations.addMatrice(matRes, mat1, mat2)) {
            System.out.println("Add : \n" + MatriceOperations.strMat(matRes, "Matrice"));
        }

        if (MatriceOperations.multMatrice(matRes, mat1, mat2)) {
            System.out.println("Mult : \n" + MatriceOperations.strMat(matRes, "Matrice"));
        }
    }
}
