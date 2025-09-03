# 🚀 API RESTFull - Cadastro de Leads | Semana Nacional de Ciência e Tecnologia  

Este projeto é uma **API RESTFull** desenvolvida em **Java com Spring Boot**, criada para gerenciar o **cadastro de leads** durante a **Semana Nacional de Ciência e Tecnologia**.  
O sistema segue as melhores práticas de **arquitetura REST**, aplicando **boas práticas de desenvolvimento, versionamento de banco de dados, modelagem e testes**.  

> 📚 Desenvolvido sob a orientação do professor especialista **Rômulo C. Silvestre**, em conjunto com os colegas de classe nas disciplinas de:  
> - Modelagem de Sistemas  
> - Implementação de Sistemas  
> - Teste de Software  

🎯 Desafio proposto pelo **SENAI** para aplicar de forma prática os conhecimentos estudados.  

---  

## 🛠️ Tecnologias Utilizadas  

<p align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="40" alt="Java"/> 
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="40" alt="Spring Boot"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" width="40" alt="MySQL"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/hibernate/hibernate-plain.svg" width="40" alt="Hibernate"/>
  <img src="https://camo.githubusercontent.com/821c82c9e0f2e8df2c413fe555037e4bbfd69a6b686b039ee94dcf6f534977a4/68747470733a2f2f646f63756d656e746174696f6e2e7265642d676174652e636f6d2f646f776e6c6f61642f6174746163686d656e74732f3133383334363837362f46443f76657273696f6e3d33266d6f64696669636174696f6e446174653d31363333393832383639393532266170693d7632" alt="Flyway" title="Flyway" data-canonical-src="https://documentation.red-gate.com/download/attachments/138346876/FD?version=3&amp;modificationDate=1633982869952&amp;api=v2" width="40"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/maven/maven-original.svg" width="40" alt="Maven"/>
  <img src="https://junit.org/junit5/assets/img/junit5-logo.png" width="60" alt="JUnit"/>
</p>  

---  

## ⚙️ Funcionalidades  

- ✅ Cadastro de leads  
- ✅ Listagem de leads cadastrados  
- ✅ Atualização de informações  
- ✅ Exclusão de leads  
- ✅ Validações e regras de negócio  
- ✅ Versionamento de banco de dados com **Flyway**  

---  

## 📂 Estrutura do Projeto  

```
src/
 ├── main/
 │   ├── java/ 
 │   │    └── br.com.seuprojeto/  # Código fonte da API
 │   └── resources/
 │        ├── application.properties  # Configurações da aplicação
 │        └── db/migration/           # Scripts do Flyway
 └── test/                            # Testes automatizados
```  

---  

## ⬇️ Como Baixar e Executar a API  

### 🔧 Pré-requisitos  
Antes de iniciar, certifique-se de ter instalado:  
- [Java 17+](https://adoptium.net/) ☕  
- [Maven](https://maven.apache.org/) 🔨  
- [MySQL](https://dev.mysql.com/downloads/) 🐬  

### 📥 Passo a Passo  

1. **Clonar o repositório**  
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
```  

2. **Configurar o banco de dados no `application.properties`**  
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=validate
spring.jpa.show-sql=true
```  

3. **Rodar a aplicação com Maven**  
```bash
mvn spring-boot:run
```  

4. **Acessar a API**  
```
http://localhost:8080/api/leads
```  

---  

## 📖 Exemplos de Endpoints  

### 🔹 Cadastrar Lead (POST)  
```http
POST /api/leads
Content-Type: application/json

{
  "nome": "Maria Silva",
  "email": "maria@email.com",
  "telefone": "11999999999"
}
```  

### 🔹 Listar Leads (GET)  
```http
GET /api/leads
```  

---  

## ✅ Testes Automatizados  

Os testes foram implementados utilizando **JUnit** e **Mockito**, garantindo a qualidade e confiabilidade da aplicação.  

Para rodar os testes:  
```bash
mvn test
```  

---  

## 👨‍🏫 Orientador  

- Professor **Rômulo C. Silvestre**  

---  

## 👨‍💻 Desenvolvido por  

Projeto desenvolvido em equipe durante as disciplinas de **Teste de Software, Implementação de Sistemas e Modelagem de Sistemas** do **SENAI**.  

---  

💡 Se este projeto te ajudou ou chamou sua atenção, deixe uma ⭐ no repositório!  
