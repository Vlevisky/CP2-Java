public class Departamento {

    private final Funcionario[] funcionarios;
    private int qtd;  // ocupações

    public Departamento(int capacidade) {
        this.funcionarios = new Funcionario[capacidade];
        this.qtd = 0;
    }

    public boolean adicionar(Funcionario f) {
        if (qtd >= funcionarios.length || f == null) return false;

        funcionarios[qtd++] = f;
        return true;
    }

    public double folhaPagamentoTotal() {
        double total = 0.0;

        for (int i = 0; i < qtd; i++) {
            total += funcionarios[i].getSalarioFinal();
        }
        return total;
    }

    public int capacidade() { return funcionarios.length; }
    public int tamanho()    { return qtd; }
}
