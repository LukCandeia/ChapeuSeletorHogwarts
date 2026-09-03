# ⚡ Chapéu Seletor de Hogwarts

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Status-Conclu%C3%ADdo-success?style=for-the-badge" alt="Status">
  <img src="https://img.shields.io/badge/Licen%C3%A7a-MIT-blue.svg?style=for-the-badge" alt="License">
</p>

> *"Hmm... Uma mente nova. Seja bem-vindo(a) a Hogwarts!"*

Um sistema interativo desenvolvido em **Java** para o terminal que simula a icônica cerimônia do Chapéu Seletor. A aplicação interage com o usuário, coleta dados pessoais e pontuações de atributos de personalidade para calcular e revelar matematicamente a casa de Hogwarts ideal.

---

## 🧙‍♂️ Arquitetura do Projeto

O sistema é dividido em duas classes principais baseadas nos princípios de Programação Orientada a Objetos (POO):

1. **`Aluno`**: Modela o estudante de magia, gerenciando seus dados pessoais, atributos de personalidade e contendo a lógica matemática de ponderação para a escolha da casa.
2. **`SeletorHogwarts`**: Controla o fluxo de execução principal, gerenciando a interação via terminal (`Scanner`), pausas dramáticas para imersão (`TimeUnit`) e exibição dos resultados.

---

## 🧮 Lógica de Seleção de Casas

O método `calcularCasa()` avalia os atributos do aluno utilizando fórmulas ponderadas específicas. A casa que obtiver a **maior pontuação** é escolhida pelo Chapéu Seletor:

* 🦁 **Grifinória:** $\\text{Pontuação} = (2 \\times \\text{coragem}) + \\text{lealdade}$
* 🐍 **Sonserina:** $\\text{Pontuação} = (2 \\times \\text{ambicao}) + \\text{estrategia}$
* 🦅 **Corvinal:** $\\text{Pontuação} = (2 \\times \\text{inteligencia}) + \\text{criatividade}$
* 🦡 **Lufa-Lufa:** $\\text{Pontuação} = \\frac{(2 \\times \\text{lealdade}) + \\text{coragem}}{3}$

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
* Ter o **Java Development Kit (JDK)** instalado em sua máquina.

### Passo a Passo

1. Clone este repositório ou baixe os arquivos fonte (`Aluno.java` e `SeletorHogwarts.java`) na mesma pasta.
2. Abra o terminal (ou a aba de terminal no VS Code) no diretório dos arquivos.
3. Compile as classes executando:
   ```bash
   javac Aluno.java SeletorHogwarts.java
Execute o programa:

Bash
java SeletorHogwarts
💻 Demonstração no Terminal
Plaintext
Hmm... Uma mente nova. Seja bem-vindo(a) a Hogwarts!
Relaxe e deixe-me dar uma boa olhada em seu coração.
Antes de cruzar as grandes portas do Salão Principal,
o Chapéu Seletor precisa desvendar a essência da sua alma.
...

Qual o seu nome, jovem bruxo(a)?
Harry Potter

Qual a sua idade?
11

Qual o seu nível de coragem? (0 até 100)
95
...
Hmm... Difícil. Muito difícil...

Calculando as afinidades mágicas...
Pesando as virtudes no fundo da sua mente...

⚡ O Chapéu Seletor grita: GRIFINÓRIA! ⚡
🛠️ Tecnologias Utilizadas
Java (Conceitos de POO, Encapsulamento, Arrays e Manipulação de Objetos)

java.util.Scanner (Captura de entradas de dados do usuário)

java.util.concurrent.TimeUnit (Criação de delays para dar ritmo e imersão ao terminal)