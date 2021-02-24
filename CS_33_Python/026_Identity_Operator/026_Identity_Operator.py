a = 10
b = 20
c = 10
print(id(a))
print(id(b))
print(id(c))
print()

# is Operator
if a is c:
    print("a and c are Same")
else:
    print("Not Same")

# is not Operator
if a is not b:
    print("a and b are Not Same")
else:
    print("Both are Same")

"""
Output:
2074941221456
2074941221776
2074941221456

a and c are Same
a and b are Not Same
"""