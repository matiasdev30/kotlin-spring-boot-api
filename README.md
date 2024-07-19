# Kotlin Spring Boot Web Application

![Kotlin](https://kotlinlang.org/assets/images/logos/kotlin/kotlin.svg) ![Spring Boot](https://spring.io/img/spring-logo.png) ![H2 Database](https://h2database.com/html/images/h2.png) ![Thymeleaf](https://www.thymeleaf.org/img/thymeleaf_logo.png) ![Jackson](https://www.baeldung.com/wp-content/uploads/2019/10/JSON-Jackson.png) ![Lombok](https://projectlombok.org/images/lombok.png)

## Descrição

Este projeto é uma aplicação web desenvolvida em Kotlin utilizando o Spring Boot, que oferece uma API REST para gerenciar funcionários com operações básicas de CRUD (Create, Read, Update, Delete). A aplicação faz uso das seguintes tecnologias:

- **Spring Boot**: Framework para desenvolvimento rápido de aplicações Java baseadas em Spring.
- **Kotlin**: Linguagem moderna e concisa que compila para a JVM, oferecendo uma sintaxe limpa e recursos avançados.
- **Spring Data JPA**: Utilizado para a persistência de dados com uma abordagem orientada a objetos.
- **Thymeleaf**: Motor de templates para gerar páginas web dinâmicas.
- **H2 Database**: Banco de dados relacional embutido para testes e desenvolvimento.
- **Jackson**: Biblioteca para serialização e desserialização de JSON.
- **Lombok**: Biblioteca para reduzir o boilerplate de código, gerando getters, setters e construtores automaticamente.

## Funcionalidades

- **CRUD de Funcionários**: Permite criar, ler, atualizar e excluir registros de funcionários.
- **Endpoints**:
  - **POST /employees**: Cria um novo funcionário.
  - **GET /employees**: Obtém a lista de todos os funcionários.
  - **PUT /employees/{id}**: Atualiza um funcionário existente.
  - **DELETE /employees/{id}**: Deleta um funcionário pelo ID.

## Demonstração

O projeto inclui uma demonstração de como interagir com a API usando o Insomnia, onde você pode testar as operações de criação, atualização e exclusão de funcionários.

## Instalação

Clone o repositório:

```bash
git clone https://github.com/matiasdev30/kotlin-spring-web-app.git
