# Algorithm-Best-Practice

> This repo is for all the Algorithm concepts

## Binary Search

- Time Complexity : Olog(n)
- Illustration:

  ![image](https://github.com/developersview/Algorithm-Best-Practice/blob/master/_Images/BinarySearch.png)

## Linear Search

- Time Complexity : O(n)
- Illustration:

  ![image](https://github.com/developersview/Algorithm-Best-Practice/blob/master/_Images/Linear-Search.png)

---

## Bubble Sort

> Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. This algorithm is not suitable for large data sets as its average and worst case time complexity is quite high.

- Time Complexity : For Worst and Avergae - O(n2), for Best O(n)
- Illustration:

![image](https://github.com/developersview/Algorithm-Best-Practice/blob/master/_Images/BubbleSort.png)

## Insertion Sort

> Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.

- Time Complexity : For Worst and Avergae - O(n2), for Best O(n)
- Illustration:

![image](https://github.com/developersview/Algorithm-Best-Practice/blob/master/_Images/insertionsort.png)

## Selection Sort

> The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
> The subarray which is already sorted.
> Remaining subarray which is unsorted.

- Time Complexity : For Worst and Avergae - O(n2)
- Illustration:

![image](https://github.com/developersview/Algorithm-Best-Practice/blob/master/_Images/selectionsort.png)

| Insertion Sort                                                                                                                | Selection Sort                                                                                                                                                                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Inserts the value in the presorted array to sort the set of values in the array.                                              | Finds the minimum / maximum number from the list and sort it in ascending / descending order.                                                                                                                                                                        |
| It is a stable sorting algorithm.                                                                                             | It is an unstable sorting algorithm.                                                                                                                                                                                                                                 |
| The best-case time complexity is O(N) when the array is already in ascending order.                                           | There is no best case the time complexity is O(N2) in all cases.                                                                                                                                                                                                     |
| The number of comparison operations performed in this sorting algorithm is less than the swapping performed.                  | The number of comparison operations performed in this sorting algorithm is more than the swapping performed.                                                                                                                                                         |
| It is more efficient than the Selection sort.                                                                                 | It is less efficient than the Insertion sort.                                                                                                                                                                                                                        |
| Here the element is known beforehand, and we search for the correct position to place them.                                   | The location where to put the element is previously known we search for the element to insert at that position.                                                                                                                                                      |
| The insertion sort is used when: The array is has a small number of elements, There are only a few elements left to be sorted | The selection sort is used when A small list is to be sorted, The cost of swapping does not matter, Checking of all the elements is compulsory, Cost of writing to memory matters like in flash memory (number of Swaps is O(n) as compared to O(n2) of bubble sort) |

## Merge Sort

> The Merge Sort algorithm is a sorting algorithm that is considered as an example of the divide and conquer strategy. So, in this algorithm, the array is initially divided into two equal halves and then they are combined in a sorted manner. We can think of it as a recursive algorithm that continuously splits the array in half until it cannot be further divided. This means that if the array becomes empty or has only one element left, the dividing will stop, i.e. it is the base case to stop the recursion. If the array has multiple elements, we split the array into halves and recursively invoke the merge sort on each of the halves. Finally, when both the halves are sorted, the merge operation is applied. Merge operation is the process of taking two smaller sorted arrays and combining them to eventually make a larger one.

- Time Complexity : For Best, Worst and Average - O(n\*log n)
- Illustration:

![image](https://github.com/developersview/Algorithm-Best-Practice/blob/master/_Images/Merge-Sort.png)

#### Algorithm

- Declare left variable to 0 and right variable to n-1
- Find mid by medium formula. mid = (left+right)/2
- Call merge sort on (left,mid)
- Call merge sort on (mid+1,rear)
- Continue till left is less than right
- Then call merge function to perform merge sort.

## Quick Sort

> QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.

- Always pick first element as pivot.
- Always pick last element as pivot (implemented below)
- Pick a random element as pivot.
- Pick median as pivot.

- Time Complexity : For Worst case - O(n2) and for Best and Average - O(n\*log n)
- Illustration:

![image](https://github.com/developersview/Algorithm-Best-Practice/blob/master/_Images/QuickSort.png)
