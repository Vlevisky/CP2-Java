public class Diretor extends Gerente {

    private double porcentagemParticipacaoLucros;  // 0.12 -> 12%

    public Diretor(
        String nome,
        String cpf,
        double salarioBase,
        double bonus,
        double porcentagemParticipacaoLucros
    ) {
        super(nome, cpf, salarioBase, bonus);
        this.porcentagemParticipacaoLucros = porcentagemParticipacaoLucros;
    }

    @Override
    public double getSalarioFinal() {
        double base = getSalarioBase();
        return base + getBonus() + base * porcentagemParticipacaoLucros;
    }

    public double getPorcentagemParticipacaoLucros() { return porcentagemParticipacaoLucros; }
    public void setPorcentagemParticipacaoLucros(double v) { this.porcentagemParticipacaoLucros = v; }
}
