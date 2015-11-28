
public class DiasSemana {
    enum Dias {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
    
    public static void main(String[] args) {
        imprimeDiaSemana(Dias.MIERCOLES);
        imprimeDiaSemana(Dias.DOMINGO);
        imprimeDiaSemana(Dias.LUNES);
        imprimeDiaSemana(Dias.MARTES);
    }
    private static void imprimeDiaSemana(Dias dia) {        
        switch(dia) {
            case LUNES:
                System.out.println("LUNES");
                break;
            case MARTES:
                System.out.println("MARTES");
                break;
            case MIERCOLES:
                System.out.println("MIERCOLES");
                break;
            case JUEVES:
                System.out.println("JUEVES");
                break;
            case VIERNES:
                System.out.println("VIERNES");
                break;
            case SABADO:
                System.out.println("SABADO");
                break;
            case DOMINGO:
                System.out.println("DOMINGO");
                break;
        }
    }
}
