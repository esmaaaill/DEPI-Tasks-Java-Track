# DEPI Java Track Portfolio — Enterprise Java Foundations

A recruiter-ready Java portfolio project that demonstrates practical software engineering fundamentals expected from a Junior Java Software Engineer: clean architecture, SOLID-oriented refactoring, OOP design, and quality assurance through automated testing.

## Tech Stack

- **Language:** Java 17
- **Build Tool:** Maven
- **Core Frameworks/Libraries:**
  - Spring Context (XML-based bean wiring example retained)
  - SLF4J + Logback (structured logging)
- **Testing:**
  - JUnit 5
  - Mockito
- **QA Artifacts:**
  - Postman Collection (`docs/postman/score-analytics.postman_collection.json`)

## Architecture Overview

The refactored portfolio introduces a layered architecture to reflect real backend service design:

- **Controller Layer** (`ScoreController`): entry point for use-cases.
- **Service Layer** (`ScoreAnalyticsService`): business logic and orchestration.
- **Repository Layer** (`InMemoryScoreRepository`): data access abstraction.
- **Model Layer** (`ScoreReport` record): immutable data transfer object.

### Design and OOP Principles Applied

- **Single Responsibility Principle:** each class has one focused reason to change.
- **Dependency Injection:** service depends on repository abstraction by constructor injection.
- **Immutability:** `ScoreReport` uses Java record for concise immutable modeling.
- **Input Validation:** repository guards against null/empty score arrays.
- **Logging:** service layer emits operational logs for traceability.

## Project Structure

```text
.
├── docs/
│   └── postman/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/depi/portfolio/
│   │   │   │   ├── app
│   │   │   │   ├── controller
│   │   │   │   ├── model
│   │   │   │   ├── repository
│   │   │   │   ├── service
│   │   │   │   └── basics (archived foundational exercises)
│   │   │   └── com/example1 (legacy Spring XML sample)
│   │   └── resources/
│   └── test/
│       └── java/com/depi/portfolio/service
└── pom.xml
```

## Setup & Installation

### Prerequisites

- JDK 17+
- Maven 3.9+

### Run Locally

1. Clone the repository:
   ```bash
   git clone <your-repository-url>
   cd DEPI-Tasks-Java-Track
   ```
2. Compile:
   ```bash
   mvn clean compile
   ```
3. Run tests:
   ```bash
   mvn test
   ```
4. Run the portfolio demo app:
   ```bash
   mvn -q -DskipTests exec:java -Dexec.mainClass=com.depi.portfolio.app.PortfolioApplication
   ```

## API Endpoints (Design-Ready)

> This repository currently provides a controller-oriented architecture for a future REST adapter. The following endpoint table documents the intended API contract.

| Method | Route | Description | Query Params | Response |
|---|---|---|---|---|
| GET | `/api/scores/report` | Returns max score, average score, and target score index. | `target` (int) | `ScoreReport` JSON |

## Testing & Quality Strategy

- Unit tests cover:
  - max score calculation
  - average calculation
  - search behavior (found/not found)
  - invalid input handling
- Mockito-based test demonstrates dependency isolation and service behavior verification with stubbed repository data.
- Postman collection included to demonstrate practical API testing mindset.

## Portfolio Value for Recruiters

This project demonstrates that I can:

- Refactor procedural Java into layered architecture.
- Apply modern Java (records, streams) in production-style code.
- Produce testable, maintainable code with clear package organization.
- Communicate engineering decisions in professional documentation.
