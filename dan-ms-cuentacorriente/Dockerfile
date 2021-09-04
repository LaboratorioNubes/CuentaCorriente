FROM openjdk:11.0.7-slim
LABEL maintainer="aleguiter9@gmail.com"
ARG JAR_FILE
ADD target/${JAR_FILE} dan-ms-cuentacorriente.jar
RUN echo ${JAR_FILE}
ENTRYPOINT ["java","-jar","/dan-ms-cuentacorriente.jar"]