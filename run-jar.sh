#!/bin/bash

echo $(pwd)
cd /java-app
echo $(pwd)
chmod 777 test-app-0.0.1-SNAPSHOT.jar
echo $(ll)
java -jar test-app-0.0.1-SNAPSHOT.jar > log.txt
