public class App {
    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();

        // Adicionar algumas pessoas
        cadastro.adicionarPessoa(new Pessoa("Alice", 30));
        cadastro.adicionarPessoa(new Pessoa("Bob", 25));

        // Listar todas as pessoas
        System.out.println("Lista de pessoas:");
        for (Pessoa p : cadastro.listarPessoas()) {
            System.out.println(p);
        }

        // Alterar uma pessoa
        cadastro.alterarPessoa("Alice", new Pessoa("Alice", 31));

        // Excluir uma pessoa
        cadastro.excluirPessoa("Bob");

        // Listar todas as pessoas após alterações
        System.out.println("Lista de pessoas após alterações:");
        for (Pessoa p : cadastro.listarPessoas()) {
            System.out.println(p);
        }
    }
}
