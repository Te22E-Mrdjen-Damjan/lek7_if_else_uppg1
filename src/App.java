import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Vällkommen till dagens Frågesport");
        // 1. Lyssna på tangentbordet med en Scanner
        Scanner scan = new Scanner(System.in);
        //2. Skapa en variabel poäng som har värdet 0
        int poäng=0;
        // 3. Skriv ut en fråga till användaren
        System.out.println("Vad var förnamnet Jugoslaviens President från 2:a VK ");
        String svar = scan.nextLine();
        if(svar.equalsIgnoreCase("Tito"))
        {
            System.out.println("RÄTT SVAR");
            poäng++;
        }
        else
        {
            System.out.println("FEL SVAR!!!!");
        }

        // 4. Skriv ut en fråga till användaren
        System.out.println("Vad hette Jugoslaviens Huvudstad");
        String svar2 = scan.nextLine();
        if(svar2.equalsIgnoreCase("Belgrad"))
        {
            System.out.println("RÄTT SVAR");
            poäng++;
        }
        else 
        {
            System.out.println("FEL SVAR!!!");
        }
        System.out.println("vilken färg är en banan");
        String svar3 = scan.nextLine();
        if(svar3.equalsIgnoreCase("Gul"))
        {
            System.out.println("RÄTT SVAR");
            poäng++;
        } 
        else
        {
            System.out.println("FEL SVAR!!");
        }
        System.out.println("vad är 5 + 5? ");
        String svar4 = scan.nextLine();
        if(svar4.equalsIgnoreCase("10"))
        {
            System.out.println("RÄTT SVAR");
            poäng++;
        } 
        else
        {
            System.out.println("FEL SVAR!!");
        }
        System.out.println("Vad heter en sköldpadda på engelska? ");
        String svar5 = scan.nextLine();
        if(svar5.equalsIgnoreCase("Turtle"))
        {
            System.out.println("RÄTT SVAR");
            poäng++;
        } 
        else
        {
            System.out.println("FEL SVAR!!");
        }
        System.out.println("du fick "+poäng);
    }
}
