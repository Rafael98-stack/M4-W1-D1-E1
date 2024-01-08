package EsercizioUno;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] arr = inserimentoInArray(new String[]{"A", "B", "C", "D", "E"}, "aaaaa");

        System.out.println(Arrays.toString(arr));
    }

    public static String[] inserimentoInArray(String[] stringArray, String str) {
        String[] array = new String[6];
        for (int i = 0; i < stringArray.length +1 ; i++) {
            if(i < 2) {
                array[i] = stringArray[i];
            } else if(i == 2) {
                array[i] = str;
            } else {
                array[i] = stringArray[i - 1];
            }
        }

        return array;
    }
}
