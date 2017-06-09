DOCKER_REPO=smile0x90
IMAGE_NAME=hello-java

# Run everything
all: build docker-image docker-push docker-clean


# Builds jar file form source
build:
	mvn -DskipTests package

# Make a build and run a local tomcat server that listen in the port 8080
run:
	mvn -DskipTests spring-boot:run

# Builds a docker image
docker-image:
	docker build -t ${DOCKER_REPO}/${IMAGE_NAME}:${IMAGE_VERSION} .

# Pushs a docker image
docker-push:
	docker push ${DOCKER_REPO}/${IMAGE_NAME}:${IMAGE_VERSION}

docker-clean:
	docker rmi ${DOCKER_REPO}/${IMAGE_NAME}:${IMAGE_VERSION}
