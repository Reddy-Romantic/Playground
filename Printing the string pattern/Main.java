a=input().strip()
a=a[len(a)//2:]+a[:len(a)//2]
for i in range(1,len(a)):
  print(' '*(len(a)-i)+a[:i])
print(a)