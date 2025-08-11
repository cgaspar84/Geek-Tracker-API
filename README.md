# Geek-Tracker API

Basic project structure for the Geek Tracker API. This repository contains
placeholders for controllers, domain services, infrastructure adapters and
configuration, along with Docker and CI setup.

## Structure

- `api/` - controllers, DTOs and mappers
- `domain/` - domain entities and services
- `infra/` - repositories, configuration and external adapters
- `src/main/resources/`
  - `application.yml` - Spring Boot configuration
  - `db/migration/` - Flyway migrations
- `docker/`
  - `Dockerfile`
  - `docker-compose.yml`
- `.github/workflows/ci.yml` - GitHub Actions workflow
