# Java Spec Mesh Example

### Introduction

### Requirements
- Terraform CLI [install here](https://learn.hashicorp.com/tutorials/terraform/install-cli)
- Java / Maven
- Docker / Docker Compose

### Development
If you are looking to build on top of or add to this project, follow these steps to get up and running:
```shell

# startup docker-compose 
docker-compose up -f docker/docker-compose.yml

# run the provisioner
mvn exec:java -Dexec.mainClass="io.specmesh.sampleMain"
```

### Testing / Deploying
```shell
mvn clean install
```
