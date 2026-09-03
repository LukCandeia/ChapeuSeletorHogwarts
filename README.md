complete_readme = """# ⚡ Chapéu Seletor de Hogwarts - Sistema Interativo em Java

Um sistema interativo desenvolvido em **Java** para o terminal que simula a icônica cerimônia do Chapéu Seletor de Hogwarts. A aplicação interage com o usuário, coleta dados pessoais e pontuações de traços de personalidade (como coragem, inteligência, ambição, lealdade, criatividade e estratégia) para calcular e revelar matematicamente a casa ideal do bruxo.

---

## 🧙‍♂️ Estrutura do Projeto

O projeto é composto por duas classes principais:
1. **`Aluno`**: Modela o estudante de magia, armazenando seus dados pessoais, atributos e contendo a lógica de cálculo ponderado de alocação de casas.
2. **`SeletorHogwarts`**: Controla o fluxo de execução principal, gerenciando a interação via terminal (`Scanner`), atrasos dramáticos (`TimeUnit`) e exibição dos resultados.

---

## 🧮 Lógica de Seleção de Casas

O método `calcularCasa()` presente na classe `Aluno` avalia os atributos utilizando fórmulas ponderadas específicas para cada uma das quatro casas de Hogwarts. A casa que obtiver a **maior pontuação** global é escolhida:

* **Grifinória:** $\\text{Pontuação} = (2 \\times \\text{coragem}) + \\text{lealdade}$
* **Sonserina:** $\\text{Pontuação} = (2 \\times \\text{ambicao}) + \\text{estrategia}$
* **Corvinal:** $\\text{Pontuação} = (2 \\times \\text{inteligencia}) + \\text{criatividade}$
* **Lufa-Lufa:** $\\text{Pontuação} = \\frac{(2 \\times \\text{lealdade}) + \\text{coragem}}{3}$

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
* Ter o **Java Development Kit (JDK)** instalado em sua máquina.

### Passo a Passo

1. Crie um arquivo chamado **`Aluno.java`** e cole o código da classe correspondente.
2. Crie um arquivo chamado **`SeletorHogwarts.java`** e cole o código principal da aplicação.
3. Abra o terminal (ou o VS Code) na pasta onde os arquivos estão salvos e compile-os:
   ```bash
   javac Aluno.java SeletorHogwarts.java