user_input = input("Enter numbers separated by spaces: ")
parts = user_input.split()
numbers = []
for p in parts:
    numbers.append(int(p))
if numbers[0] == numbers[-1]:
    print(True)
else:
    print(False)