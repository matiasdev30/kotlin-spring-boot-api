  Kotlin Spring Boot Web Application body { font-family: Arial, sans-serif; line-height: 1.6; margin: 20px; } h1, h2 { color: #333; } pre { background-color: #f4f4f4; border: 1px solid #ddd; padding: 10px; overflow-x: auto; } code { background-color: #f4f4f4; border-radius: 3px; padding: 2px 4px; font-size: 90%; } a { color: #007bff; text-decoration: none; } a:hover { text-decoration: underline; } .logo { width: 100px; height: auto; margin-right: 10px; }

Kotlin Spring Boot Web Application
==================================

![Kotlin](data:image/jpeg;base64,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) 
![Spring Boot](https://spring.io/img/spring-logo.png) 
![H2 Database](https://h2database.com/html/images/h2.png) 
![Thymeleaf](https://www.thymeleaf.org/img/thymeleaf_logo.png) 
![Jackson](https://www.baeldung.com/wp-content/uploads/2019/10/JSON-Jackson.png) 
![Lombok](https://projectlombok.org/images/lombok.png)


Descrição
---------

Este projeto é uma aplicação web desenvolvida em Kotlin utilizando o Spring Boot, que oferece uma API REST para gerenciar funcionários com operações básicas de CRUD (Create, Read, Update, Delete). A aplicação faz uso das seguintes tecnologias:

*   **Spring Boot**: Framework para desenvolvimento rápido de aplicações Java baseadas em Spring.
*   **Kotlin**: Linguagem moderna e concisa que compila para a JVM, oferecendo uma sintaxe limpa e recursos avançados.
*   **Spring Data JPA**: Utilizado para a persistência de dados com uma abordagem orientada a objetos.
*   **Thymeleaf**: Motor de templates para gerar páginas web dinâmicas.
*   **H2 Database**: Banco de dados relacional embutido para testes e desenvolvimento.
*   **Jackson**: Biblioteca para serialização e desserialização de JSON.
*   **Lombok**: Biblioteca para reduzir o boilerplate de código, gerando getters, setters e construtores automaticamente.

Funcionalidades
---------------

*   **CRUD de Funcionários**: Permite criar, ler, atualizar e excluir registros de funcionários.
*   **Endpoints**:
    *   **POST /employees**: Cria um novo funcionário.
    *   **GET /employees**: Obtém a lista de todos os funcionários.
    *   **PUT /employees/{id}**: Atualiza um funcionário existente.
    *   **DELETE /employees/{id}**: Deleta um funcionário pelo ID.

Demonstração
------------

O projeto inclui uma demonstração de como interagir com a API usando o Insomnia, onde você pode testar as operações de criação, atualização e exclusão de funcionários.

Instalação
----------

Clone o repositório:

    git clone https://github.com/matiasdev30/kotlin-spring-web-app.git

Navegue até o diretório do projeto:

    cd kotlin-spring-web-app

Compile e execute a aplicação:

    ./mvnw spring-boot:run

Código
------

O código-fonte completo está disponível no [GitHub](https://github.com/matiasdev30/kotlin-spring-web-app). Sinta-se à vontade para explorar, contribuir ou adaptar o projeto conforme necessário.

Contribuição
------------

Se você deseja contribuir para este projeto, sinta-se à vontade para abrir uma _issue_ ou enviar um _pull request_. Agradecemos suas contribuições!

Licença
-------

Este projeto é licenciado sob a [MIT License](https://opensource.org/licenses/MIT).
