//Linear Search Algorithm implementation
function linearSearch(arr, x) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === x) return i;
    }
    return -1;
}
let array = [5, 8, 6, 1, 9, 10];
let key = 1;
let result = linearSearch(array, key);
if (result != -1) {
    console.log(`The number ${key} is in the position of ${result}`);
} else {
    console.log(`The number ${key} is not present in the array`);
}