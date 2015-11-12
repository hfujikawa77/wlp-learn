## execute command in Cmmand Prompt
```bat
set JAVA_HOME=<jdk installed directory>
set MAVEN_HOME=<maven installed directory>
set PATH=%MAVEN_HOME%¥bin;%PATH%

cd myWlpProject
start mvn -P derby
mvn -P flyway
mvn -P hibernate-tools

set MAVEN_REPO=<local maven repository directory>
start mvn -P was-liberty
```

## open a URL in browser
<http://localhost:8080/>

