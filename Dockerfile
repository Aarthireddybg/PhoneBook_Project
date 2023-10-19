FROM openjdk
MAINTAINER aarthi123
WORKDIR /app
COPY target/Phonebook.jar /app/Phonebook.jar
ENTRYPOINT ["java","-jar","Phonebook.jar"]