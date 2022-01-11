#!/bin/bash

PATH=$1

if [ -d "${PATH}" ] ; then
    echo "$PATH is a directory";
else
    if [ -f "${PATH}" ]; then
        echo "${PATH} is a file";
    else
        echo "${PATH} is not valid";
        exit 1
    fi
fi

