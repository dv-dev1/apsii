# Padrão Abstract Factory (Pizzarias)

Trabalho da cadeira de **Análise e Projeto de Sistemas 2**, do professor **Raul Brito**.

Exercícios das páginas 129 a 134 do livro *Use a Cabeça! Padrões de Projetos* (2ª edição, Eric Freeman e Elisabeth Freeman), capítulo do padrão Factory.

## O que tem aqui

- **Aponte seu lápis (p. 131):** `ChicagoPizzaIngredientFactory`, com massa grossa, molho de tomate, mussarela, vegetais (azeitonas pretas, espinafre e berinjela), calabresa fatiada e mariscos congelados.
- `PizzaIngredientFactory` e `NYPizzaIngredientFactory` (p. 130-131), mais as classes de ingredientes.
- `Pizza`, `CheesePizza`, `ClamPizza` (p. 132-133), mais `VeggiePizza` e `PepperoniPizza`, que o livro cita mas não mostra.
- `NYStylePizzaStore` (p. 134), mais `ChicagoStylePizzaStore` e `PizzaStore`.
- `Main`: pede pizzas nas duas lojas e imprime os ingredientes de cada uma.

## Como rodar

Precisa do JDK instalado.

```sh
javac -d out *.java
java -cp out Main
```

## Poder da Mente (p. 134)

No Factory Method, cada loja tinha uma classe de pizza para cada estilo (`NYCheesePizza`, `ChicagoCheesePizza`). Agora a loja só escolhe a fábrica de ingredientes e passa para a pizza. A mesma `CheesePizza` serve para qualquer região, e quem muda os ingredientes é a fábrica.
