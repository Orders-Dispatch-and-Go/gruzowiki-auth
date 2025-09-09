### Запуск
1) попросить ключи для jwt у [@improve95](https://t.me/improve95)
и поместить их сюда:       
   - /src/main/resources/keys/public
   - /src/main/resources/keys/private
2) создать docker сеть:
```
docker network create -d bridge gruzowiki-network
```
3) docker compose up -d
4) все эндпоинты по адресу: http://localhost:8074/swagger-ui/index.html#/
