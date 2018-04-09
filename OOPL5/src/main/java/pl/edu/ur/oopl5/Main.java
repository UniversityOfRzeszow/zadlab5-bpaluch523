package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 5, 6
        
        Scanner input = new Scanner(System.in);
        
        //ZAD 3
         System.out.println("Podaj wielkosc tablicy stosu");
                Stos stos1 = new Stos();
                int i=0;
                while(i<stos.n){
                    i++;
                    stos1.push();
                    stos1.pop();
                }
        
        //ZAD 5
        
        System.out.println("ZAD 5");
        int x;
        do{
            System.out.println("Wybierz opcje:");
            System.out.println("1.Dodaj pracownika");
            System.out.println("2.Wypisz wszystkich pracownikow");
            System.out.println("3.Przejdz do kolejnego zadania");
            x=input.nextInt();
            if(x==1){
                System.out.println("Podaj nr indeksu pracownika do wpisania jego danych:");
                int nr=input.nextInt();
                prac[nr].dodaj();
            }
            else if(x==2){
                prac.wypisz();
            }
        }while(x!=3);
       
    }
    
}
