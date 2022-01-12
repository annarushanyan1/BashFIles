#!/bin/bash

array=("$@")

for structure in "${array[@]}"
do
        mkdir $structure
        cd $structure
done

