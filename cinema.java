import java.util.Scanner;

public class cinema{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;

        for (int i =0; i< 2; i ++){
            int x = scanner.nextInt();
            if(x < 18){
                resultado +=15;
            }else if ( x < 60){
                resultado +=30;
            }else  {
                resultado += 20;
                
            }
    
        }
        System.out.println(resultado);
            scanner.close();
    }
}