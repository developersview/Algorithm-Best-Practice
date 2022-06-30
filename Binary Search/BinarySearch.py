def binary_Search (arr, x):
    low = 0;
    high = len(arr)-1;
    mid = 0;
    while low <= high :
        mid = (low + high) // 2;
        if x == arr[mid]:
            return mid
        #if the element is the left side of array
        elif x < arr[mid]:
            high = mid - 1
        #if the element is the left side of array
        else:
            low = mid + 1
    return -1

#test array
arr = [1,5,6,8,9,10]
x = 8
#Funtion call
result = binary_Search(arr, x)

if(result != -1):
    print("The element is present in array at index : "+ str(result))
else:
    print("Element is not present in array")