main(String[] args)
    var array1 as array
    var low as int = 0
    var high as int = array1.length - 1
    quickSort(array1, low, high)
quickSort(var arr as array, var low as int, var high as int)
    if (arr is null OR arr.length = 0)
        return;
    end if
    if (low >= high)
        return;
    end if
    var middle as int = (low+ high) / 2
    var pivot as int = arr[middle]
    var i as int = low
    var j as int = high
    while (i <= j)
        while (arr[i] < pivot)
            i++
        end while
        while (arr[j] > pivot)
            j--
        end while
        if ( i <=j )
            var temp as int = arr[i]
                    arr[i] = arr[j]
                    arr[j] = temp
                    i++
                    j--
        end if
    end while
    if (low < j)
        quickSort(arr, low, j)
    end if
    if (high > i)
        quickSort(arr, i, high)
    end if