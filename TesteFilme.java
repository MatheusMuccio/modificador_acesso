public class TesteFilme {

    public static void main(String[] args) {
        Filme f = new Filme();
        f.setCodigo(1);
        f.setNome("A era do Gelo");
        f.setValor(2.00);
        f.setDisponivel(true);

        f.exibir();

        f.setCodigo(2);
        f.setNome("Matrix");
        f.setValor(2.00);
        f.setDisponivel(false);

        f.exibir();
    }
    
}
