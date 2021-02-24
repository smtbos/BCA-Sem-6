print("Hello\nWorld!")
print(3*"Hi ")
print("He" + "llo")
a,b = 10,20
print(a)
print(a,b)
print(a,b,sep=", ")
print([10,20,30])
print("Numebr is : %d"%20)
x = 20.114632
print("Float  = %.2f"%x)
print("Name is : %10s"%"Smit")
n1,n2,n3 = 10,20,30
print("Numbers Are : {0} {1} {2}".format(n1,n2,n3))
n = 50.663
name = "Smit"
print("Result of {name} is {:.0f} the Actual Persantage is {:.2f}".format(n,n,name=name))

"""
Output:
Hello
World!
Hi Hi Hi
Hello
10
10 20
10, 20
[10, 20, 30]
Numebr is : 20
Float  = 20.11
Name is :       Smit
Numbers Are : 10 20 30
Result of Smit is 51 the Actual Persantage is 50.66
"""