# Projeto Urbanity

# Descrição
Urbanity é uma aplicação containerizada que utiliza CI/CD para automação de integração e deployment em dois ambientes distintos:

1. Staging: Ambiente de validação e testes.

2. Produção: Ambiente final para uso dos usuários.


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


### **Instruções para Staging**
1. Clone o repositório:
   git clone https://github.com/ThiagoConegin/TecnicasDevOpsFiap.git
   
   cd urbanity

2. Compile o projeto com Maven:
   mvn clean package

3. Suba o container Docker no ambiente de staging:
   docker-compose -f docker-compose.yml up -d

4. Acesse o ambiente de staging:
   Endpoint: `http://localhost:8081/denuncias/local`

### **Instruções para Produção**
1. Compile o projeto (se ainda não feito):
   mvn clean package

2. Suba o container Docker no ambiente de produção:
   docker-compose -f docker-compose.prod.yml up -d

3. Acesse o ambiente de produção:
   Endpoint: `http://localhost:8082/denuncias/local`