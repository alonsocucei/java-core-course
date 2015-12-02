package modulo3;
public class SecuenciasDeEscape {

    public static void main(String[] args) {
        System.out.println("Backspace      : " + "ABCDE\bFGHIJ");
        System.out.println("Formfeed       : " + "ABCDE\fFGHIJ");
        System.out.println("Linefeed       : " + "ABCDE\nFGHIJ");
        System.out.println("Single Quote   : " + "ABCDE\'FGHIJ");
        System.out.println("Double Quote   : " + "ABCDE\"FGHIJ");
        System.out.println("Backslash      : " + "ABCDE\\FGHIJ");
        System.out.println("Horizontal Tab : " + "ABCDE\tFGHIJ");
        System.out.println("Carriage Return: " + "ABCDE\rFGHIJ");
    }
}
