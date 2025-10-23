# Guia Básico de QA e Desenvolvimento de Software

Este é um material introdutório para quem está começando em **Quality Assurance (QA)** e desenvolvimento de software. Aqui você encontra conceitos, termos importantes e uma visão geral do ciclo de desenvolvimento.

---

## 1. O que é QA (Quality Assurance)

**QA** é a prática de garantir que o software funcione corretamente e atenda aos requisitos.  
- Atua desde o levantamento de requisitos até os testes finais.  
- Cria cenários de teste para validar funcionalidades e prevenir falhas.  
- Teste unitário: verifica partes isoladas do código (métodos ou classes).  
- Pode envolver testes manuais e automatizados (ex.: JUnit para Java, Selenium para web).

---

## 2. Termos importantes de desenvolvimento

| Termo | Significado simples |
|-------|------------------|
| **Backend** | Parte do sistema que roda “nos bastidores” (servidor, banco de dados, lógica do sistema). |
| **Frontend** | Parte do sistema que o usuário vê e interage (páginas web, botões, formulários). |
| **UX (User Experience)** | Experiência do usuário — quão fácil e agradável é usar o sistema. |
| **UI (User Interface)** | Interface do usuário — o design visual da aplicação (botões, cores, layout). |
| **Fullstack** | Desenvolvedor que entende **tanto frontend quanto backend**. |
| **Framework** | Conjunto de ferramentas e padrões prontos para agilizar o desenvolvimento. Ex.: Spring (Java), React (JavaScript). |
| **Ciclo de desenvolvimento** | Fases de criação do software: levantamento de requisitos → desenvolvimento → testes → implantação → manutenção. |

---

## 3. Sintaxe básica em Java para QA

- Declaração de variáveis:  
```java
int numero = 5;
String nome = "Lucas";
boolean status = true; // apenas true ou false
double valor = 3.14;
```
--- 

## 3.1 Método simples

```java
public static int somar(int a, int b) {
    return a + b;
}
```
## 3.2 Teste unitário cm JUnit

```java
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SomaTest {

    @Test
    public void testSomar() {
        int resultado = Soma.somar(2, 3);
        assertEquals(5, resultado);
    }
}
```
---

## 4. Boas práticas de QA

- Pensar como o usuário: testar cenários normais, limites e possíveis erros.
- Automatizar testes sempre que possível para ganhar tempo e confiabilidade.
- Ler código ajuda a entender onde podem surgir falhas e criar testes melhores.
- Colaborar com a equipe: QA não é apenas “achar erros”, é prevenir problemas.

---


### Por Lucas Siqueira
