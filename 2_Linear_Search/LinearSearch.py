def linearSearch(arr, x):
    for i in range(len(arr)):
        if(arr[i] == x):
            return i
    return -1

# Driver Code
arr = [5, 8, 6, 1, 9, 10]
x = 9
 
# Function call
result = linearSearch(arr, x)
if(result == -1):
    print("Element is not present in array")
else:
    print("Element is present at index", result)