#!/usr/bin/python

import os, sys, mmap

# Open a file
fd = os.open( "testfile", os.O_RDWR|os.O_CREAT|os.O_DIRECT )

m = mmap.mmap(-1, 512)

for i in range (1,1000):
   os.lseek(fd,os.SEEK_SET,0)
   m[1] = "1"
   os.write(fd, m)
   os.fsync(fd)

# Close opened file
os.close( fd )