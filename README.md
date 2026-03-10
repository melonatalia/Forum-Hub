# ForumHub 🚀

ForumHub é uma aplicação de fórum construída com **Spring Boot**, permitindo aos usuários criar, listar, visualizar, atualizar e deletar tópicos. Utiliza **Spring Data JPA** para persistência e o banco de dados **H2** para testes.

## 🚧 Em Manutenção 🚧
Este projeto está atualmente em **manutenção**. Estou trabalhando para melhorar o código e adicionar novas funcionalidades. Fique atento às atualizações! 🔧

## Funcionalidades 🌟
- **Criação de tópicos** ✍️
- **Exibição de tópicos** 👀
- **Atualização de tópicos** 🔄
- **Deleção de tópicos** 🗑️

## Tecnologias ⚙️
- **Spring Boot** 🌱
- **Spring Data JPA** 💾
- **H2 Database** 🗃️
- **Maven** 🔧
- **Spring Security** 🔐

## Requisitos ✅
- **JDK 21 ou superior** ☕
- **Maven** 📦

## Como Rodar 🚀
1. Clone o repositório:  
   `git clone https://github.com/melonatalia/Forum-Hub.git`
2. Navegue até o diretório:  
   `cd Forum-Hub`
3. Execute com Maven:  
   `mvn spring-boot:run`

A aplicação estará disponível em `http://localhost:8080`. 🎉

## Endpoints da API 📡
- **GET** `/api/topicos`: Lista todos os tópicos 📝
- **POST** `/api/topicos`: Cria um novo tópico ✨
- **PUT** `/api/topicos/{id}`: Atualiza um tópico 🔄
- **DELETE** `/api/topicos/{id}`: Deleta um tópico 🗑️
