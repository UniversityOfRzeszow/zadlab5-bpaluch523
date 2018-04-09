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
public class Firma {
    
    Scanner input = new Scanner(System.in);
    Pracownik[] prac = new Pracownik[100];
    for(int z=0;z<100;z++){
           prac[z]=new Pracownik("","",0,"");
           }
    public void wypisz(){
        System.out.println("Wszyscy Pracownicy:");
        for(int i=0;i<100;i++){
            prac[i].pokaz();
            System.out.println("-------");
        }
    }
    
    
}
