1. execute command in Cmmand Prompt <br>
```bat
set JAVA_HOME=<jdk installed directory>
set MAVEN_HOME=<maven installed directory>
set PATH=%MAVEN_HOME%¥bin;%PATH%

cd myWlpProject
start mvn -P derby
mvn -P flyway
mvn -P hibernate-tools

set MAVEN_REPO=<local maven repository directory>
mvn install
start mvn -P was-liberty
```

2. open a URL in browser <br>
<http://localhost:8080/myWlpProject-1.0-SNAPSHOT/faces/index.xhtml>

