#!/bin/bash

declare -a arr=("a" "b" "c" "d" "e" "f" "g" "h" "i" "j" "k" "l" "m" "n" "o" "p" "q" "r" "s" "t" "u" "v" "w" "x" "y" "z")

mkdir alphabet
cd alphabet
for i in "${arr[@]}"
do
   mkdir "$i"
   
   cd "$i"
   
   touch "$i".txt

   echo $(cd .. && stat -c ‘%y’ "$i") >> "$i".txt
  
   echo $(cd .. && stat --printf="%s" "$i") >> "$i".txt   
  
   echo $(pwd) >> "$i".txt

   cd ..
   # or do whatever with individual element of the array
done


