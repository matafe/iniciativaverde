Projecto Iniciativa Verde:

http://federicovignati.blogspot.com/


======================
Openshift Dev Notes

We have 2 remote repositories here: origin (github) and openshift

-Install the libs that do not has on maven repo via ssh (only first time):
mvn install:install-file -Dfile=app-root/repo/etc/lib-ext/spring-test-dbunit-1.1.1-SNAPSHOT.jar -DgroupId=com.github.springtestdbunit -DartifactId=spring-test-dbunit -Dversion=1.1.1-SNAPSHOT -Dpackaging=jar

To publish code changes:
git add .
git commit -a -m 'commit message'
git push openshift HEAD
