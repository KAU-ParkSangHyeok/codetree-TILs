arr1 = [list(map(int, input().split())) for _ in range(3)]
input()
arr2 = [list(map(int, input().split())) for _ in range(3)]

arr3 = [[arr1[i][j] * arr2[i][j] for j in range(3)] for i in range(3)]
for row in arr3:
    for el in row:
        print(el, end= " ")
    print()