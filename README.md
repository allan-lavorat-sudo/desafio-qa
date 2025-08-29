## 📘 Projeto: Desafio QA — Automação com Cucumber, Selenium e TestNG

Este projeto foi desenvolvido como parte de um desafio de automação de testes utilizando **Java**, **Cucumber**, **Selenium WebDriver** e **TestNG**. O objetivo é validar funcionalidades da aplicação [DEMOQA](https://demoqa.com) por meio de cenários escritos em BDD (Behavior Driven Development).

---

## 🧰 Tecnologias utilizadas

- **Java 11+**
- **Maven**
- **Selenium WebDriver**
- **Cucumber (Gherkin)**
- **TestNG**
- **WebDriverManager**
- **Eclipse IDE**

---

## 📂 Estrutura do projeto

```
src/
├── main/
│   └── java/
│       └── (não utilizado neste projeto)
├── test/
│   └── java/
│       ├── bdd1/                  # Arquivos .feature escritos em Gherkin
│       ├── bdd.steps/            # Step definitions (mapeamento dos passos)
│       ├── bdd.runners/          # Hooks e Runner (configuração do Cucumber)
│       └── ui/                   # Classe de execução direta dos testes
└── resources/
    └── (opcional para features, se reorganizado)
```

---

## 🧪 Como executar os testes

Para rodar os testes automatizados:

1. Certifique-se de que as dependências Maven estão atualizadas (`mvn clean install` ou `Update Project` no Eclipse).
2. Execute a classe `HomePageTest.java` localizada em:

```
src/test/java/ui/HomePageTest.java
```

> Essa classe é responsável por iniciar os testes diretamente, sem depender do runner do Cucumber.

---

## 📝 Cenários BDD

Os cenários foram escritos em linguagem Gherkin e estão localizados em:

```
src/test/java/bdd1/home_page.feature
```

Exemplo de cenário:

```gherkin
Feature: Validação da página inicial

  Scenario: Verificar o título da página
    Given que o usuário acessa o site
    Then o título da página deve ser "DEMOQA"
```

---

## 📌 Observações

- O runner `RunCucumberTest.java` está configurado para execução via TestNG, mas **não é necessário** para rodar os testes atuais.
- Os relatórios de execução são gerados automaticamente na pasta `target/` e `test-output/`.

Se quiser, posso te ajudar a traduzir isso pro inglês, formatar com badges, ou incluir instruções de CI/CD. Mas esse README já tá pronto pra subir com o projeto. Só copiar e colar no `README.md`.
