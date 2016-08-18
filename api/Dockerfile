FROM openjdk:8
VOLUME /tmp
ADD build/libs/api.jar /api.jar
RUN sh -c 'touch /api.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/api.jar"]