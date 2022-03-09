# Geocoding
API Rest Java com integração com o Geocoding API do Google, que faz a conversão de endereços em coordenadas, tais coordenadas são calculadas utilizando a fórmula euclidiana de distância.

# Tecnologias utilizadas
- Java
- Spring Boot
- Maven
- Lombok
- JPA / Hibernate / Validation
- OpenAPI 3
- Google API Client Library for Java

# Pré-requisitos: 
- Java 11
- API Key for Google Maps Platform
https://developers.google.com/maps/documentation/javascript/get-api-key


# Documentação do projeto
http://localhost:8080/swagger-ui.html

# Exemplo de entrada de dados

{
  "formatted_address": [
    "Av. Rio Branco, 1 Centro, Rio de Janeiro RJ", "Praça Mal. Âncora, 122 Centro, Rio de Janeiro RJ,"
  ]
}

# clonar repositório

```bash
# clonar repositório
git clone https://github.com/tfonsec/geocoding

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

