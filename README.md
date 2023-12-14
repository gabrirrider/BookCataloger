# Book Cataloger

Este é um projeto de catalogação de livros desenvolvido em Spring Boot como parte do meu portfólio de programação. A aplicação utiliza uma variedade de tecnologias modernas para criar uma solução eficiente e amigável para o usuário.

## Tecnologias Utilizadas

- **Spring Boot 3.1.2:** Framework Java para criação de aplicativos corporativos.
- **Spring Data JPA:** Facilita o acesso e a manipulação de dados usando o Java Persistence API (JPA).
- **PrimeFaces e OmniFaces:** Bibliotecas de componentes para construção de interfaces de usuário ricas.
- **Lombok:** Reduz a verbosidade do código Java, eliminando a necessidade de escrever código boilerplate.
- **MySQL Connector/J:** Driver JDBC para conectar a aplicação ao banco de dados MySQL.

## Funcionalidades Principais

- **Adição e Remoção de Livros:** Cadastre novos livros e remova aqueles que não são mais necessários.
- **Pesquisa e Visualização:** Encontre livros rapidamente através de uma interface intuitiva.
- **Interface Responsiva:** Utiliza PrimeFaces para criar uma interface amigável e responsiva.

## Como Executar

1. **Pré-requisitos:**
   - Java 17
   - MySQL

2. **Configuração:**
   - Clone o repositório.
   - Ajuste as configurações do banco de dados no arquivo `application.properties`.

3. **Execução:**
   ```bash
   ./mvnw spring-boot:run

## Configuração do Ambiente

Antes de executar o projeto, certifique-se de configurar corretamente o ambiente. Abaixo estão as configurações que podem precisar de ajustes:

### Configuração do JoinFaces e Banco de Dados MySQL

No arquivo `application.properties`, certifique-se de definir a propriedade `joinfaces.faces.project-stage` para `development` para garantir que a aplicação esteja no modo de desenvolvimento e ajuste as configurações do banco de dados conforme necessário.

```properties
# Modo de Desenvolvimento para o JoinFaces
joinfaces.faces.project-stage=development

# Configurações do Banco de Dados MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/<nome-do-banco>
spring.datasource.username=<seu-usuario-do-banco>
spring.datasource.password=<sua-senha-do-banco>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Atualização automática do esquema do banco de dados
spring.jpa.hibernate.ddl-auto=update

# Exibir consultas SQL executadas
spring.jpa.show-sql=true

