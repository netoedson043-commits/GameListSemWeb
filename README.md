# 🎮 GameList Sem Web | Terminal Game Manager

Aplicação de terminal para pesquisar jogos e organizar favoritos, desenvolvida com Java, Spring Boot, PostgreSQL e integração com a API RAWG.

Terminal application for searching games and organizing favorites, built with Java, Spring Boot, PostgreSQL, and RAWG API integration.

---

# 🇧🇷 Português

## 📋 Sobre o Projeto

O GameList Sem Web permite buscar jogos pelo nome, selecionar resultados e manter uma lista pessoal de favoritos no PostgreSQL.

Toda a interação acontece por menus no terminal, com leitura das escolhas pelo `Scanner`. O Spring Boot inicializa os componentes, enquanto os serviços executam as regras e os repositories acessam o banco de dados.

## ✨ Funcionalidades

- ✅ Pesquisar jogos pelo nome na API RAWG.
- ✅ Listar resultados com nome e data de lançamento.
- ✅ Selecionar um resultado para consultar os detalhes.
- ✅ Adicionar jogos aos favoritos e impedir duplicação pelo nome.
- ✅ Listar e remover favoritos pelo ID do banco.
- ✅ Definir e atualizar o status: Vou jogar, Jogando ou Concluído.
- ✅ Salvar Sem informações quando a escolha de status não corresponde às opções previstas.
- ✅ Cadastrar ou reutilizar a desenvolvedora ao adicionar um favorito.
- ✅ Listar desenvolvedoras e seus jogos favoritados.
- ✅ Impedir a remoção de desenvolvedoras com favoritos vinculados.
- ✅ Persistir os dados no PostgreSQL.

A consulta por desenvolvedora mostra os favoritos cadastrados no banco local, não o catálogo completo da RAWG.

## 🗂️ Estrutura do Projeto

```text
GameListSemWeb/
├── .mvn/wrapper/                    # Configuração do Maven Wrapper
├── src/
│   ├── main/
│   │   ├── java/Jogo/Gamilist20/
│   │   │   ├── Api/
│   │   │   │   └── RawgApiClientHttp.java
│   │   │   ├── Modelo/
│   │   │   │   ├── Desenvolvedor/
│   │   │   │   ├── JsonAlias/
│   │   │   │   ├── Desenvolvedora.java
│   │   │   │   ├── JogosFavoritos.java
│   │   │   │   └── StatusJogo.java
│   │   │   ├── Principal/
│   │   │   │   ├── BuscarApi/BuscarJogos.java
│   │   │   │   └── Main.java
│   │   │   ├── Servicos/
│   │   │   │   ├── Menus/Menus.java
│   │   │   │   ├── BancoDados.java
│   │   │   │   └── BancodadosDev.java
│   │   │   ├── repository/
│   │   │   │   ├── DesenvolvedoraRepository.java
│   │   │   │   └── JogosFavoritosRepository.java
│   │   │   └── Application.java
│   │   └── resources/application.properties
│   └── test/java/Jogo/Gamilist20/ApplicationTests.java
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## 🚀 Como Executar

### Pré-requisitos

- JDK 25, conforme o `pom.xml`, ou uma versão mais recente compatível.
- PostgreSQL instalado e em execução.
- Chave de acesso à API RAWG.
- Git e acesso à internet para baixar dependências e consultar jogos.
- Terminal interativo para informar as opções dos menus.

### 1. Clonar o repositório

```bash
git clone https://github.com/netoedson043-commits/GameListSemWeb.git
cd GameListSemWeb
```

### 2. Criar o banco de dados

Execute no PostgreSQL:

```sql
CREATE DATABASE "GameList";
```

### 3. Configurar o projeto

Configure `src/main/resources/application.properties` com seus dados locais:

```properties
spring.application.name=GameList
spring.datasource.url=jdbc:postgresql://localhost:5432/GameList
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
rawg.api.key=SUA_CHAVE_RAWG
```

Substitua os valores de exemplo. O Hibernate cria ou atualiza as tabelas no banco existente. Use suas próprias credenciais e mantenha senhas e chaves fora dos commits.

### 4. Executar a aplicação

Linux/macOS:

```bash
bash mvnw spring-boot:run
```

Windows (PowerShell):

```powershell
.\mvnw.cmd spring-boot:run
```

Também é possível abrir o projeto no IntelliJ IDEA e executar `Application.java`, utilizando o console da IDE para digitar as opções. O Maven Wrapper dispensa a instalação separada do Maven.

## 🕹️ Como Usar

Após a inicialização, o menu principal apresenta:

```text
1. Procurar jogos
2. Jogos favoritos
3. Desenvolvedoras
4. Sair
```

**Procurar jogos:** digite o nome e escolha o número de um resultado para consultar os detalhes.

**Jogos favoritos:** escolha adicionar, remover, listar ou redefinir status. Ao adicionar, pesquise o jogo, selecione um resultado e escolha o status. Para remover ou atualizar, informe o ID exibido na lista de favoritos.

**Desenvolvedoras:** liste os registros, consulte seus favoritos ou remova uma desenvolvedora sem jogos vinculados, informando o ID exibido.

O número do resultado de uma busca é a posição na lista. Os IDs dos favoritos e das desenvolvedoras são identificadores do banco local.

## 🛠️ Tecnologias

- Java 25.
- Spring Boot 4.1.0.
- Spring Data JPA e Hibernate.
- PostgreSQL.
- Java HttpClient para requisições à RAWG.
- Jackson para converter JSON em objetos Java.
- Scanner para entrada de dados no terminal.
- Maven Wrapper.
- JUnit e Spring Boot Test.

## 🖥️ Interface

A aplicação é utilizada exclusivamente por menus no terminal. O menu é exibido após a inicialização de `Application.java`; não é necessário abrir um navegador.

## 🔗 Projeto

- [Repositório no GitHub](https://github.com/netoedson043-commits/GameListSemWeb).
- [API RAWG](https://rawg.io/apidocs).

---

# 🇺🇸 English

## 📋 About the Project

GameList Sem Web lets users search for games by name, select results, and maintain a personal favorites collection in PostgreSQL.

All interaction takes place through terminal menus using `Scanner`. Spring Boot initializes the components, services handle application rules, and repositories access the database.

## ✨ Features

- ✅ Search for games by name through the RAWG API.
- ✅ List results with names and release dates.
- ✅ Select a result to retrieve its details.
- ✅ Add favorites and prevent duplicates by name.
- ✅ List and remove favorites using their database IDs.
- ✅ Set and update status: Plan to play, Playing, or Completed.
- ✅ Save No information when the status choice does not match a listed option.
- ✅ Create or reuse a developer when adding a favorite.
- ✅ List developers and their favorited games.
- ✅ Prevent removal of developers with linked favorites.
- ✅ Persist data in PostgreSQL.

Developer queries show locally saved favorites, rather than the entire RAWG catalog.

## 🗂️ Project Structure

```text
GameListSemWeb/
├── .mvn/wrapper/                    # Maven Wrapper configuration
├── src/
│   ├── main/
│   │   ├── java/Jogo/Gamilist20/
│   │   │   ├── Api/                # RAWG HTTP client
│   │   │   ├── Modelo/             # Entities, enum, and RAWG models
│   │   │   ├── Principal/
│   │   │   │   ├── BuscarApi/BuscarJogos.java
│   │   │   │   └── Main.java       # Terminal navigation
│   │   │   ├── Servicos/
│   │   │   │   ├── Menus/Menus.java
│   │   │   │   ├── BancoDados.java
│   │   │   │   └── BancodadosDev.java
│   │   │   ├── repository/         # Spring Data JPA database access
│   │   │   └── Application.java    # Application entry point
│   │   └── resources/application.properties
│   └── test/java/Jogo/Gamilist20/ApplicationTests.java
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## 🚀 How to Run

