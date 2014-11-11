#!/bin/bash
mvn clean install -Dmaven.test.skip
TOMCAT_HOME=/usr/local/Cellar/tomcat/8.0.14
DEPLOY_FOLDER=${TOMCAT_HOME}/libexec/webapps
TARGET_HOME=./target
#name of the war to be deploy
NAME=$(basename `pwd`)

rm -rf ${DEPLOY_FOLDER}/*
mv ${TARGET_HOME}/*.war ${DEPLOY_FOLDER}/${NAME}.war

#start tomcat: with debug port 9090
PID=`ps aux | grep tomcat | grep -v grep | awk '{ print $2 }'`
kill -9 ${PID} 2>/dev/null
export JPDA_DEBUG="-Xdebug -Xrunjdwp:transport=dt_socket,address=9090,server=y,suspend=n"
export JAVA_OPTS="$JAVA_OPTS $JPDA_DEBUG"
${TOMCAT_HOME}/libexec/bin/startup.sh