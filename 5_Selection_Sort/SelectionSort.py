# Selection Sort Algorithm Implementation
def selectionSort(arr):
    n = len(arr)
    for i in range(0,n):
        min_index = i
        for j in range(i+1,n):
            if(arr[min_index]>arr[j]):
                min_index=j
        arr[min_index],arr[i]=arr[i],arr[min_index]

# Driver code to test above
arr = [64, 25, 12, 22, 11, 10, 89, 15]

selectionSort(arr)
  
print("Sorted array is:")
for i in range(len(array)):
    print("%d" % arr[i], end=" ")