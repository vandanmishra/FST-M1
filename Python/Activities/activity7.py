user_input = input("Enter numbers separated by spaces: ")
parts = user_input.split()
total = 0
for p in parts:
    total += int(p)
print("The sum is:", total)