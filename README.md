## Reqres API Test Automation

This project automates tests for the public API  [Reqres](https://reqres.in) using **Java + Rest Assured + Cucumber + TestNG**. It was structured aiming to follow best practices in organization, version control, and readability as much as possible, so it can be used as a professional portfolio.

---
### Tech Stack

- Java 17
- Maven
- Rest Assured
- Cucumber (Gherkin)
- TestNG

---

### How to run

In the terminal, run:

```bash
mvn test
```

This will execute all scenarios defined in the .feature files using Cucumber + TestNG.

---
### Implemented scenarios:

- List users (GET /users)
- Create user (POST /users)

### Next steps:

- Fail to create a user (POST/ users ⌋ Returns 400)
