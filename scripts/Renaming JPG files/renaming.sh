#!/bin/bash

cd "/Users/annaarushanyan/desKTOP/ITC/scripts/Renaming JPG files/papka"
array=($(find . -type f -name "*.jpg"))

len=${#array[@]}
count=0
declare -a newArray

for j in "${array[@]}"
do
	newname=$(echo "$j" | sed 's/^..//')
	echo $newname
	newArray[$count]="$newname"
	((count=count+1))
done

for i in "${newArray[@]}"
do
        name=$(date +%F)-"$i"
        mv "$i" $name
	echo "$i"
done
