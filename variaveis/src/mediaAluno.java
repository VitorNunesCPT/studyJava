public class mediaAluno {
    //testar um ou outro coloca em comentario
        public static void main ( String[] args ){
            int nota = 70;

            if (nota >= 80){
                System.out.println("A");
            } else if ( nota < 80  && nota >= 70) {
                System.out.println("B");
            } else if (nota <70 && nota >= 60) {
                System.out.println("C");
            } else if (nota < 60 && nota >= 50) {
                System.out.println("D");
            } else {
                System.out.println("Invalido");
            }
        }
}

