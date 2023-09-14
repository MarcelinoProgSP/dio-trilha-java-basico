public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        /** CINDIÇÃO TERNARIA*/
          String resultado = sigla == "M" ? "MEDIO" : sigla == "P" ? "PEQUENO" : sigla == "G" ? "GRANDE" : "INDEFINIDO";
          System.out.println(resultado);
         

        /**
         * CONDIÇÃO ENCADEADA
         * if(sigla == "P")
         * System.out.println("PEQUENO");
         * else if(sigla == "M")
         * System.out.println("MEDIO");
         * else if(sigla == "G")
         * System.out.println("GRANDE");
         * else
         * System.out.println("INDEFINIDO");
         */

        /** SWITCH CASE
         * switch (sigla) {
         * case "P": {
         * System.out.println("PEQUENO");
         * break;
         * }
         * case "M": {
         * System.out.println("MEDIO");
         * break;
         * }
         * case "G": {
         * System.out.println("GRANDE");
         * break;
         * }
         * default:
         * System.out.println("INDEFINIDO");
         * }
         */
    }
}
