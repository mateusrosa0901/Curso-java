<div align="center">

# ☕ Estudos de Java

**Aulas e exercícios do curso de Java do Prof. Nelio Alves (Udemy): da lógica de programação à orientação a objetos.**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white)

</div>

---

## 🗺️ Trilha

### 1. Lógica de programação — [`logicaProgramacao/`](src/curso/logicaProgramacao)

| Assunto | Conteúdo |
|:--|:--|
| [Estrutura sequencial](src/curso/logicaProgramacao/estruturaSequencial) | Saída e entrada de dados com `Scanner`, funções da classe `Math` e 7 exercícios |
| [Estrutura condicional](src/curso/logicaProgramacao/estruturaCondicional) | `if/else`, `switch/case` e 2 exercícios |
| [Estrutura repetitiva](src/curso/logicaProgramacao/estruturaRepetitiva) | `while`, `for` e uso do debugger |

### 2. Orientação a objetos — [`poo/`](src/curso/poo)

| Projeto | O que faz | Conceitos |
|:--|:--|:--|
| [`triangleAplication`](src/curso/poo/triangleAplication) | Compara a área de dois triângulos | primeira classe, métodos |
| [`estoqueApp`](src/curso/poo/estoqueApp) | Controla entrada e saída de produtos e o valor em estoque | construtores, `toString` |
| [`encapsulamento/getSet`](src/curso/poo/encapsulamento/getSet) | Mesmo produto, agora com atributos privados | encapsulamento, getters e setters |
| [`membrosEstaticos`](src/curso/poo/membrosEstaticos) | Calculadora em três versões e um conversor de dólar com IOF | membros `static`, constantes, classes utilitárias |
| [`exercicios/ex01`](src/curso/poo/exercicios/ex01) | Área, perímetro e diagonal de um retângulo | classes e métodos |
| [`exercicios/ex02`](src/curso/poo/exercicios/ex02) | Funcionário com salário líquido e aumento percentual | classes e métodos |
| [`exercicios/ex03`](src/curso/poo/exercicios/ex03) | Boletim com notas por trimestre e situação do aluno | regras de negócio na classe |
| [`exercicios/contaBancaria`](src/curso/poo/exercicios/contaBancaria) | Conta com depósito e saque (com taxa) | encapsulamento, sobrecarga de construtores |

Os projetos de POO seguem a mesma organização: as classes de domínio ficam em `entities/` (ou `utils/`) e o programa principal em `aplication/`.

## ▶️ Como rodar

O projeto foi criado no **IntelliJ IDEA**. Para abrir:

1. Clone o repositório:
   ```bash
   git clone https://github.com/mateusrosa0901/Curso-java.git
   ```
2. No IntelliJ, use **File → Open** e escolha a pasta do projeto.
3. Abra qualquer classe com método `main` (os arquivos `Program.java` ou `Main.java`) e clique em **Run**.

## 🔗 Créditos

- Curso: **Java COMPLETO — Programação Orientada a Objetos + Projetos**, do Prof. Nelio Alves, na Udemy
- Mais projetos meus: [github.com/mateusrosa0901](https://github.com/mateusrosa0901)
