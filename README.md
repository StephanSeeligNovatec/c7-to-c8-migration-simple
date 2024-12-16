# Migration C8 Model:

https://github.com/camunda-community-hub/camunda-7-to-8-migration/tree/main/backend-diagram-converter/webapp

docker run --name diagram-converter -p 8080:8080 ghcr.io/camunda-community-hub/camunda-7-to-8-migration/diagram-converter:latest

## Ändern des C8 Adapter

# TODOS
[] Migration der Tests aufzeigen
[] DMN
[] Performance Vergleich
[] Frage Undeployment oder wie auf C7 die alte Instanz loswerden? Vielleicht erwähnen, den Controller für C7 dann deaktivieren, oder sogar C7 auf C8 weiterleiten?
[] Task
[] Umgang alte Prozess auf C7 Instanz/DB?
[] Gegenüberstellung von den Komponenten die mit der Engine kommunizieren - Architektur Hexagonale Architektur
[] 


# Weiter Links
## Basis für diesen Test: https://github.com/camunda/camunda-8-get-started-spring
## Kleine hilfe aber teilweise schon outdated: https://github.com/lwluc/camunda-ddd-and-clean-architecture/pull/1
## Archoved aber noch hilfreich: https://github.com/camunda-community-hub/spring-zeebe?tab=readme-ov-file#deploy-process-models
## C8 getting started: https://docs.camunda.io/docs/guides/getting-started-java-spring/#step-3-deploy-your-process

## Testing: 
## Java21 embedded statt container: https://docs.camunda.io/docs/apis-tools/java-client/zeebe-process-test/#embedded-jdk-21

