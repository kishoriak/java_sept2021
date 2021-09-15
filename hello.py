print("hello world!!")
age=int(input("enetr number"));
if age<5:
    print("your age"+str(age),"you are in kindergarden")
    print("your age",age,"you cannot drive car")
    print("you cannot vote")
elif age>=5 and  age<12:
    print("your age"+str(age),"you are in primary")
    print("your age",age,"you cannot drive car")
    print("you cannot vote")
elif age>=12 and age<=18:
    print("your age"+str(age),"you are in high school")
    print("your age",age,"you cannot drive car")
    print("you cannot vote")
else:
    print("your age"+str(age),"you are in college")
    print("your age",age,"you can drive car")
    print("you can vote")
