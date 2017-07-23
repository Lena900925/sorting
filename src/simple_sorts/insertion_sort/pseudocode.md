function insertionSort(array a)
    for i = 0 to a.length - 1 do
        j = i + 1
        tmp = a[j]
        while j > 0 AND tmp > a[j-1] do //create a gap
            a[j] = a[j-1]
            j--
        end while
        a[j] = tmp //insert
    end for