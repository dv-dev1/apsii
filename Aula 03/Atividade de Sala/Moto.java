public class Moto extends Veiculo {
    public int numCilindradas;

    public Moto(String modelo, int numCilindradas) {
        super(modelo, numCilindradas);
        this.numCilindradas = numCilindradas;
    }

    @Override
    public String imprimirDetalhes() {
        return super.imprimirDetalhes() + "\nNumero de cilindradas: " + this.numCilindradas;
    }
}
