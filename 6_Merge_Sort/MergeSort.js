function merge(arr, l, m, r) {
    //find size of two temp subarray to be merged
    let n1 = m - l + 1;
    let n2 = r - m;

    //create temp subarrays
    let L = new Array(n1);
    let R = new Array(n2);

    //copy data to temp arrays
    for (let i = 0; i < n1; i++) {
        L[i] = arr[l + i];
    }
    for (let j = 0; j < n2; j++) {
        R[j] = arr[m + 1 + j];
    }

    /* merge two subarray */

    //initial index for 1st and 2nd subarray
    let i = 0,
        j = 0;
    //initial index of merged array
    let k = l;
    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
        } else {
            arr[k] = R[j];
            j++;
        }
        k++;
    }

    //copy any remaining element of 1st subarray
    while (i < n1) {
        arr[k] = L[i];
        k++;
        i++;
    }
    //copy any remaining element of 1st subarray
    while (j < n2) {
        arr[k] = R[j];
        k++;
        j++;
    }
}

function sort(arr, l, r) {
    if (l < r) {
        //find the mid point
        let m = parseInt((l + r) / 2);

        //sort the 1st and 2nd half values
        sort(arr, l, m);
        sort(arr, m + 1, r);
        //merge two subarray
        merge(arr, l, m, r);
    }
}

//driver code
let array = [64, 25, 12, 22, 11, 10, 89, 15, 2, 101, 56, 45];
sort(array, 0, array.length - 1);
console.log(array);