### Requirements

- JDK 25, as configured in `pom.xml`, or a compatible newer version.
- An installed and running PostgreSQL server.
- A RAWG API key.
- Git and internet access for dependencies and game searches.
- An interactive terminal to enter menu choices.

### 1. Clone the repository

```bash
git clone https://github.com/netoedson043-commits/GameListSemWeb.git
cd GameListSemWeb
```

### 2. Create the database

Run in PostgreSQL:

```sql
CREATE DATABASE "GameList";
```

### 3. Configure the project

Configure `src/main/resources/application.properties`:

```properties
spring.application.name=GameList
spring.datasource.url=jdbc:postgresql://localhost:5432/GameList
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
rawg.api.key=YOUR_RAWG_KEY
```

Replace the placeholders with your local settings. Hibernate creates or updates tables in the existing database. Use your own credentials and keep passwords and API keys out of commits.

### 4. Run the application

Linux/macOS:

```bash
bash mvnw spring-boot:run
```

Windows (PowerShell):

```powershell
.\mvnw.cmd spring-boot:run
```

Alternatively, open the project in IntelliJ IDEA and run `Application.java`, entering choices in the IDE console. The Maven Wrapper avoids a separate Maven installation.

## 🕹️ How to Use

The application displays the following main menu in Portuguese:

```text
1. Procurar jogos
2. Jogos favoritos
3. Desenvolvedoras
4. Sair
```

**Search games (1):** enter a name and select a result number to retrieve details.

**Favorites (2):** add, remove, list, or update status. To add a game, search, select a result, and choose its status. To remove or update one, enter its ID from the favorites list.

**Developers (3):** list developers, view their favorites, or remove a developer without linked games using its displayed ID.

**Exit (4):** leave the main menu.

A search result number is its position in the result list. Favorite and developer IDs identify records in the local database.

## 🛠️ Tech Stack

- Java 25.
- Spring Boot 4.1.0.
- Spring Data JPA and Hibernate.
- PostgreSQL.
- Java HttpClient for RAWG requests.
- Jackson for JSON-to-Java conversion.
- Scanner for terminal input.
- Maven Wrapper.
- JUnit and Spring Boot Test.

## 🖥️ Interface

The application uses terminal menus exclusively. Run `Application.java` to initialize the application and display the menu; no browser is required.

## 🔗 Project

- [GitHub repository](https://github.com/netoedson043-commits/GameListSemWeb).
- [RAWG API](https://rawg.io/apidocs).

---

## 👤 Autor | Author

Edson Neto

GitHub: [netoedson043-commits](https://github.com/netoedson043-commits)
