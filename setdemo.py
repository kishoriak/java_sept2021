# -*- coding: utf-8 -*-
"""
Created on Wed Sep 15 16:07:37 2021

@author: anilk
"""

s=set("abracadbra")
print(s)

s2=set("abu kalam")
print(s|s2)  #union s.union(s2)

print(s&s2)  #union s.intersect(s2)
print(s-s2)  #union s.intersect(s2)
print(s^s2)

if(s<s2):  #s.isSubset(s2)
    print("subset")

s1=set([12,13,10,14,12])
print(s1)

s2={23,24,25,26,12,23}
fs2=frozenset(s2)

s4=set()
s4.add(20)

#remove
pop
remove ---- delete if found otherwise throw exception
discard ---- delete if found otherwise ignore







