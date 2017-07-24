function main(Strings[] args)
   var left as int = 0
   var right as int = n-1
   mergeSort(array, left, right)
   
function mergeSort( var a as array, var left as int, var right as int )
   
   var middle as int = (left+right)/2
   
   if ( left < right ) 
       mergeSort left sub array
       mergeSort(a, left, middle)
       mergeSort right sub array
       mergeSort(a, middle+1, right)
       merge the sub arrays
       merge(a, left, middle, right)
   end if

function merge( var a as array, var left as int, var middle as int, var right as int)
   //find sizes of the sub arrays
   var n1 as number of left half
   var n2 as number of right half

   //create temp arrays
   var Left and Right as array 
   
   //copy data to them
   for i = 0 to n1
       Left[i] = arr[left + i]
   for j = 0 to n2
       Right[j] = arr[middle + 1 + j]
       
   //merge temp arrays
   var i and j as int
   var k as int = left
   
   while ( i < n1 AND j < n2 )
      if ( Left[i] <= Right[j] )
         arr[k] = Left[i]
         i++
      else
         arr[k] = Right[j]
         j++
      end if
      k++
   end while
   
   while ( i < n1 )
      arr[k] = Left[i]
      i++
      k++
   end while
   
   while ( j < n2 )
      arr[k] = Right[j]
      j++
      k++
   end while
END