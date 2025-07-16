## Reqres API Test Automation

Este projeto automatiza testes da API pública [Reqres](https://reqres.in) utilizando **Java + Rest Assured + Cucumber + TestNG**.  
Foi estruturado tentando seguir o máximo possível de boas práticas de organização, versionamento e legibilidade para ser usado como portfólio profissional.

---

### Tech Stack

- Java 17
- Maven
- Rest Assured
- Cucumber (Gherkin)
- TestNG

---

### Como executar

No terminal, execute:

```bash
mvn test
```

Isso executará todos os cenários definidos nos arquivos .feature com Cucumber + TestNG.

### Cenários implementados:

- Listar usuários (GET /users)

### Próximos passos:

- Criar usuário (POST /users)
