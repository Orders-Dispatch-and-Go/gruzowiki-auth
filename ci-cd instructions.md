## Настройка GitHub Secrets
### Обязательные секреты:

#### БД (Development)
- `AUTH_PG_HOST`
- `AUTH_PG_PORT`
- `AUTH_PG_DATABASE`
- `AUTH_PG_USER`
- `AUTH_PG_PASSWORD`
- `AUTH_SERVICE_PORT`

#### Для деплоя (Development)
- `DEPLOY_HOST`
- `DEPLOY_USER`
- `SSH_PRIVATE_KEY`

### Автоматические секреты:
- `GITHUB_TOKEN`
