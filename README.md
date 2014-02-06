Projecto Iniciativa Verde:

http://federicovignati.blogspot.com/


======================
Openshift Dev Notes
- Install the libs that do not has on maven repo:
SSH 
mvn install:install-file -Dfile=app-root/repo/spring-test-dbunit-1.1.1-SNAPSHOT.jar -DgroupId=com.github.springtestdbunit -DartifactId=spring-test-dbunit -Dversion=1.1.1-SNAPSHOT -Dpackaging=jar
