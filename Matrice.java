package Ex2;


class Matrice {
    public int n, m;
    public double[][] data;

    public Matrice(int n, int m) {
        this.n = n;
        this.m = m;
        this.data = new double[n][m];
    }
}
