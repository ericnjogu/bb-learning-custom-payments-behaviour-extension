# custom-payments-behaviour-extension

created with:
```shell
mvn archetype:generate -B \
  -DarchetypeArtifactId=core-service-archetype \
  -DarchetypeGroupId=com.backbase.archetype \
  -DarchetypeVersion=11.3.0 \
  -DserviceName=custom-payments-behaviour-extension \
  -Dpackage=com.enjogu.bb.learning \
  -DgroupId=com.enjogu.bb.learning \
  -DartifactId=custom-payments-behaviour-extension
```

#Getting Started
* [Extend and build](https://community.backbase.com/documentation/ServiceSDK/latest/extend_and_build)

## Dependencies

Requires a running Eureka registry, by default on port 8080.

## Configuration

Service configuration is under `src/main/resources/application.yml`.

## Running

To run the service in development mode, use:
- `mvn spring-boot:run`

To run the service from the built binaries, use:
- `java -jar target/custom-payments-behaviour-extension-1.0.0-SNAPSHOT.jar`

## Authorization

Requests to this service are authorized with a Backbase Internal JWT, therefore you must access this service via the 
Backbase Gateway after authenticating with the authentication service.

For local development, an internal JWT can be created from http://jwt.io, entering `JWTSecretKeyDontUseInProduction!` 
as the secret in the signature to generate a valid signed JWT.

## Community Documentation

Add links to documentation including setup, config, etc.

## Jira Project

Add link to Jira project.

## Confluence Links
Links to relevant confluence pages (design etc).

## Support

The official custom-payments-behaviour-extension support room is [#s-custom-payments-behaviour-extension](https://todo).
