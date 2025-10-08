# Java - Dia 01: Fundamentos Básicos

Hoje aprendi os primeiros conceitos de Java, começando pela estrutura base de um programa, que sempre contém uma classe pública e o método `main`, onde o código realmente começa a ser executado. Usei o `System.out.println` para exibir mensagens no terminal, como o clássico “Hello World”.

Depois conheci o `Scanner`, que serve para capturar informações digitadas pelo usuário. Entendi que posso usar métodos como `nextInt()` para números inteiros e `nextLine()` para textos, e que é importante fechar o Scanner com `.close()` no final para evitar avisos de memória.

Também aprendi sobre condicionais (`if`, `else if`, `else`), que permitem tomar decisões diferentes dependendo das condições. Isso me ajuda a fazer o programa reagir ao que o usuário digita, por exemplo, verificando se alguém é maior de idade ou se um número é positivo, negativo ou zero.

Em seguida, vi os operadores aritméticos, usados para fazer contas simples: soma, subtração, multiplicação, divisão e resto. Descobri que, se quiser mostrar números decimais corretamente, preciso usar o tipo `double` e converter pelo menos um dos valores antes da divisão.  

Aprendi ainda sobre os operadores bitwise, que trabalham diretamente com os bits (0 e 1) de um número, fazendo operações como AND (`&`), OR (`|`), XOR (`^`), NOT (`~`), e os deslocamentos de bits (`<<` e `>>`). Esses operadores são mais usados em situações mais técnicas e de baixo nível, mas é bom entender como funcionam.  

Por fim, entendi a diferença entre `&&` e `&`: ambos podem comparar condições, mas o `&&` é o operador lógico que usa “curto-circuito” — ele nem avalia a segunda condição se a primeira já for falsa. O `&`, por outro lado, sempre avalia os dois lados, e também pode ser usado nas operações bitwise.

No geral, aprendi como o Java pensa e executa instruções passo a passo, e como as variáveis, operadores e condições se combinam para formar a lógica básica de qualquer programa.


