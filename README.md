# API Gerenciamento de Notas
> Gerencia as notas, calcula a média e mostra alunos aprovados

A API permite o registo dos alunos e suas notas, assim como o peso de cada prova, 
quando for registrada a nota do aluno, é calculado sua média ponderada com base no peso de cada avaliação, 
também é possivel ver o aluno ele obteve uma média maior ou igual a 7.

## Instalação

Windows - macOS - Linux:

```sh
cd GerenciadorDeNotasAPI
cd target
java - jar GerenciadorNotasAPI-0.0.1-SNAPSHOT.jar
```

## Configuração para Desenvolvimento

A API foi criada em [Spring Boot](https://spring.io/)<br>
Para banco de dados usei a [H2 Database](https://www.baeldung.com/spring-boot-h2-database)<br>
Java SE 11 <br>
[Postman](https://www.postman.com/) - Para visualizar as requisições

#Como Usar
Inicie o servidor pelo cmd, após isso com ajuda do Postman navegue até http://localhost/8080/add/aluno


## Meta

André Pereira Martins – Andre.pereira.martins100@gmail.com

