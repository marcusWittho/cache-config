# Cache

Projeto com a estrutura básica para implementação de cache utilizando o Redis.

### Para executar o projeto

Para subir o redis utilizando o docker, acesse a pasta docker na raiz do projeto e execute o 
seguinte comando:

    sudo docker compose up

Para rodar acesse a raiz do pojeto e utilize o comando:

    ./gradlew run

### Endpoints
O retorno deste endpoint será armazenado em cache.

    localhost:8080/hello 

Ao acessar este endpoint o cache será apagado.
    
    localhost:8080/cancel 