import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {
    private List<Pessoa> pessoas;

    public CadastroPessoas() {
        pessoas = new ArrayList<>();
    }

    // Método para adicionar pessoa
    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    // Método para listar todas as pessoas
    public List<Pessoa> listarPessoas() {
        return pessoas;
    }

    // Método para alterar uma pessoa
    public void alterarPessoa(String nome, Pessoa novaPessoa) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().equals(nome)) {
                pessoas.set(i, novaPessoa);
                return;
            }
        }
    }

    // Método para excluir uma pessoa
    public void excluirPessoa(String nome) {
        pessoas.removeIf(p -> p.getNome().equals(nome));
    }
}
