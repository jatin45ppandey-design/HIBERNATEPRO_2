# MyProject — Java Hibernate Demo

A beginner Java project that demonstrates how to connect to a database and save data using Hibernate ORM. The project uses a `Games` entity to store game information like name and price.

## About the Project

This project shows how to:
- Set up Hibernate in a Maven project
- Create an entity class (`Games`) mapped to a database table
- Open a Hibernate session and save data using `session.persist()`
- Manage transactions (begin, commit, close)

The main logic lives in `Main.java`, which creates a `Games` object, configures Hibernate using `hibernate.cfg.xml`, and saves the record to the database.

## Project Structure

```
MyProject/
├── src/main/java/com/jatin/
│   ├── Main.java         # Main logic
│   └── Games.java        # Entity class
├── src/main/resources/
│   └── hibernate.cfg.xml # Database config
└── pom.xml               # Maven dependencies
```

## Setup

### Requirements
- Java 8 or above
- Maven
- A running database (MySQL or PostgreSQL)

### Steps

1. **Clone the project**
   ```bash
   git clone <your-repo-url>
   cd MyProject
   ```

2. **Configure the database**  
   Open `src/main/resources/hibernate.cfg.xml` and update:
   - Database URL
   - Username
   - Password
   - Dialect (MySQL or PostgreSQL)

3. **Install dependencies**
   ```bash
   mvn clean install
   ```

4. **Run the project**  
   Run `Main.java` from IntelliJ IDEA, or use:
   ```bash
   mvn exec:java -Dexec.mainClass="com.jatin.Main"
   ```

5. **Check the output**  
   You should see the following printed in the console:
   ```
   CONFIGURATION DONE
   SESSION OPENED
   TRANSACTION COMMITED
   SF Close
   ```
