# -*- coding: utf-8 -*-
"""
Created on Wed Sep 15 16:23:52 2021

@author: anilk
"""



#use list of products and every product is a dictionary
plist=[]
def acceptData():
    #accept data
    pid=int(input("eneter id"))
    pname=input("enetr name")
    price=float(input("enter price"))
    qty=int(input("enetr quantity"))
    #create dictionary
    p={}
    p["pid"]=pid
    p["name"]=pname
    p["qty"]=qty
    p["price"]=price
    #add into list
    plist.append(p)
    print(plist)
    
#search By id    
def findProduct(pid):
    for p in plist:
        if(p["pid"]==pid):
            return p
    else:
        return None

def updateProduct(id,lst):
     p=findProduct(pid) 
     if p!=None:   #lst=["qty:3","description:kjdfsjd","price:4565"]
         for data in lst:
             element=data.split(":")
             v=p.get(element[0])
             if v!=None:
                 ans=input("key exists, overwrite(y/n)")
                 if ans=="y":
                     p[element[0]]=element[1]
             else:
                p[element[0]]=element[1]
             
         return p
     else:
         return None

def deleteProduct(pid):
    prod=findProduct(pid) 
    if prod!=None:
        plist.remove(prod)
        return True
    else:
        return False
    
import sys
choice=0
while choice!=5:
    print("1. add product\n2. find product\n3.update product\n4. delete product\n5.exit")
    choice=int(input("enetr choice"))
    if choice==1:
       acceptData()       
    elif choice==2:
        pid=int(input("enetr pid"))
        prod=findProduct(pid)
        if prod!=None:
            print(prod)
        else:
            print("not found")
     
    elif choice==3:
        pid=int(input("enetr id"))
        lst=[]
        ans="y"
        while ans!="n":
            data=input("enetr key-value pair for modification")
            lst.append(data)
            ans=input("continue(y/n)")
            
            #lst=["qty:3","description:kjdfsjd","price:4565"]
        prod=updateProduct(id,lst)
        if prod!=None:
            print(prod)
        else:
            print("not found")
        pass
    elif choice==4:
        pid=int(input("enetr id"))
        status=deleteProduct(pid)
        if status:
            print("deletecd successfully")
        else:
            print("not found")
    elif choice==5:
        print(plist)
        sys.exit(0)
     
        
