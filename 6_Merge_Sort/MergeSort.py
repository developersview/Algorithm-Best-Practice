def mergeSort(arr):
    if len(arr)>1:
        # Finding the mid of the array
        mid = len(arr)//2
        
        # Dividing the array elements
        L=arr[:mid]
        R=arr[mid:]
        
        # Sorting the first half
        mergeSort(L)
        
        # Sorting the second half
        mergeSort(R)
        
        i=j=k=0
        
        # Until we reach either end of either L or M, pick larger among
        # elements L and M and place them in the correct position at A
        while i<len(L) and j<len(R):
            if L[i]<=R[j]:
                arr[k]=L[i]
                i+=1
            else:
                arr[k]=R[j]
                j+=1
            k+=1
        
        
        # Checking if any element was left
        while i < len(L):
            arr[k] = L[i]
            i += 1
            k += 1
 
        while j < len(R):
            arr[k] = R[j]
            j += 1
            k += 1


# Driver code to test above
array = [64, 25, 12, 22, 11, 10, 89, 15, 2, 101, 56, 45]

mergeSort(array)

print(array)