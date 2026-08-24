public class Principal {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Corolla", 2018);
        Veiculo v2 = new Veiculo("Onix", 2016);

        Carro c1 = new Carro("Camaro", 2018, 2);

        System.out.println(v1.imprimirDetalhes());
        System.out.println(v2.imprimirDetalhes());
    }
}
