A - an array containing the list of numbers
numItems - the number of numbers in the list

for i = 0 to numItems - 1
    for  j = i+1 to numItems               
        if A[i] > A[j]
            // Swap the entries
            Temp = A[i]
            A[i] = A[j]
            A[j] = Temp          
        End If    
    Next j
Next i