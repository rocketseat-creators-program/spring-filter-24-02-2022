<img src="https://storage.googleapis.com/golden-wind/experts-club/capa-github.svg" />

## Utilizando Interceptor ou filtro para capturar dados com Spring
Este projeto visa exemplificar a utilização de filtro e interceptor no Spring, sendo que o intecetor está no contexto do spring, viabilizando  o desenvolvedor conseguir realizar injeção de dependência, enquanto que no filtro o mesmo está numa camada acima, não conseguindo fazer uso de objetos do contexto do Spring. O filtro apresente uma performance superior, muito embora com eles conseguimos armazenar dados da requisição, capturar os parâmetros que foram utilizando na mesma,  por exemplo o Sptring Security usa esse ferramental para verificar se tem o token de segurança se faz presente.

### Ambiente Utilizado
* Java JDK 17
* Spring 2.6.3
* Intellij Community
* Sistema Operacional Windows

### Diretório do Projeto

Abaixo iremos descrever brevemente o que cada classe tem por objetivo de realizar.

```sh
.
├── src/
│   ├── FilterAppConfig # classe de configuração utilizada para registrar os filtros.
│   ├── FirstFilter # primeiro filter que irá capturar informações da requisição
│   ├── GeneralInterceptor # Interceptador simples que basicamente cálcula o tempo que demorou a requisição.
│   ├── HelloController # controller utilizado para retornar "Hello World", apenas para mostrar que funciona com diferentes controller, sem nenhuma alteração.
│   ├── InterceptorAppConfig # registra o interceptor junto ao spring, permitindo sua execução
│   ├── MyComponent # componente que será injetado no interceptor para demonstrar que existe essa possibilidade.
│   ├── RateLimiter # function that stores the number of requests for the path and checks if it has reached the limit.
│   ├── SecondFilter # filter que será exectudado em segundo quando uma requisição for realizada.
│   ├── ThirdFilter # filter que será exectudado em terceiro quando uma requisição for realizada.
│   ├── User # entidade que armazena o conteúdo de um usuário
│   ├── UserController # controller que possui um método GET que retorna o usuário.
│   └── WebApplication # classe que chama  todas as outras
├── .gitignore # informa quais arquivos  o git deve ignorar
├── License # lincesa de utilização do código (MIT)
├── pom.xml # arquivo que contém todas as dependências do projeto
├── README.md # este arquivo
└── slides.pdf # slides utilizandos durante a apresentação da aula.
```


## Expert

| [<img src="https://avatars.githubusercontent.com/u/1785791?s=400&u=cf86c9ae2216765f948ca2136eda7e632e0cd922&v=4" width="75px;"/>](https://github.com/gustavodsf) |
| :-: |
|[Gustavo Figueiredo](https://github.com/gustavodsf)|