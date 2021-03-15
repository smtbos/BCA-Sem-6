def sum(a,b):
    return a+b

print("Sum = ", sum(10,13))


def odd_or_even(n):
    if n%2 == 0:
        return "Even"
    return "Odd"

print(5,"id",odd_or_even(5))


def fact(n):
    foo = 1
    for i in range(1,n+1):
        foo *= i
    return foo

print("Factorial of 5 = ",fact(5))


def ssmd(a,b):
    return a+b, a-b, a*b, a/b

[print(i,end=' ') for i in ssmd(10,5)]

print()
def city(nm, ci):
    return nm+" "+ci

print(city("Smit","Damnagar"))

def prod(name, price=10):
    print(name,"=",price)

prod("Sugar", 40) #Positional

prod(name="Oil",price=80.50) #Keyword

prod(price=5,name="Parle G") #Keyword

prod("Solted Wafers") #Default

def lsum(*ns):
    sm = 0
    for i in ns:
        sm+=i
    print("Sum of List =",sm)

lsum(10,25,30,80)

"""
Output:
Sum =  23
5 id Odd
Factorial of 5 =  120
15 5 50 2.0
Smit Damnagar
Sugar = 40
Oil = 80.5
Parle G = 5
Solted Wafers = 10
Sum of List = 145
"""