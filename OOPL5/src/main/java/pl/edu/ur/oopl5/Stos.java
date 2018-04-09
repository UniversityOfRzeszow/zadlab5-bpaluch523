/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;
import java.util.Scanner;
/**
 *
 * @author Bartek
 */
public class Stos {
    Scanner input=new Scanner(System.in);
    int x=input.nextInt();
    private int[] tablica = new int[x];
    for(int i=0;i<x;i++){
        tablica[i]=0;
    }
    
    public void push(){
        if(tablica[i]!=0) System.out.println("Brak miejsca");
        else { 
            System.out.println("Podaj wartosc do umieszczenia na stosie");
            tablica[i]=input.nextInt();
            break;
        }
        
    }
    
    public void pop(){
        for(int i=0;i<x;i++){
            if(tablica[i]==0) System.out.println("Brak elementu do zabrania");
            else System.out.println("Zabrano: "+tablica[i]);
            break;
        }
        
    }
}
