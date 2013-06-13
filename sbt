#!/bin/bash

if [[ 'prod' = $1 ]]; then
  mode='prod'
else
  mode='dev'
fi

p=$PWD

PATH=$PATH:$p/../../build/lib/jdk/jdk1.7.0/bin
CLASSPATH=.:$p/../../build/lib/jdk/jdk1.7.0/lib

$p/../../build/bin/sbt
