Avaliação individual de API.
O banco de dados escolhido foi o H2 pois facilita a visualização, já que foi solicitado a criação apenas de uma Tabela.

Requesitos do projeto:
Criar a classe Funcionario (id, nome) e Endereco (rua, cidade, estado, cep) e a relação entre as duas classes.
Criar a interface FuncionarioRepository herdando de JpaRepository.
Criar a classe de FuncionarioController criando um CRUD para utilização do recursos.
Criar as anotações necessárias para que esta classe funcione como um controlador.
Criar as validações para tratamento dos campos obrigatórios na classe Funcionario (nome) e Endereco (rua, cidade, estado, cep).
Criar a classe de ControllerExceptionHandler e ErroResposta para tratamento das exceções

API
GET /funcionarios – lista todos funcionarios
GET /funcionarios/<id> - retorna o funcionario com o id específico.
POST /funcionarios - insere um novo funcionario
PUT /funcionarios/<id> - atualiza o funcionario (o id não pode ser atualizado)
DELETE / funcionarios /<id> - remove um funcionario cujo id foi passado

OBS: Serão testado exatamente essas URI's no Postman. Se atentem na consturção das mesmas para representar o pedido.
