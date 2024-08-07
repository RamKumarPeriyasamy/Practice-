FROM openjdk:11
RUN apt-get update && apt-get install -y groovy
WORKDIR /usr/src/app
COPY . .
RUN groovyc HelloWorld.groovy
CMD ["groovy", "HelloWorld"]
