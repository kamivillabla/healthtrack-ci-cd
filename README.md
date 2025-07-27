# HealthTrack

Plataforma web para el monitoreo del peso de los usuarios, desarrollada en Java Spring Boot con automatización de pruebas y pipeline CI/CD.

## Características

- Registro y actualización de peso de usuarios.
- Pruebas unitarias (JUnit), funcionales (Selenium), de regresión y de rendimiento (JMeter).
- Pipeline automatizado en GitHub Actions.
- Análisis de calidad de código con SonarQube.

## Requisitos

- Java 17+
- Maven 3.8+
- Google Chrome (para pruebas funcionales locales)
- [ChromeDriver](https://chromedriver.chromium.org/) compatible con tu versión de Chrome
- Docker (opcional, para SonarQube en local)
- JMeter (solo para pruebas de rendimiento manuales)

## Instalación y ejecución local

### 1. Clona el repositorio

```bash
git clone https://github.com/kamivillabla/healthtrack-ci-cd.git
cd healhealthtrack-ci-cd
```

### 2. Construye el proyecto

```bash
mvn clean install
```

### 3. Ejecuta la aplicación

```bash
mvn spring-boot:run
```

Accede en tu navegador a [http://localhost:8080](http://localhost:8080)

### 4. Ejecuta las pruebas unitarias y funcionales

- **Unitarias y de regresión:**

  ```bash
  mvn test
  ```

- **Funcionales (Selenium):**

  Asegúrate de tener ChromeDriver en tu PATH o configúralo en tu test.  
  Puedes correrlas junto con las unitarias:

  ```bash
  mvn test
  ```

- **Pruebas de rendimiento (JMeter):**

  Abre el archivo `.jmx` en JMeter y ejecuta el test con la app corriendo en localhost.

### 5. Análisis de calidad con SonarQube (opcional)

Si tienes SonarQube corriendo en local (por Docker):

```bash
docker run -d --name sonarqube -p 9000:9000 sonarqube:lts
```

Después:

```bash
mvn org.sonarsource.scanner.maven:sonar-maven-plugin:sonar \
    -Dsonar.projectKey=healthtrack \
    -Dsonar.host.url=http://localhost:9000 \
    -Dsonar.login=TU_TOKEN
```

## Pipeline CI/CD (GitHub Actions)

El pipeline corre automáticamente en cada push o pull request a las ramas `main` o `develop`.  
Incluye compilación, pruebas, análisis de código y reportes automáticos.

**Archivo de workflow:**  
`.github/workflows/ci-cd.yml`

---

## Estructura principal del proyecto

- `src/main/java/com/healthtrack/` — Código fuente de la aplicación
- `src/test/java/com/healthtrack/model/` — Pruebas unitarias
- `src/test/java/com/healthtrack/functional/` — Pruebas funcionales (Selenium)
-  `src/test/java/com/healthtrack/regresión/` — Pruebas funcionales (Selenium)
- `src/test/util/` — Utilidades para Selenium/WebDriver
- `jmeter/` — Pruebas de rendimiento (actualizar-peso-test.jmx)


