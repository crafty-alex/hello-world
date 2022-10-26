#!/bin/bash

cd /java-app
chmod 777 test-app-0.0.1-SNAPSHOT.jar
java -jar test-app-0.0.1-SNAPSHOT.jar > log.txt
