count = int(input("How many Fibonacci numbers do you want? "))
a = 0
b = 1
for i in range(count):
    print(a)
    next_num = a + b
    a = b
    b = next_num