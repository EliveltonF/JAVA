

import java.util.Scanner;

public class Proj {
    
    public static void main(String[] args){
    int cont = 0;
    double soma = 0;
    double aux = 0;
    String help = "Vc digitou 0, não aceitamos, colocamos 1 no lugar :D";
    System.out.println("Quantas linhas: ");
    Scanner input = new Scanner(System.in);
    int ln = input.nextInt();
    int tabela[][] = new int[ln][ln];
    for(int i = 0; i < tabela.length; i++){
        for(int j = 0; j <= cont; j++){
            System.out.println("Digite um numero >0: ");
            tabela[i][j] = input.nextInt();
            if(tabela[i][j] == 0){
                System.out.println(help);
                tabela[i][j] = 1;
            }
            if(j == 0){
                aux = tabela[i][j];
            }
            if(tabela[i][j] < aux){
                aux = tabela[i][j];
            }
        }
        soma += aux;
        cont++;
    }
    input.close();
    for(int i = 0 ; i < tabela.length; i++){
        for(int j = 0; j < tabela.length; j++){
            if(tabela[i][j] == 0){
                continue;
            }
            System.out.print(" "+ tabela[i][j]);
        }System.out.println(" ");
    }System.out.println("Soma dos menores valores = "+ soma);

  }
}
