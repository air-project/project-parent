call mvn install:install-file -DgroupId=com.microsoft.sqlserver -DartifactId=sqljdbc4 -Dversion=4.0 -Dpackaging=jar -Dfile=sqljdbc4.jar
call mvn install:install-file -DgroupId=com.travelsky.ebuild -DartifactId=ibeclient -Dversion=2.2 -Dpackaging=jar -Dfile=ibeclient.jar
call mvn install:install-file -DgroupId=org.springframework -DartifactId=org.springframework.web.servlet -Dversion=3.2.4.RELEASE -Dpackaging=jar -Dfile=org.springframework.web.servlet-3.2.4.RELEASE.jar
pause
pause