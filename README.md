# Spring Boot with Spring Batch Example 1
## Load CSV to DB
- `http://localhost:8081/load` - Trigger point for Spring Batch
- `http://localhost:8081/h2-console` - H2 Console for querying the in-memory tables.

## H2 Config
- `testdb` - Database.
- `sa` - User
- `password` - Password.

1) Issues faced:-
  - While running the Docker commands in CMD I faced an exception saying "JavaRunTime Version". It was saying to use lower version i.e 52. I was using version 59.
2) Solution:-
  - For the issue faced I went to my STS and then selected the project and directed to the BUILD PATH. There I selected JDK8. Initially it was JDK15. So afetr selecting the right JDK I rerun the code and then again tried to rerun the Docker command. It successfully ran.
