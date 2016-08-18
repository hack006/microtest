FROM openjdk:8
VOLUME /tmp
ADD build/libs/attendance-service.jar /attendance-service.jar
RUN sh -c 'touch /attendance-service.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/attendance-service.jar"]