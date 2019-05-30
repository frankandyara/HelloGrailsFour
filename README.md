frank@faith:~/Code/grails4/HelloGrailsFour$ curl -H "Accept: application/json" localhost:8080/dashboard/resty.json && echo ""
{"CM":"22","BU":"80"}

frank@faith:~/Code/grails4/HelloGrailsFour$ curl -i -H "Accept: application/json" localhost:8080/dashboard/resty.json && echo ""
HTTP/1.1 200 
Content-Type: application/json;charset=UTF-8
Transfer-Encoding: chunked
Date: Thu, 30 May 2019 16:25:12 GMT

{"CM":"22","BU":"80"}

frank@faith:~/Code/grails4/HelloGrailsFour$ curl -i -H "Accept: application/json" localhost:8080/dashboard/resty && echo ""
HTTP/1.1 200 
Content-Type: application/json;charset=UTF-8
Transfer-Encoding: chunked
Date: Thu, 30 May 2019 16:25:23 GMT

{"CM":"22","BU":"80"}

frank@faith:~/Code/grails4/HelloGrailsFour$ curl -i localhost:8080/dashboard/resty && echo ""
HTTP/1.1 500 
Content-Type: text/html;charset=UTF-8
Content-Language: en-US
Transfer-Encoding: chunked
Date: Thu, 30 May 2019 16:25:38 GMT
Connection: close

<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        Grails Runtime Exception
    </title>
...
...
...

<h1>Error 500: Internal Server Error</h1>
<dl class="error-details">
<dt>URI</dt><dd>/dashboard/resty</dd>
<dt>Class</dt><dd>javax.servlet.ServletException</dd><dt>Message</dt><dd>Could not resolve view with name &#39;resty&#39; in servlet with name &#39;grailsDispatcherServlet&#39;</dd></dl><h2>Trace</h2><pre class="stack">


### GRADLE COMMANDS
Gradle Notes

./gradlew tasks
List of available tasks

**/   ==   ./gradlew 

### Application tasks  

**/bootRun
bootRun - Runs this project as a Spring Boot application.

### Build tasks

**/bootJar
Assembles an executable jar archive containing the main classes and their dependencies.

**/bootWar
Assembles an executable war archive containing webapp content, and the main classes and their dependencies.

**/build
Assembles and tests this project.

**/clean
Deletes the build directory.

**/jar
Assembles a jar archive containing the main classes.

**/testClasses
Assembles test classes.

**/war
Generates a war archive with all the compiled classes, the web-app content and the libraries.

### Documentation tasks

**/groovydoc
Generates Groovydoc API documentation for the main source code.

**/javadoc
Generates Javadoc API documentation for the main source code.


### IDE tasks

**/cleanIdea
Cleans IDEA project files (IML, IPR)

**/idea
Generates IDEA project files (IML, IPR, IWS)

**/openIdea
Opens the IDEA project

### Verification tasks

**/check
Runs all checks.

**/integrationTest
This might be "Runs all integration checks."

**/test
Runs the unit tests.