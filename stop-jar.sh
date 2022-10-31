#!/bin/bash

if [[ $(lsof -t -i:9191) -gt 0 ]] 
then
kill -9 $(lsof -t -i:9191)
fi
