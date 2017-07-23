BubbleSort( int a[], int n)
Begin
    for i = 0 to n-1
        swapped = false
        for j = 0 to n-1
            if a[j] > a[j+1]
                temp = a[j]
                a[j] = a[j+1]
                a[j+1] = temp
                swapped = true
        end for
        if swapped
            break from i loop
    end for
End