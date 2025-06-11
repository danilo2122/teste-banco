
import java.util.Scanner;

public class  jogo{
    int[] n,q ;
    import java.util.Scanner;

public class JogoDaVida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        scanner.nextLine(); 

        int[][] matriz = new int[N][N];
        
        
        for (int i = 0; i < N; i++) {
            String linha = scanner.nextLine();
            for (int j = 0; j < N; j++) {
                matriz[i][j] = linha.charAt(j) - '0';
            }
        }
        
  
        for (int step = 0; step < Q; step++) {
            matriz = proximoEstado(matriz, N);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        
        scanner.close();
    }

    public static int[][] proximoEstado(int[][] matriz, int N) {
        int[][] novaMatriz = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int vizinhosVivos = contarVizinhosVivos(matriz, i, j, N);

                if (matriz[i][j] == 1) {
                    novaMatriz[i][j] = (vizinhosVivos == 2 || vizinhosVivos == 3) ? 1 : 0;
                } else {
                    novaMatriz[i][j] = (vizinhosVivos == 3) ? 1 : 0;
                }
            }
        }
        return novaMatriz;
    }


    public static int contarVizinhosVivos(int[][] matriz, int x, int y, int N) {
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        int vizinhosVivos = 0;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < N && matriz[nx][ny] == 1) {
                vizinhosVivos++;
            }
        }
        return vizinhosVivos;
    }
}

    
    

}