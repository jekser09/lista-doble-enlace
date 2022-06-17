/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.doble.enlace;

import java.util.Scanner;

/**
 *
 * @author Torrev_101
 */
public class dobleEnlace {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Nodo p=new Nodo();
        Nodo q=new Nodo();
        Nodo cab=new Nodo();
        Nodo fin=new Nodo();
        for(int i=0;i<3;i++){
            p=new Nodo();
            System.out.println("ingrese dato "+(i+1));
            p.dato=sc.nextInt();
            if(i==0){
                q=p;
                cab=p;
            }else{
                q.enlacep=p;
                p.enlacea=q;
                q=p;
            }
        }
        fin=p;
        p=cab;
        System.out.println("impresion izquierda a derecha");
        for(int i=0;i<3;i++){
            System.out.print(p.dato+"|");
            p=p.enlacep;
        }
        System.out.println("\n"+"---------------------");
        p=fin;
         System.out.println("impresion derecha a izquierda");
        for(int i=0;i<3;i++){
            System.out.print(p.dato+"|");
            p=p.enlacea;
        }
        System.out.println();
    }
}
class Nodo{
    Nodo enlacea;
    int dato;
    Nodo enlacep;
}