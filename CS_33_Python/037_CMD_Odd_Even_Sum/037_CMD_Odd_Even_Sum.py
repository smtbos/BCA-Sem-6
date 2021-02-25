print("Even Sum =",sum([x for x in [int(y) for y in __import__('sys').argv[1:]] if x%2 == 1]))
print("Odd  Sum =",sum([x for x in [int(y) for y in __import__('sys').argv[1:]] if x%2 == 0]))

"""
Output:
$ python 037_CMD_Odd_Even_Sum.py 1 2 3 4 5
Even Sum = 9
Odd  Sum = 6
"""