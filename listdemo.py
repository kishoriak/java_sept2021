# -*- coding: utf-8 -*-
"""
Created on Wed Sep 15 15:47:46 2021

@author: anilk
"""

lst=[12,34,56]
#add in the list
lst.append(55)
lst.append("kishori")
lst.append([23,24,35])
print(lst)
lst.extend([22,33,44,55])
print(lst)
lst.insert(1,500)
lst[3]=3333

lst=[12,12,13,33,44,22,12]
print(lst.count(12))

lst=[12,12,13,33,44,22,12]
lst.pop(5)
del(lst[5])

lst.remove(13)



