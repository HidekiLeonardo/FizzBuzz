### README.md

# FizzBuzz Optimizado em Java

Este projeto implementa o clássico exercício FizzBuzz com algumas melhorias. Ele substitui números múltiplos de 3 por `"Fizz"`, múltiplos de 5 por `"Buzz"`, e múltiplos de ambos 3 e 5 por `"FizzBuzz"`. O programa também conta o total de múltiplos de cada tipo, exibindo esses valores ao final.

## Como Funciona

1. **Input do Usuário**: O programa solicita ao usuário que insira um número até o qual o contador irá.
2. **Loop Principal**: Para cada número de 1 até o valor especificado:
   - Se o número for múltiplo de 3 e 5, imprime `"FizzBuzz"`.
   - Se for múltiplo de 3, imprime `"Fizz"`.
   - Se for múltiplo de 5, imprime `"Buzz"`.
   - Caso contrário, exibe o próprio número.
3. **Contagem de Múltiplos**: O programa conta quantas vezes múltiplos de 3, 5 e 3 e 5 (juntos) aparecem e exibe esses valores no final.

## Exemplo de Saída

Se o usuário insere o número 15, a saída será:

```
====================== Exercício FizzBuzz ======================
Substitui números múltiplos de 3 por "Fizz"
Substitui números múltiplos de 5 por "Buzz"
Para números múltiplos de ambos, 3 e 5, imprima "FizzBuzz"

Digite o até qual número nosso contador vai: 15

================================================================
1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 
Acabou o contador...

Multiplos de 3: 5
Multiplos de 5: 3
Multiplos de 3 e 5: 1
```

## Tecnologias Utilizadas

- Linguagem: Java
- IDE sugerida: IntelliJ IDEA, Eclipse ou qualquer editor Java de sua preferência.

## Como Executar

1. Clone o repositório ou faça o download dos arquivos.
2. Abra o projeto em sua IDE Java.
3. Compile e execute `Main.java`.
