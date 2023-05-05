# Parameterized-Tests
Exercícios do módulo 'Testes Automatizados I' do Curso Santander Coders 2022

## Exercício 1:
- 1 - Crie um método para verificar se a pessoa pode votar, o método deve retornar uma String com as seguintes situações.

"Voto obrigatório" - para eleitoras e eleitores, com idades entre 18 e 70 anos.

"Voto facultativo" - para maiores ou iguais a 16 anos e menores de 18 anos; assim como maiores de 70 anos.

"Sem direito a votar" - para o restante.

Fonte: https://www.tre-sc.jus.br/eleicoes/tire-suas-duvidas/voto-obrigatoriedade

Exemplo Entrada - 16 Saída - Voto Facultativo 

- 2 - Utilize o Junit com @ParameterizedTest e @ValueSource para testar as diferentes entradas e saídas do método.

## Exercício 2:
- Utilizando o mesmo enunciado utilize a anotação @Parameterized @CsvSource para construir os testes.

## Exercício 3:
- Utilizando o mesmo enunciado utilize a anotação @ParameterizedTest @CsvFileSource para construir os testes.

## Exercício 4:
- Utilizando o mesmo enunciado utilize a anotação @ParameterizedTest @MethodSource para construir os testes.

## Exercício 5:
- Ainda utilizando o enunciado da questão anterior, o que aconteceria com o sistema, caso fosse passada uma idade com valor negativo? E com uma idade muito além da condição humana? Teste esses casos e utilize o assertThrows para verificar se o método está lançando a Exception corretamente.


