print("for loop with range")
for i in range(5):
    print(i,end=' ')

print("\n\nfor loop with list")
l = [10,20,50]
for i in l:
    print(i,end=' ')

print("\n\nfor loop with dictionary")
d = {"smit":60, "urmil": 75}
for x in d.keys():
    print(x, d[x])

print("\n\nfor loop with dictionary using items()")
for x,y in d.items():
    print(x, y)

"""
Output:
for loop with range
0 1 2 3 4 

for loop with list
10 20 50

for loop with dictionary
smit 60
urmil 75


for loop with dictionary using items()
smit 60
urmil 75
"""