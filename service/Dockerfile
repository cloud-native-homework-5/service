FROM openjdk:8u262-jre-slim-buster
ADD ./target/cloudnative-0.0.1-SNAPSHOT.jar /app/service.jar
ADD runboot.sh /app/
WORKDIR /app
RUN chmod a+x runboot.sh
CMD /app/runboot.sh