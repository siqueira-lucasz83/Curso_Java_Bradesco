# Aula POO – Introdução ao BDD (Behavior-Driven Development) 
## O que é BDD? 
### **BDD (Behavior-Driven Development)** significa **Desenvolvimento Orientado a Comportamento**.
---
### É uma forma de desenvolver e testar software focando **no comportamento esperado do sistema**, e não apenas no código. Em vez de pensar “qual método eu preciso criar?”, o foco é “como o sistema deve se comportar?”. 
--- 
###  Ideia principal O BDD une **requisitos**, **testes** e **documentação** em um mesmo formato que todos entendem: clientes, analistas, testadores e desenvolvedores. Ele usa uma linguagem chamada **Gherkin**, que é simples e estruturada. 
--- 
### Estrutura do Gherkin Os testes de comportamento são escritos em **cenários** que seguem o formato: Feature: Nome da funcionalidade Scenario: Descrição do cenário Given (Dado) algum contexto inicial When (Quando) ocorre uma ação Then (Então) espero um resultado 
--- 
###  Exemplo prático Feature: Login no sistema Scenario: Login com sucesso Given o usuário está na tela de login When ele digita usuário "lucas" e senha "1234" Then o sistema exibe "Login realizado com sucesso" 
---
###  Ligando o Gherkin ao código Java Para transformar esse texto em um **teste automatizado**, usamos o **Cucumber**, uma biblioteca Java para BDD.
###  Exemplo de código Java (steps)

```java
import io.cucumber.java.pt.*;

public class LoginSteps {

    @Dado("o usuário está na tela de login")
    public void usuarioEstaNaTelaDeLogin() {
        System.out.println("Usuário abriu a tela de login");
    }

    @Quando("ele digita usuário {string} e senha {string}")
    public void eleDigitaUsuarioESenha(String usuario, String senha) {
        System.out.println("Digitou: " + usuario + " / " + senha);
    }

    @Então("o sistema exibe {string}")
    public void oSistemaExibe(String mensagem) {
        System.out.println("Mensagem: " + mensagem);
    }
}
```
### 🧩 Estrutura básica de um projeto BDD em Java
```bash
meu-projeto/
├── src/
│ ├── main/java/ # Código principal
│ └── test/java/ # Testes e steps
│ └── steps/
│ └── LoginSteps.java
│
├── src/test/resources/
│ └── features/
│ └── login.feature
│
└── pom.xml # Configuração do Maven
```
---
### ⚙️ Dependências (exemplo para Maven)

Adicione as dependências abaixo dentro da tag `<project>` do seu `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.15.0</version>
        <scope>test</scope>
    </dependency>

    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>7.15.0</version>
        <scope>test</scope>
    </dependency>

    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
>
```
--- 
### 🧠 Comparação rápida vs TDD - **TDD (Test-Driven Development)**: escreve-se testes unitários primeiro; foco em métodos e classes. - **BDD (Behavior-Driven Development)**: escreve-se cenários de comportamento em linguagem natural; foco no comportamento do sistema do ponto de vista do usuário/negócio. Linguagem usada no BDD: **Gherkin**. Framework popular em Java: **Cucumber**. Estrutura típica: **Given / When / Then**. 
---
### 🚀 Vantagens do BDD - Facilita a comunicação entre equipe técnica e negócio. - Garante que o sistema atenda aos comportamentos esperados. - Testes são mais legíveis e também servem como documentação. - Reduz ambiguidades nos requisitos. - Permite automatizar cenários de aceitação (UI, API, integração). 
---
### 🏁 Conclusão O **BDD** não é só sobre testes — é sobre **clareza e colaboração**. Ele ajuda a desenvolver sistemas que realmente fazem o que o usuário precisa, com testes automáticos que descrevem o comportamento real. > 💬 *“BDD é a ponte entre o que o cliente quer e o que o código faz.”*
---
#### Por Lucas Siqueira.
