FROM openjdk:8
EXPOSE 8081
ADD target/springbatch-assignment1.jar springbatch-assignment1.jar
ENTRYPOINT ["java","-jar","/springbatch-assignment1.jar"]