def partition(arr,low,high):
    pivot=array[high]
    i = low-1
    for j in range(low,high):
        if(arr[j] <= pivot):
            i = i+ 1
            arr[i], arr[j] = arr[j], arr[i]
    
    arr[i+1], arr[high] = arr[high], arr[i+1]
    return i+1

def quickSort(arr, low, high):
    if(low < high):
        pivot_index = partition(arr, low, high)
        quickSort(arr, low, pivot_index - 1)
        quickSort(arr, pivot_index + 1, high)
    
array = [64, 25, 12, 22, 11, 10, 89, 15, 2, 101, 56, 45, 19, 34]
quickSort(array, 0, len(array) - 1)
print(array)