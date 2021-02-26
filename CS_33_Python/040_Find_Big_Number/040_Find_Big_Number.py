a = int(input("Value 1 : "))
b = int(input("Value 2 : "))
c = int(input("Value 3 : "))

if a>b and a>c:
    print(a, "is Big")
elif b>a and b>c:
    print(b, "is Big")
else:
    print(c, "is Big")

"""
Output:
Value 1 : 10
Value 2 : 11
Value 3 : 5
11 is Big
"""