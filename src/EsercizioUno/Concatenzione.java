package EsercizioUno;

public class Concatenzione {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


        System.out.println(concatena("bla", 6));
    }
    public static String concatena(String str, int num) {
        return str + num;
    }

}
