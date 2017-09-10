# springbootevents
Sample POC to show Spring Boot Events not working in JBoss EAP 7

This project shows the failure of SpringBoot shutdown events in a JBoss EAP 7 war file.
Similarly, this shows that @PreDestroy is not called in beans as well when the application is undeployed.

Steps to reproduce.
# Build the war (mvn clean package)
# Copy the war to the standalone/deployments folder
# Undeploy the project from JBoss EAP 7

On deployment, the Spring ContextStartedEvent and @PostConstruct events are triggered (logged)
However, on undeployment, none of the Spring ContextEvents nor the @PreDestroy events are triggered.


