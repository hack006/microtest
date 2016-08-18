FROM gcr.io/google_appengine/openjdk8
VOLUME /tmp
ADD api.jar /api.jar
RUN sh -c 'touch /api.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/api.jar"]