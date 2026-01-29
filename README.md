# Java
A curated collection of Java projects, examples, exercises, and utilities maintained by @Anjali-2652.

> Short: This repository contains small-to-medium Java projects and example code meant for learning, demos, and sharing reusable snippets.

---

## Table of contents
- [Repository layout](#repository-layout)
- [Getting started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Run a simple example (plain javac/java)](#run-a-simple-example-plain-javcjava)
  - [Maven projects](#maven-projects)
  - [Gradle projects](#gradle-projects)
- [Testing](#testing)
- [How to add a new project](#how-to-add-a-new-project)
- [Coding style](#coding-style)
- [Contributing](#contributing)
- [Issues & feature requests](#issues--feature-requests)
- [License](#license)
- [Contact](#contact)

---

## Repository layout
This repository is organized to host multiple independent Java projects and examples:

- `/projects/` — Main folder for self-contained projects (each project in its own subfolder).
  - `project-name/`
    - `src/main/java/...`
    - `src/test/java/...`
    - `pom.xml` or `build.gradle` (optional; recommended for non-trivial projects)
    - `README.md` (per-project instructions)
- `/examples/` — Short, single-file or small multi-file examples used for demos or exercises.
- `/libs/` — (Optional) shared utility libraries used by multiple projects.
- `/docs/` — Documentation, design notes, and learning material.
- `/scripts/` — helper scripts (build wrappers, run helpers, etc.)

If your repository currently differs, adapt the instructions below to match the actual layout.

---

## Getting started

### Prerequisites
Install one of the following depending on the project you'll use:
- Java JDK 8+ (OpenJDK or Oracle JDK) — recommended latest LTS (e.g., 17, 21)
- For Maven projects: Apache Maven 3.6+
- For Gradle projects: Gradle 6+ (or use the included Gradle wrapper `./gradlew`)

Check your Java version:
```bash
java -version
javac -version
```

### Run a simple example (plain javac/java)
For examples or simple projects without a build system:
1. Navigate into the example folder (e.g. `examples/hello-world`).
2. Compile:
   ```bash
   javac -d out src/example/HelloWorld.java
   ```
3. Run:
   ```bash
   java -cp out example.HelloWorld
   ```

Replace package paths and class names with the correct ones for the example you're running.

### Maven projects
If a project has a `pom.xml`:
- Build:
  ```bash
  mvn -f projects/<project-name> clean package
  ```
- Run (if the project produces an executable jar):
  ```bash
  java -jar projects/<project-name>/target/<artifact-id>-<version>.jar
  ```
- Test:
  ```bash
  mvn -f projects/<project-name> test
  ```

If the project uses the `exec` plugin, you can also:
```bash
mvn -f projects/<project-name> exec:java -Dexec.mainClass="com.example.Main"
```

### Gradle projects
If a project contains `build.gradle` or `build.gradle.kts`:
- Build:
  ```bash
  ./gradlew -p projects/<project-name> build
  ```
  or, if you don't have the wrapper:
  ```bash
  gradle -p projects/<project-name> build
  ```
- Run (if configured with an application plugin):
  ```bash
  ./gradlew -p projects/<project-name> run
  ```
- Test:
  ```bash
  ./gradlew -p projects/<project-name> test
  ```

---

## Testing
Recommended testing frameworks: JUnit 5 (Jupiter) and Mockito for unit tests.
- Maven: `mvn test`
- Gradle: `./gradlew test`

Each project should include `src/test/java` for unit tests.

---

## How to add a new project
1. Create a new directory under `projects/` with a descriptive name.
2. Add a `README.md` with instructions specific to that project.
3. Use a standard layout:
   - `src/main/java/...`
   - `src/test/java/...`
4. Include a build file (`pom.xml` or `build.gradle`) for reproducible builds, or document how to compile and run with `javac`.
5. Add tests and at least one example to demonstrate usage.
6. Open a pull request describing the project and usage.

Suggested minimal README for a project:
- Purpose
- How to build
- How to run
- Example commands

---

## Coding style
- Follow standard Java conventions (CamelCase class names, lowerCamelCase for methods/vars).
- Prefer meaningful variable and method names.
- Recommended style guide: Google Java Style Guide or Oracle Java Code Conventions.
- Add editorconfig or checkstyle/spotless configuration in project root if you want automatic formatting checks.

---

## Contributing
Contributions are welcome! Typical flow:
1. Fork the repository.
2. Create a branch: `git checkout -b feature/<short-description>`
3. Add your code, tests, and update documentation.
4. Run tests and ensure the project builds.
5. Open a pull request describing the change.

Please follow the repository's code style and include tests for new functionality where practical.

---

## Issues & feature requests
- Use GitHub Issues to report bugs or request features.
- Provide a clear description, steps to reproduce (if applicable), and environment details (OS, JDK version, build tool).

---

## License
This repository does not include a license file by default. Add a LICENSE (for example, MIT) to make your code reusable. Example: add `LICENSE` with the MIT license if you want permissive reuse.

---

## Contact
Maintainer: [Anjali-2652](https://github.com/Anjali-2652)

If you need help, open an issue or send a pull request.

---

Thank you for visiting! 
