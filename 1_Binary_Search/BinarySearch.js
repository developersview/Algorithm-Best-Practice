// Binary Search Implementation with iterative approch
function binarySearch(array, x) {
    let low = 0;
    let high = array.length - 1;
    while (low <= high) {
        let mid = Math.floor((low + high) / 2);
        if (x === array[mid]) return mid;
        if (x < array[mid]) {
            // x is on the left side
            high = mid - 1;
        } else {
            // x is on the right side
            low = mid + 1;
        }
    }
    return -1;
}
let array = [1, 2, 5, 7, 9, 12];
console.log(binarySearch(array, 13));