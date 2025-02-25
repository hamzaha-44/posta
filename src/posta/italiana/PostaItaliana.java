
package posta.italiana;

import java.util.Scanner;

public class PostaItaliana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Messaggio di benvenuto
        System.out.println("Benvenuto alla Posta Italiana!");
        System.out.println("Scegli l'operazione che desideri effettuare:");

        // Menu delle operazioni
        System.out.println("1. Pagamento bollette");
        System.out.println("2. Attivazione SPID");
        System.out.println("3. Invio raccomandata");
        System.out.println("4. Ritiro pacchi");
        System.out.println("5. Apertura conto corrente");
        System.out.println("6. Altro");

        // Input dell'utente
        System.out.print("Digita il numero dell'operazione: ");
        int scelta = input.nextInt();

        // Gestione della scelta
        switch (scelta) {
            case 1:
                System.out.println("Hai scelto: Pagamento bollette.");
                System.out.println("Aspetta il tuo turno e recati allo sportello 1.");
                break;
            case 2:
                System.out.println("Hai scelto: Attivazione SPID.");
                System.out.println("Aspetta il tuo turno e recati allo sportello 2.");
                break;
            case 3:
                System.out.println("Hai scelto: Invio raccomandata.");
                System.out.println("Aspetta il tuo turno e recati allo sportello 3.");
                break;
            case 4:
                System.out.println("Hai scelto: Ritiro pacchi.");
                System.out.println("Aspetta il tuo turno e recati allo sportello 4.");
                break;
            case 5:
                System.out.println("Hai scelto: Apertura conto corrente.");
                System.out.println("Aspetta il tuo turno e recati allo sportello 5.");
                break;
            case 6:
                System.out.println("Hai scelto: Altro.");
                System.out.println("Aspetta il tuo turno e recati allo sportello 6.");
                break;
            default:
                System.out.println("Scelta non valida. Riprova.");
                break;
        }

        // Chiudi lo scanner
        input.close();
    }
}