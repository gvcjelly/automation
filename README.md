<h2>Setup Environment</h2>
<ul>
<li>JDK and JAVA_HOME.
 <small>Information how to install and configure can be fount <a href="https://www.mkyong.com/maven/how-to-install-maven-in-windows/">here</a>.</small>
<p>
<li>Apache Maven. <small><a href="https://www.mkyong.com/maven/how-to-install-maven-in-windows/">Link</a> with information how to install.</small>
<p>
</ul>
<h2>Build executable jar file</h2>
<p>
[1] Start <i>cmd</i>.
<p>
[2] Navigate to the project workspace folder.<small><i> example: cd C:/TEST_GVC</i></small>
<p>
[3] Run maven command with true/false flag for skipping the tests while building.
<i>mvn clean package -Dmaven.test.skip=true</i>

<h2>Run tests by executing jar file</h2>
<p>
[1] Open <i>target</i> folder in cmd.
<p>
[2] Run command for executing jar file with the project dependencies with xml file.
<i><small> examlpe: java -jar TC_001_Login-1.0-SNAPSHOT-jar-with-dependencies.jar testng.xml</small></i>


