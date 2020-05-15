list = [2,7,5,64,14]
odd = 0
even = 0
length=len(list)
i=0
while i < length:
        if not list[i] % 2:
    	     even+=1
        else:
    	     odd+=1
        i= i+1
print("Even=",even,",Odd=",odd)
