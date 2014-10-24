for file in "$@"
do
    scp $file soulanillem@crashwhite.polytechnic.org:turnin
    #echo $file
done
