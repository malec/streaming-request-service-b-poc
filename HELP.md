# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.aa.custhub.streaming-request-service-b-poc' is invalid and this project uses 'com.aa.custhub.streamingrequestservicebpoc' instead.

# Getting Started

### Local S3 Instance Setup

`docker run --rm -it -p 4566:4566 -p 47943:47943 -e DEBUG=0 -e AWS_ACCESS_KEY_ID=key -e AWS_SECRET_ACCESS_KEY=secret -e HOST_TMP_FOLDER=tmp/localstack -e SERVICES=s3 -e AWS_DEFAULT_REGION=us-east-1 -e DOCKER_HOST=unix:///var/run/docker.sock -v ~/tmp/locastack:/tmp/localstack packages.aa.com/docker-all/localstack/localstack`

`docker run --rm -it -p 4566:4566 -p 47943:47943 -e DEBUG=0 -e AWS_ACCESS_KEY_ID=key -e AWS_SECRET_ACCESS_KEY=secret -e HOST_TMP_FOLDER=tmp/localstack -e SERVICES=s3 -e AWS_DEFAULT_REGION=us-east-1 -e DOCKER_HOST=unix:///var/run/docker.sock -v ~/tmp/locastack:/tmp/localstack packages.aa.com/docker-all/localstack/localstack-full`

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.5/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#production-ready)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

