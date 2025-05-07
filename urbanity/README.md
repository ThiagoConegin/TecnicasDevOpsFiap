# Projeto Urbanity

# Descrição
Urbanity é uma aplicação que utiliza CI/CD para automação de testes:


## Tecnologias Utilizadas
- **Java (JDK 17)**: Desenvolvimento da aplicação.
- **Maven**: Compilação e testes automatizados.
- **Docker**: Containerização da aplicação.
- **Docker Compose**: Orquestração dos containers.
- **GitHub Actions**: Gerenciamento do pipeline de CI/CD.


## Como Inicializar o Projeto

### **Pré-Requisitos**
Certifique-se de ter as seguintes ferramentas instaladas:
    Docker
    Docker Compose
    Java JDK 17
    Maven


### **Instruções para rodar**
### 1. Clone o repositório:
   **Comando:** git clone https://github.com/ThiagoConegin/TecnicasDevOpsFiap.git
   
   **Comando:** cd urbanity

### 2. Compilar o projeto (sem rodar testes) com Maven:
   **Comando:** mvn clean package -DskipTests

### 3. Iniciar aplicação localmente:
   **Comando:** java -jar target/urbanity-0.0.1-SNAPSHOT.jar

### 4. Executar testes automatizados  
   Se a aplicação estiver rodando no terminal, **inicie um novo terminal** para executar os testes sem interromper o funcionamento do sistema.  

   **Comando:** mvn test
