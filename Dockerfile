FROM sgrio/java-oracle
MAINTAINER Raj Swarnam (kalairajan@gmail.com)
COPY ${project.artifactId}-${project.version}.jar /usr/src/hola
WORKDIR /usr/src/hola
EXPOSE 8080
CMD ["java", "jar", "${project.artifactId}-${project.version}.jar"]