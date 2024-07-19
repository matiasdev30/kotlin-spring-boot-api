  Kotlin Spring Boot Web Application body { font-family: Arial, sans-serif; line-height: 1.6; margin: 20px; } h1, h2 { color: #333; } pre { background-color: #f4f4f4; border: 1px solid #ddd; padding: 10px; overflow-x: auto; } code { background-color: #f4f4f4; border-radius: 3px; padding: 2px 4px; font-size: 90%; } a { color: #007bff; text-decoration: none; } a:hover { text-decoration: underline; } .logo { width: 100px; height: auto; margin-right: 10px; }

Kotlin Spring Boot Web Application
==================================

![Kotlin]([Uploading images.jpeg…])
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
