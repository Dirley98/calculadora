package calculadora;


/**
 *
 * @author Dirley Puentes
 */
public class CalculadoraDeMatrices {
  
//suma
    public String suma(double [][] matrizA,double [][] matrizB,int tam) {
        double mR[][] = new double[tam][tam];
        for (int i = 0; i < tam ;i++) {    
            for (int j = 0; j < tam; j++) {
              mR[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        String resultadoF = "";
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                resultadoF += mR[i][j]+"  ";
                 }
            resultadoF += "\n";
        }
        
      return resultadoF;
    }
    //resta
    public String resta(double [][] matrizA,double [][] matrizB,int tam) {
        double mR[][] = new double[tam][tam];
        for (int i = 0; i < tam ;i++) {    
            for (int j = 0; j < tam; j++) {
              mR[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }
        String resultadoF = " ";
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                resultadoF += mR[i][j]+"  ";
                 }
            resultadoF += "\n";
        }
        
      return resultadoF;
    }
    //traza
    public int traza(double [][] matrizA,int tam) {
        int traza=0;
        for (int i = 0; i < tam ;i++) {    
            for (int j = 0; j < tam; j++) {
                if(i==j){
              traza+= matrizA[i][j];
            }
            }          
        }
      return traza;
    }
    //cofactor para el determinante
        public void cofactor(double matriz[][], double temp[][], int p, int q, int n) {
        int i = 0, j = 0;

        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                if (fila != p && columna != q) {
                    temp[i][j++] = matriz[fila][columna];

                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }

                }
            }
        }
    }
    //Determinante
    public double determinante(double matriz[][], int tam) {

        double determinante = 0;
        if (tam == 1) {
            determinante = matriz[0][0];
        }
        if (tam != 1) {
            double temp[][] = new double[tam][tam];
            double multiplicador = 1;
            for (int f = 0; f < tam; f++) {
                cofactor(matriz, temp, 0, f, tam);
                determinante += multiplicador * matriz[0][f] * determinante(temp, tam - 1);
                multiplicador = -multiplicador;
            }

        }
        return determinante;
    }
}
