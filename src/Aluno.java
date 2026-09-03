public class Aluno {
    private String nome;
    private int idade;
    private double coragem;
    private double inteligencia;
    private double ambicao;
    private double lealdade;
    private double criatividade;
    private double estrategia;
    private String[] casaspossiveis;
    private double[] pontuacoes;
    private String casa;

    public Aluno(String nome, int idade, double coragem, double inteligencia, double ambicao, double lealdade,
            double criatividade,
            double estrategia, String casa) {
        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.criatividade = criatividade;
        this.estrategia = estrategia;
        this.casa = casa;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("Coragem: " + this.coragem);
        System.out.println("Inteligência: " + this.inteligencia);
        System.out.println("Ambição: " + this.ambicao);
        System.out.println("Lealdade: " + this.lealdade);
        System.out.println("Criatividade: " + this.criatividade);
        System.out.println("Estratégia: " + this.estrategia);
    }

    // • Grifin´oria: (2 ∗ coragem) + lealdade
    // • Sonserina: (2 ∗ ambicao) + estrategia
    // • Corvinal: (2 ∗ inteligencia) + criatividade
    // • Lufa-Lufa: ((2 ∗ leadade) + (coragem))/3
    public String calcularCasa() {
        casaspossiveis = new String[] { "Grifnoria", "Sonserina", "Corvinal", "Lufa-Lufa" };
        pontuacoes = new double[] { ((2 * this.coragem) + this.lealdade), ((2 * this.ambicao) + this.estrategia),
                ((2 * inteligencia) + this.criatividade), (((2 * this.lealdade) + this.coragem) / 3) };
        int maiorindice = 0;
        for (int i = 0; i < pontuacoes.length; i++) {
            if (pontuacoes[i] > pontuacoes[maiorindice]) {
                maiorindice = i;
            }
        }
        this.casa = casaspossiveis[maiorindice];
        return this.casa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getCoragem() {
        return coragem;
    }

    public void setCoragem(double coragem) {
        this.coragem = coragem;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public double getAmbicao() {
        return ambicao;
    }

    public void setAmbicao(double ambicao) {
        this.ambicao = ambicao;
    }

    public double getLealdade() {
        return lealdade;
    }

    public void setLealdade(double lealdade) {
        this.lealdade = lealdade;
    }

    public double getCriatividade() {
        return criatividade;
    }

    public void setCriatividade(double criatividade) {
        this.criatividade = criatividade;
    }

    public double getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(double estrategia) {
        this.estrategia = estrategia;
    }

    public String[] getCasaspossiveis() {
        return casaspossiveis;
    }

    public void setCasaspossiveis(String[] casaspossiveis) {
        this.casaspossiveis = casaspossiveis;
    }

    public double[] getPontuacoes() {
        return pontuacoes;
    }

    public void setPontuacoes(double[] pontuacoes) {
        this.pontuacoes = pontuacoes;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }
}