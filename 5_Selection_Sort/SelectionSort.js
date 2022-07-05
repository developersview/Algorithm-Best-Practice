//Selection Sort Algorithm Implementation
function selectionSort(arr) {
    let n = arr.length;
    for (let i = 0; i < n; i++) {
        let min_index = i;
        for (let j = i + 1; j < n; j++) {
            if (arr[min_index] > arr[j]) min_index = j;
        }
        let temp = arr[min_index];
        arr[min_index] = arr[i];
        arr[i] = temp;
    }
    return arr;
}

let array = [64, 25, 12, 22, 11, 10, 89, 15];
console.log(selectionSort(array));