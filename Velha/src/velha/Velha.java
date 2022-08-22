/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velha;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Tarcyo
 */
public class Velha {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String nomeX,nomeO,rodada="";
        Scanner leia=new Scanner(System.in);
        System.out.print("Digite o nome do jogador de X: ");
        nomeX=leia.nextLine();
        System.out.print("\nDigite o nome do jogador de O: ");
        nomeO=leia.nextLine();
        System.out.println("\n\nQuem vai começar a jogar é...");
        Random random=new Random();
        int a=random.nextInt(2);
        switch(a){
            case 0:
                rodada="X";
                System.out.print("\n\nQuem vai começar a jogar é: "+nomeX+"!");
                break;
            case 1:
                rodada="O";
                System.out.print("\n\nQuem vai começar a jogar é: "+nomeO+"!");
                break;
        }
        String jogo[][]= new String[3][3];
        for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
            jogo[i][j]="?";
           } 
        }
          for(int i=0;i<9;i++){
            boolean rodadaValida=true;
            System.out.print("\n\n\n\nRodada atual: "+rodada+"\n"+"   0    1    2\n"
            +"0 |"+jogo[0][0]+"|  |"+jogo[0][1]+"|  |"+jogo[0][2]+"|"+
            "\n1 |"+jogo[1][0]+"|  |"+jogo[1][1]+"|  |"+jogo[1][2]+"|"+
            "\n2 |"+jogo[2][0]+"|  |"+jogo[2][1]+"|  |"+jogo[2][2]+"|\n");   
            int x,y;
            System.out.print("\nDigite a posição X: ");
            x=leia.nextInt();
            System.out.print("\nDigite a posição Y: ");
            y=leia.nextInt();
            if(jogo[y][x].equals("?")){
                jogo[y][x]=rodada;
                if((jogo[x][0].equals("?")==false&&jogo[x][0].equals(jogo[x][1])&&jogo[x][1].equals(jogo[x][2]))||(jogo[0][y].equals("?")==false&&jogo[0][y].equals(jogo[1][y])&&jogo[1][y].equals(jogo[2][y]))||(jogo[0][0].equals("?")==false&&jogo[0][0].equals(jogo[1][1])&&jogo[1][1].equals(jogo[2][2]))||(jogo[0][2].equals("?")==false&&jogo[0][2].equals(jogo[1][1])&&jogo[1][1].equals(jogo[2][0]))){
                    System.out.print("\n\n\n\nRodada atual: "+rodada+"\n"+"   0    1    2\n"
                    +"0 |"+jogo[0][0]+"|  |"+jogo[0][1]+"|  |"+jogo[0][2]+"|"+
                   "\n1 |"+jogo[1][0]+"|  |"+jogo[1][1]+"|  |"+jogo[1][2]+"|"+
                    "\n2 |"+jogo[2][0]+"|  |"+jogo[2][1]+"|  |"+jogo[2][2]+"|\n");
                    if(rodada.equals("X")){
                        System.out.print("\nO vencedor foi: "+nomeX+"!");
                    }else{
                        System.out.print("\nO vencedor foi: "+nomeO+"!");
                    }
                    return;
                }
            }else{
                System.out.print("\nJá está preechido!\n");
                //A RODADA NÃO FOI VÁLIDA ENTÃO RETORNA UM VALOR:
                i--;
                rodadaValida=false;
            }
            if(rodadaValida){
                if(rodada.equals("X")){
                    rodada="O";
                }else{
                    rodada="X";
                }
            }
       }
          //CASO A REPETIÇÃO ACABE, SIGNIFICA QUE TODAS AS POSIÇÕES FORAM PREENCHIDAS E DEU EMPATE:
           System.out.print("\n\n\n\n"+"   0    1    2\n"
            +"0 |"+jogo[0][0]+"|  |"+jogo[0][1]+"|  |"+jogo[0][2]+"|"+
            "\n1 |"+jogo[1][0]+"|  |"+jogo[1][1]+"|  |"+jogo[1][2]+"|"+
            "\n2 |"+jogo[2][0]+"|  |"+jogo[2][1]+"|  |"+jogo[2][2]+"|\n"); 
            System.out.print("\nDeu empate!");
    } 
}


