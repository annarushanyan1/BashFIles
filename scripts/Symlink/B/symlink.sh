#!/bin/bash

touch A.txt
touch B.txt
touch C.txt

cd ..

mkdir A

cd A

ln -s ../B/A.txt A_s.txt

ln -s ../B/B.txt B_s.txt

ln -s ../B/C.txt C_s.txt

echo "done"
