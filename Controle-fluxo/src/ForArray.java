public class ForArray {
    public static void main(String[] args) {
        String alunos []={"Gabriel","Lucas","Bryan" };
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " +alunos[x]);
        }
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
            
        }
    }
    
}
