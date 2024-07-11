# Sandbox Environment

For opening the sandbox environment just run:

```bash
docker compose exec -u $(id -u):$(id -g) cli bash
```

> [!IMPORTANT]
> You will use this environment throughout the sandbox.
> Remember to open it before executing a command different to `docker compose ...`.