arr = [5, 5, 10, 10, 20]

five = ten = twenty = 0
for i in range(len(arr)):
    if arr[i] == 5:
        five += 1
    elif arr[i] == 10:
        if five:
            five -= 1
            ten += 1
        else:
            print("False")
            break
    else:  # 20 rupees
        if five and ten:
            five -= 1
            ten -= 1
            twenty += 1
        elif five >= 3:
            five -= 3
            twenty += 1
        else:
            print("False")
            break
else:
    print("True")
