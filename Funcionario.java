public class Funcionario {

    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario() { }

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf  = cpf;
        this.salarioBase = salarioBase;
    }

    public double getSalarioFinal() {
        return salarioBase;
    }

    // overloads
    public void aumentarSalario() {
        this.salarioBase *= 1.10;
    }

    public void aumentarSalario(double porcentagem) {
        this.salarioBase *= (1 + (porcentagem / 100.0));
    }

    public void aumentarSalario(double porcentagem, double bonusExtra) {
        this.salarioBase = this.salarioBase * (1 + (porcentagem / 100.0)) + bonusExtra;
    }

    // getters/setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
}
