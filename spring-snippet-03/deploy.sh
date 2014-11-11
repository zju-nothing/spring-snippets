#!/bin/bash
mvn clean install -Dmaven.test.skip
TOMCAT_HOME=/usr/local/Cellar/tomcat/8.0.14
DEPLOY_FOLDER=$TOMCAT_HOME/libexec/webapps
TARGET_HOME=./target
#name of the war to be deploy
NAME=$(basename `pwd`)

rm -rf $DEPLOY_FOLDER/*
mv $TARGET_HOME/*.war $DEPLOY_FOLDER/$NAME.war

#start tomcat
$TOMCAT_HOME/libexec/bin/shutdown.sh
$TOMCAT_HOME/libexec/bin/startup.sh