# 📌 Projeto Agendador de Tarefas

Aplicação desenvolvida em **Java + Spring Boot** para gerenciamento de tarefas.  
O sistema permite criar, buscar, atualizar e editar tarefas de forma simples e escalável.

🔜 Próxima etapa: **notificação de tarefas via e-mail**.

---

## 🚀 Tecnologias Utilizadas

- ☕ **Java 17+**
- 🌱 **Spring Boot**
  - Spring Data (MongoDB)
  - Spring Security + JWT
  - Spring Web
  - OpenFeign (Netflix)
- 🐳 **MongoDB**
- 🧪 **JUnit** (testes unitários)
- 📦 **Gradle (Groovy DSL)**
- 🔐 **Autenticação JWT**

---

## ⚙️ Funcionalidades

- ➕ **POST** – Criação de tarefas  
- 📋 **GET** – Listagem e consulta de tarefas  
- ✏️ **PATCH / PUT** – Atualização de tarefas  
- ❌ **DELETE** – Exclusão de tarefas  

---

## 🛠️ Como Executar o Projeto

1. Configure o **MongoDB** (local ou container Docker).  
2. Ajuste as propriedades no arquivo `application.properties`:
   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/db_agendador
