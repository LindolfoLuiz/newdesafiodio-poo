public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Lindolfo", 23);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        pessoa.setNome("Roberto");
        pessoa.setIdade(30);

        System.out.println("\nNome atualizado: " + pessoa.getNome());
        System.out.println("Idade atualizada: " + pessoa.getIdade());
    }
}