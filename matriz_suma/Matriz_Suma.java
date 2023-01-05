/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_suma;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Matriz_Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int matriz[][], nFilas, nCol, sumaFilas, sumaCol, opcion;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));
        
        matriz = new int[nFilas][nCol];
        
        System.out.println("Digite la matríz...");
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nCol;j++){
                System.out.println("Matríz["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\nLa matríz es: ");
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nCol;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        while(!salir){
        
            System.out.println("\nElija el método a realizar: \n");
            
            System.out.println("1. Sumar por Filas");
            System.out.println("2. Sumar por Columnas");
            System.out.println("3. SALIR\n");
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    //SUMA DE FILAS
                    for(int i=0;i<nFilas;i++){
                        sumaFilas = 0;
                        for(int j=0;j<nCol;j++){
                            sumaFilas += matriz[i][j];
                        }
                        System.out.print("\nLa suma de la fila["+i+"] es: "+sumaFilas);
                    }
                    System.out.println("");
                break;
        
                case 2:
                    //SUMA DE COLUMNAS
                    for(int j=0;j<nCol;j++){
                        sumaCol = 0;
                        for(int i=0;i<nCol;i++){
                            sumaCol += matriz[i][j];

                        }
                        System.out.print("\nLa suma de la columna["+j+"] es: "+ sumaCol);
                    }
                    System.out.println("");
                break;
                
                case 3:
                    salir = true;
                break;
                
                default:
                    System.out.println("Valor incorrecto :'v ");
            }
        }
    }
    
}
