package fr.dampierre;
    import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Saisir le nombre totale d'articles:");
        int nbrArticles= sc.nextInt();
        int somme=0;
        int i=1;
        while (i <= nbrArticles) {
         System.out.println("prix de l'article "+ i+ " :");
         i++;
        somme+= sc.nextInt();
        }
        System.out.println("votre totale est: "+somme);
    }
    
}
