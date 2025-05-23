
# Lista de Jogos
# Sobre o projeto
Este projeto foi feito com base no **Intensivão Java Spring** do DevSuperior.
Neste projeto, utilizamos tecnologias como Java e Spring Boot para criarmos uma lista de jogos, onde podemos selecionar quais jogos queremos ver por id, selecionar qual tipo de lista de jogos mostrará, organiza-la na ordem que quisermos e muito mais.
# Como testar?
# Nome do Seu Projeto Spring Boot

Este é o repositório do meu projeto Spring Boot. Abaixo você encontrará instruções sobre como configurá-lo e executá-lo em sua máquina local.

## Descrição do Projeto

(Aqui você pode adicionar uma breve descrição do seu projeto, o que ele faz, suas principais funcionalidades, etc.)

## Pré-requisitos

Para rodar este projeto, você precisará ter o **Java Development Kit (JDK)** e o **Maven** instalados em sua máquina.

### 1. Java Development Kit (JDK)

Recomendamos o **Java 21 (LTS)** já que o projeto está nessa versão.

* **Verifique se você já tem o Java instalado:**
    Abra o terminal (CMD no Windows, ou Terminal no Linux/macOS) e digite:
    ```bash
    java -version
    ```

### 2. Apache Maven

* **Verifique se você já tem o Maven instalado:**
    Abra o terminal e digite:
    ```bash
    mvn -version
    ```

## Como Rodar o Projeto

Siga os passos abaixo para clonar o repositório e executar o projeto:

1.  **Clone o repositório:**
    Abra seu terminal (CMD) e execute o comando:
    ```bash
    git clone LINK_COMMIT
    ```

2.  **Compile e empacote o projeto:**
	Dentro da pasta Back-End do projeto use o comando abaixo: 
    ```bash
    # Entre no diretório "Back-End" e execute:
    mvn clean install
    
    # Continuando dentr dele, execute o código seguinte
    # OBS: Caso não funcione, cheque o nome do arquivo .jar 
    # dentro da pasta target
    java -jar target/dslist-0.0.1-SNAPSHOT.jar
    ```
E poderá acessá-lo via navegador em `http://localhost:8080` e com os endpoints. 
No entanto, **é recomendado** que **utilize o arquivo json** [***DSList.postman_collection***] disponibilizado dentro da pasta Back-End e **execute-o no postman**, assim, já terá todos os endpoints configurados.

## Exemplo com Postman
![games](https://github.com/rafinho0/dslist/blob/main/Back-End/assets/games.png) ![game-list](https://github.com/rafinho0/dslist/blob/main/Back-End/assets/game-list.png)
# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Competências
- Padrão de Camadas
- Padrão Repository
- Padrão DTO
- Entidades e ORM
# Autor
Rafael Oliveira da Silva
https://www.linkedin.com/in/rafa-osilva
