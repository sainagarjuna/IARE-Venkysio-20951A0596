#radix sort in python
def radix_sort(a):
    big=max(a)
    size=len(str(big))
    res_arr=[]
    
    for i in range(size):
        
        buckets=[[] for j in range(10)]
        
        for num in a:
            digit_value=(num//10**i)%10
            buckets[digit_value].append(num)
            
            
        # Concatenate the buckets in order to form the sorted array for this digit
        for bucket in buckets:
            res_arr.extend(bucket)
    return res_arr
    

a=list(map(int,input().split()))
res=radix_sort(a)
print(res)
