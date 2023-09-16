public class ExemploForArray {
    public static void main(String[] args) {

        // Em arrays o indice de elementos inicia em ZERO
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
        /**
         * for (int numeroDoAluno=0; numeroDoAluno < alunos.length; numeroDoAluno++ ){
         * 
         * System.out.println("O aluno com numero = " + numeroDoAluno + " é " +
         * alunos[numeroDoAluno]);
         * }
         */

        for (String aluno : alunos) {
            System.out.println("Nome do Aluno é: " + aluno);
        }

    }
}
