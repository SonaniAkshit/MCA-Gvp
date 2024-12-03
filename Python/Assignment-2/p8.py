# Write a programme to Print file
# contents, copy a file and read-write a
# file.

import sys

myfile=open(sys.argv[1],"r")
r=myfile.read()
print("first file read\n")
print(r)
myfile.close()

print("second file read\n")
myfile=open(sys.argv[2],"w+")
myfile.write(r)
myfile.seek(0)
print(myfile.read())
myfile.close()