user_input = input("Enter numbers for the tuple, separated by spaces: ")
parts = user_input.split()
numbers = ()
for p in parts:
    numbers = numbers + (int(p),)
for num in numbers:
    if num % 5 == 0:
        print(num)