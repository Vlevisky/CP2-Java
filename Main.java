public class Main {
    public static void main(String[] args) {

        Funcionario f = new Funcionario("Amareu", "111.111.111-11", 3000);

        Gerente g = new Gerente("Bruno Sapecão", "222.222.222-22", 5000, 800);

        Diretor d = new Diretor("Carlinha", "333.333.333-33", 9000, 1500, 0.10);

        
        f.aumentarSalario(7.5, 200);   // 7.5% + 200

        Departamento dep = new Departamento(5);
        dep.adicionar(f);
        dep.adicionar(g);
        dep.adicionar(d);

        System.out.printf("Amareu (func.): R$ %.2f%n",  f.getSalarioFinal());
        System.out.printf("Bruno Sapecão (ger.): R$ %.2f%n", g.getSalarioFinal());
        System.out.printf("Carlinha (dir.): R$ %.2f%n", d.getSalarioFinal());

        System.out.printf("%nFolha total: R$ %.2f%n", dep.folhaPagamentoTotal());
    }
}
