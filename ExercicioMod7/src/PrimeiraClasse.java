public class PrimeiraClasse {

    public static void main(String[] args) {

        //  Peguei um Objeto da vida real, que seria o carro.



   /* Adicionei alguns metodos, como: Marca, modelo e o codigo do veiculo

    */

    Carro carro = new Carro();

    carro.setMarca("Honda");

    carro.setNome("Civic");

    carro.setCodigo(300);

        System.out.println("Olá, Marcos");
        System.out.println("O código do veículo é " + carro.getCodigo());
        System.out.println("Seu carro é da marca " + carro.getMarca());
        System.out.println("O modelo é o " + carro.getNome());

    }
}
