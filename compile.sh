#!/bin/bash
setnano=0
while getopts "nc" flag; do
    case $flag in
        n)
        setnano=1 ;;
        c)
        setnano=2 ;;
    esac
done
shift $(( OPTIND-1 ))


if [ "$1" = "" ] ;then
    echo -e "Usage: $0 [args] <folder/filename>\n compiles file and removes it after execution \n\nArguments: \n -n: Use nano instead of vim \n -c: Compile without opening text editor"
    exit 1
fi

if [ $setnano -eq 1 ] ;then
    nano $1
elif [ $setnano -eq 2 ] ;then
    echo "Compiling $1"
else
    vim $1
fi

clang -lm $1 -o $1.out
./$1.out
rm $1.out
