#!/bin/sh
Str="99167fd386d8d65fe4e185c1797c821b96a9d53b"
length=${#Str}
echo "length of the String : $length"
subStr=${Str:35:40}
echo $subStr
