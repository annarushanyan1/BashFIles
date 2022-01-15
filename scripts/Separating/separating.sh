#!/bin/bash

foo=`cat file.txt`

array=()

for (( i=0; i<${#foo}; i++ ))
do
#
array+=("${foo:$i:1}")
#
done

len=${#array[@]}
word=""
count=0

for each in "${array[@]}"
do
  count=$((count+1))
  c="$each"
if [[ $c == [A-Z] ]]; then

    if [ "$word" != "" ]
  then
    echo "$word"
  fi
   word=""
   word+=$c

    if [[ "$count" == "$len" ]]
    then
    echo "$word"
    fi
elif [[ $c == [a-z] ]];then
    word+=$c
fi

done
