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

| Insertion Sort                                                                      | Selection Sort                                                                                |
| ----------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --- |
| Inserts the value in the presorted array to sort the set of values in the array.    | Finds the minimum / maximum number from the list and sort it in ascending / descending order. |
| It is a stable sorting algorithm.                                                   | It is an unstable sorting algorithm.                                                          |     |
| The best-case time complexity is O(N) when the array is already in ascending order. | There is no best case the time complexity is O(N2) in all cases.                              |     |

| The number of comparison operations performed in this sorting algorithm is less than the swapping performed. | The number of comparison operations performed in this sorting algorithm is more than the swapping performed. |
| It is more efficient than the Selection sort. | It is less efficient than the Insertion sort. |
| Here the element is known beforehand, and we search for the correct position to place them. | The location where to put the element is previously known we search for the element to insert at that position. |
| The insertion sort is used when: The array is has a small number of elements, There are only a few elements left to be sorted | The selection sort is used when A small list is to be sorted, The cost of swapping does not matter, Checking of all the elements is compulsory, Cost of writing to memory matters like in flash memory (number of Swaps is O(n) as compared to O(n2) of bubble sort) |
