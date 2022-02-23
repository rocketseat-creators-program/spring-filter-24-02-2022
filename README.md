<img src="https://storage.googleapis.com/golden-wind/experts-club/capa-github.svg" />

## Utilizando Interceptor ou filtro para capturar dados com Strping
Este projeto visa exemplificar a utilização de filtro e interceptor no Spring, sendo que o intecetor está no contexto do spring, viabilizando  o desenvolvedor conseguir realizar injeção de dependência, enquanto que no filtro o mesmo está numa camada acima, não conseguindo fazer uso de objetos do contexto do Spring. O filtro apresente uma performance superior, muito embora com eles conseguimos armazenar dados da requisição, capturar os parâmetros que foram utilizando na mesma,  por exemplo o Sptring Security usa esse ferramental para verificar se tem o token de segurança se faz presente.

### Ambiente Utilizado
* Java JDK 17
* Spring 2.60
* Eclipse
* Ubuntu 20.04

### Diretório do Projeto

```sh
.
├── consumer/    # aplicação que faz uso do código do stater, um conjunto de classes de configuraçao e um arquivo xml que configura o log.
├── starter/     #  conjunto de classes que deve ser utilizada por todas as outras.
├── .gitignore   # arquivos que são desconsiderados pelo git
├── pom.xml      # dependências do projeto
└── README.md
```


## Expert

| [<img src="https://avatars.githubusercontent.com/u/1785791?s=400&u=cf86c9ae2216765f948ca2136eda7e632e0cd922&v=4" width="75px;"/>](https://github.com/gustavodsf) |
| :-: |
|[Gustavo Figueiredo](https://github.com/gustavodsf)|