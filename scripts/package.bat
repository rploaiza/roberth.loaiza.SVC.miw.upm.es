@echo off
set workspace=D:\MASTER\Ingenieria web vision general\workspace\eclipse\roberth.loaiza.svc.miw.upm.es
::Las variables de entorno se pueden configurar directamente en Windows cuando se tienen los permisos necesarios
set JAVA_HOME=D:\Program Files\Java\jdk1.8.0_131
set M2_HOME=D:\Program Files\apache-maven-3.5.0\bin
set PATH=%PATH%;%JAVA_HOME%\bin;%M2_HOME%\bin
echo -----------------------------------------
echo . (C) MIW - UPM
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo JAVA_HOME --- %JAVA_HOME%
echo M2_HOME   --- %M2_HOME%
echo .
d:
cd %workspace%

echo ============ mvn clean test (profile: develop) =======================================================
echo .
call mvn clean test --settings settings.xml

echo ============ mvn -Dmaven.test.skip=true package (profile: preproduction) =======================================================
echo .
call mvn -Dmaven.test.skip=true -Denvironment.type=preproduction package 

pause
