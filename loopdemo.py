# -*- coding: utf-8 -*-
"""
Created on Wed Sep 15 13:12:13 2021

@author: anilk
"""
print("name: "+__name__)
num=int(input("enetr number"))
for i in range(10):
    print("hello",i)
    
lst=[12,23,45,12]
lst1=["one","two","three"]
for i in range(len(lst)):
    print(lst[i])
    
for num in lst:
    print(num)
 
for idx,num in enumerate(lst,start=10): #[(10,12),(11,23),(2,45)]
    print(idx,"----",num)
    
for n1,num in zip(lst,lst1):  #[(12,"one"),(),()]
    print(n1,"----",num)
    
num=10
i=0;    
while i!=num:
    print(i)
    i=i+1
    
num=9

for i in range(2,num):
    if num %i==0:
        print("num is not prime")
        #break
    print("i :",i)
else:
    print("num is prime")

  
    
    
    
    
    
    
    