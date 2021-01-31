# API Gerenciamento de Notas
> Gerencia as notas, calcula a média e mostra alunos aprovados

A API permite o registo dos alunos e suas notas, assim como o peso de cada prova, 
quando for registrada a nota do aluno, é calculado sua média ponderada com base no peso de cada avaliação, 
também é possivel ver o aluno ele obteve uma média maior ou igual a 7.

## Instalação

### Windows - macOS - Linux:
No CMD faça:

```sh
cd GerenciadorDeNotasAPI
cd target
java - jar GerenciadorNotasAPI-0.0.1-SNAPSHOT.jar
```

## Configuração para Desenvolvimento

Necessário a versão [Java SE 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) <br>
A API foi criada em [Spring Boot](https://spring.io/)<br>
Para banco de dados usei a [H2 Database](https://www.baeldung.com/spring-boot-h2-database)<br>
Para visualizar e fazer as requisições recomendo a utilização do [Postman](https://www.postman.com/)

## Como Usar
Inicie o servidor pelo CMD, após isso com ajuda do Postman acesse o link com a função passando por meio de JSON os valores:

### Para adicionar Aluno
http://localhost/8080/add/aluno<br>
Envie em POST o nome do Aluno em formato JSON para cadastrar um Aluno.
```
{
    "nome":"João"
}
```
Você receberá o cadastro que acabou de fazer com o ID do Aluno, Nome, Notas e Média.

### Listar Alunos
http://localhost:8080/list/alunos<br>
Envie na função GET e receberá a lista de alunos no banco de dados temporário do H2.

### Adicionar Prova
http://localhost:8080/add/gabarito<br>
Envie em POST o nome da prova e o seu peso em JSON
```
{
    "nomeProva":"Prova de História",
    "peso":8
}
```
Você receberá de volta o ID da prova (gabarito), nome da prova e seu peso.

### Listar Provas
http://localhost:8080/list/gabaritos<br>
Envie em GET e receberá a lista de provas cadastradas no banco de dados.

## Adicionar Nota
http://localhost:8080/add/resposta
Envie em POST o iD do aluno, o ID do Gabarito (Prova) e a nota tirada<br>
```
{
    "idAluResp":1,
    "idGabResp":1,
    "notaProva":8.5
}
```
Você receberá de volta a Nota*Peso e a Média atual do Aluno.

## Lista de Aprovados
http://localhost:8080/list/aprovados
Solicite em GET para receber a lista de alunos com média acima ou igual a 7<br>
Você receberá o ID, Nome e média do aluno.

## Meta

André Pereira Martins – Andre.pereira.martins100@gmail.com
