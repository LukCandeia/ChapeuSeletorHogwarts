import java.util.*;
import java.util.concurrent.TimeUnit;

public class SeletorHogwarts {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hmm... Uma mente nova. Seja bem-vindo(a) a Hogwarts!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Relaxe e deixe-me dar uma boa olhada em seu coração.\n Antes de cruzar as grandes portas do Salão Principal,\n o Chapéu Seletor precisa desvendar a essência da sua alma.");
        System.out.println("...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Suas escolhas definirão o seu destino nesta jornada mágica pelo terminal.\nPrepare-se, responda com sinceridade e descubra qual é a sua verdadeira casa!");
        TimeUnit.SECONDS.sleep(2);

        Aluno bruxo1 = new Aluno(null, 0, 0, 0, 0, 0, 0, 0, null);

        System.out.println("\nQual seu nome, aluno?");
        bruxo1.setNome(sc.nextLine());
        System.out.println("\nQual a sua idade?");
        bruxo1.setIdade(sc.nextInt());
        System.out.println("Interessante " + bruxo1.getNome() + ", agora preciso que você responda com sinceridade...");
        System.out.println("\nQual o seu nível de coragem? (0 até 100)");
        bruxo1.setCoragem(sc.nextDouble());
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nQual o seu nível de inteligência? (0 até 100)");
        bruxo1.setInteligencia(sc.nextDouble());
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nQual o seu nível de ambição? (0 até 100)");
        bruxo1.setAmbicao(sc.nextDouble());
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nQual o seu nível de lealdade? (0 até 100)");
        bruxo1.setLealdade(sc.nextDouble());
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nQual o seu nível de criatividade? (0 até 100)");
        bruxo1.setCriatividade(sc.nextDouble());
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nQual o seu nível de estratégia? (0 até 100)");
        bruxo1.setEstrategia(sc.nextDouble());
        TimeUnit.SECONDS.sleep(1);
        
        System.out.println("\nInteressante... Só para confirmar as informações: \n");
        TimeUnit.SECONDS.sleep(2);
        bruxo1.exibirInformacoes();
        
        bruxo1.calcularCasa();
        System.out.println("Hmm... Difícil. Muito difícil...\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Calculando as afinidades mágicas...\n" + "Pesando as virtudes no fundo da sua mente...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\"Ah, mas vejo um potencial extraordinário aqui... Onde será que você vai brilhar mais?\"");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(bruxo1.getCasa());

    }
}
