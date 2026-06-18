list1 = [10, 21, 4, 45, 66, 93]
list2 = [5, 12, 3, 20, 17, 24]
new_list = []
# Add odd numbers from list1
for num in list1:
    if num % 2 != 0:
        new_list.append(num)
# Add even numbers from list2
for num in list2:
    if num % 2 == 0:
        new_list.append(num)
# Add even numbers from list2
for num in list2:
    if num % 2 == 0:
        new_list.append(num)
print("New list:", new_list)