fruits = {
    "apple": 2,
    "banana": 1,
    "orange": 3,
    "grape": 4,
    "mango": 5
}
fruit = input("Enter the name of a fruit: ")
if fruit in fruits:
    print(fruit, "is available for price", fruits[fruit])
else:
    print(fruit, "is not available.")