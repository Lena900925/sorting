BubbleSort( int a[], int n)
Begin
    for i = 1 to n-1
        sorted = true
        for j = 0 to n-1-i
            if a[j] > a[j+1]
                temp = a[j]
                a[j] = a[j+1]
                a[j+1] = temp
                sorted = false
        end for
        if sorted
            break from i loop
    end for
End