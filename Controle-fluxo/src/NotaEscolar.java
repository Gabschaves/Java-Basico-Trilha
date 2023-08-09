public class NotaEscolar {
    public static void main(String[] args) throws Exception {
        int nota=10;
        String resultado = nota>=7 ? "aprovado" : nota>=5 && nota<7 ? "recuperação" : "reprovado" ;
        System.out.println(resultado);
           
    }

}
