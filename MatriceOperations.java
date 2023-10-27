package Ex2;

public class MatriceOperations {
    static int initiator(Matrice mat, int n, int m) {
        if (mat.data != null) {
            mat.data = null;
        }
        mat.n = n;
        mat.m = m;
        mat.data = new double[n][m];

        for (int i = 0; i < mat.n; i++) {
            for (int j = 0; j < mat.m; j++) {
                mat.data[i][j] = 0.0;
            }
        }

        return 0;
    }

    static String strMat(Matrice m, String strPrefix) {
        StringBuilder strRes = new StringBuilder(strPrefix + "{");

        for (int i = 0; i < m.n; i++) {
            strRes.append(i > 0 ? ", " : "{");
            for (int j = 0; j < m.m; j++) {
                strRes.append(j > 0 ? ", " : "{").append(m.data[i][j]);
            }
            strRes.append("}");
        }

        return strRes.append("}").toString();
    }

    static boolean addMatrice(Matrice mRes, Matrice m1, Matrice m2) {
        boolean bRes = (m1.m == m2.m) && (m1.n == m2.n);
        if (bRes) {
            for (int i = 0; i < m1.n; i++) {
                for (int j = 0; j < m1.m; j++) {
                    mRes.data[i][j] = m1.data[i][j] + m2.data[i][j];
                }
            }
        }
        return bRes;
    }

    static boolean multMatrice(Matrice mRes, Matrice m1, Matrice m2) {
        boolean bRes = (m1.n == m2.m);
        if (bRes) {
            initiator(mRes, m1.m, m2.n);
            for (int i = 0; i < m1.m; i++) {
                for (int j = 0; j < m2.n; j++) {
                    mRes.data[i][j] = 0.0;
                    for (int k = 0; k < m1.n; k++) {
                        mRes.data[i][j] += m1.data[i][k] * m2.data[k][j];
                    }
                }
            }
        }
        return bRes;
    }
}
