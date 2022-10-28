#!/bin/bash

cd /java-app
chmod 755 test-app-0.0.1-SNAPSHOT.jar
java -jar test-app-0.0.1-SNAPSHOT.jar > /dev/null 2> /dev/null < /dev/null &
