try:
    print(x)   # x is not defined → NameError
except NameError:
    print("A NameError occurred! Variable is not defined.")
print("Program continues running safely.")