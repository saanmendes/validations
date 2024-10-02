# Exercício de Validação

Faça com que os campos do json abaixo seja validados segundo as regras descritas

-----

Json esperado
````json
{
    "name": "Vinicius",
    "age": 30,
    "yearOfBirth": 1994,
    "email": "vinicius@gmail.com"
}
````

Validações esperadas: 
- name: 
  - É obrigatório
  - Deve conter no minimo 2 palavras (considerar que estão separadas por espaço)
  - Não pode estar em branco, exemplo " "
- age:
  - é obrigatório
  - Deve ser maior de 18 anos
  - Deve ser menor do que 110 anos
  - não pode ser 0
- yearOfBirth
  - é obrigatório 
  - deve ser menor  do que do que 110 anos a contar da data de hoje
  - não pode ser igual ao ano atual
  - deve corresponder ao ano de nascimento calculando o ano atual menos a ideade informada
- email:
  - é obrigatório
  - não pode estar em branco, exemplo " "
  - não pode estar fora do pradrão de um email (com @ e um dominio .com ou outros)


Caso uma ou mais validações seja violadas um mensagem de erro em FORMATO JSON deve ser envida no corpo da resposta com o status http 422

Exemplo de resposta: 
````json
[
  {
    "field": "name",
    "errors": [
      {"message": "Nome é obrigatório"},
      {"message": "Nome deve conter nome e sobrenome"}
    ]
  },
  {
    "field": "age",
    "errors": [
      {"message": "Idade deve ser maior que 18 anos"}
    ]
  }
]
````
