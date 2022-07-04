def insertionSort(arr):
    n = len(arr)
    for i in range(1, n):
        key = arr[i]
        j = i-1
        while(j >= 0 and arr[j] > key):
            arr[j+1] = arr[j]
            j -= 1
        arr[j+1] = key

# Driver code to test above
arr = [8, 9, 6, 10, 1, 2]

insertionSort(arr)
  
print("Sorted array is:")
for i in range(len(arr)):
    print("%d" % arr[i], end=" ")