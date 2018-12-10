Build jar file: 

mvn clean package -Dmaven.test.skip=true

Execute a jar file with tests:

java -jar TC_001_Login-1.0-SNAPSHOT-jar-with-dependencies.jar testng.xml
