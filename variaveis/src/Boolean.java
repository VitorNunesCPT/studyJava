public class Boolean {
    //sout + enter (print)
    public static void main (String[] args){
        boolean resultado = false;
        System.out.println(resultado);

        // Algoritmo para ir a praia
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        // && AND / || OR
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);

        // operador ternario " ? "SE" : "Senão " " <- IF
        String mensagem =  fimDeSemana ? "É Fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
    }
}
