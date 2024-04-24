public class PrimeiraClasse {

    public static void main(String[] args) {

        //  Peguei um Objeto da vida real, que seria o carro.



   /* Adicionei alguns metodos, como: Marca, modelo e o codigo do veiculo

    */

        String nome = "Lucilene";

        Carro carro = new Carro();

        carro.setMarca("Fiat");

        carro.setNome("Uno");

        carro.setCodigo(400);

        System.out.println("Olá, " + nome);
        System.out.println("O código do veículo é " + carro.getCodigo());
        System.out.println("Seu carro é da marca " + carro.getMarca());
        System.out.println("O modelo é o " + carro.getNome());

    }
}
