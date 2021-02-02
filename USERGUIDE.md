# Utilizando a API


### Pegando todos os produtos

Realize uma requisição Htpp GET para https://challenge-products-api.herokuapp.com/produtos


### Incrementando a pontuação

Realize uma requisição Htpp PUT para https://challenge-products-api.herokuapp.com/produtos/ID-DO-PRODUTO



### Enviando a sugestão

Realize uma requisição Htpp POST para https://challenge-products-api.herokuapp.com/sugestoes

No corpo da requisição envie um JSON com o seguinte formato exemplificado abaixo:
{
	"name": "Guilherme",
	"storeName": "Mercadin do Guilherme",
	"suggestion": "Favor diminua o preco dos produtos em 100%"
}

### Realizando o login

Realize uma requisição Htpp POST para https://challenge-products-api.herokuapp.com/login

No corpo da requisição envie um JSON com o seguinte formato exemplificado abaixo(sim, essas são as informações do usuário já inserido):

{
	"login": "viaflow",
	"password": "12345"
}