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
public class Pracownik {
    
    Scanner input = new Scanner(System.in);
    
    public String imie;
    public String nazwisko;
    public int wiek;
    public String stanowisko;

    public Pracownik(String imie, String nazwisko, int wiek, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }
    
    public void dodaj(){
        System.out.println("Podaj imie: ");
        this.imie=input.next();
        System.out.println("Podaj nazwisko: ");
        this.nazwisko=input.next();
        System.out.println("Podaj wiek: ");
        this.wiek=input.nextInt();
        System.out.println("Podaj stanowisko: ");
        this.stanowisko=input.next();
    }
    
    public void pokaz(){
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Wiek: "+wiek);
        System.out.println("Stanowisko: "+stanowisko);
    }
}
