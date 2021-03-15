f1 = 0
f2 = 1
for i in range(20):
    if i == 0:
        print(f1)
    elif i == 1:
        print(f2)
    else:
        f3 = f1+f2
        print(f3)
        f1 = f2
        f2 = f3