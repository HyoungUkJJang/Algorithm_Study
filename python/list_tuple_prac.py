#ListPractice

#list
# a = []
# b = [1,2,3,4,5]
# c = ['zero','one','two','three']
# d = [1,2,'three',4,'five']
# e = [1,2,['hi','hello']]
# print(a)
# print(b)
# print(c)
# print(d)
# print(e)

#List index 
# a = [1,2,3,4,5]
# b = a[1] + a[4]
# print(b)
# c = a[-1]
# print(c)
# d = [1,2,3,[4,5,6]]
# e = d[-1][1]
# print(e)
# f = [1,2,[3,4,[5,6,7]]]
# g = f[2][2][1]
# print(g)

#List slice
# a = [1,2,3,4,5]
# print(a[0:3]) # String slice == list slice
# b = [1,2,3,[4,5],6]
# print(b[2:5])
# c = [1,2,3,[4,5,6,7,8]]
# print(c[3][0:3])


# List +
# a = [1,2,3,4,5]
# b = [6,7,8,9,10]
# c = a+b
# print(c)

# List repeat
# a = [1,2,3,4,5]
# b = a*3
# print(b)

# List length
# a = [1,2,3,4,5]
# #print(len(a))
# #strEx = a[1] +'HyoungUk' # error
# #print(strEx)
# strEx2 = str(a[1]) + 'HyoungUk'
# print(strEx2)
# a[1] = str(a[1]) + 'hyoungUk'
# print(a)

# List delete
# a=[1,2,3,4,5]
# del a[0]
# print(a)
# del a[:2]
# print(a)

# List funtion - append, sort, reverse, index, insert, remove, pop, count, extend
# a = [1,2,3,4,5]
# a.append(6)
# print(a)
# b = [2,6,4,7,8,10]
# print(b)
# b.sort()
# print(b)
# c = ['d','e','b','a','c']
# c.sort()
# print(c)
#d = ['c','b','a']
# d.reverse()
# print(d)
#print(d.index(1)) #error not 
# e = [1,2,3,4,5]
# print(e.index(2))
# f = [1,2,3,4,3,4,5]
# f.insert(0,0)
# print(f)
# f.remove(3)
# print(f)

# g=[1,2,3]
# print(g.pop())
# print(g.pop())
# print(g.pop())
# print(g.pop()) # error

# h = [1,2,3,4,5]
# h.pop(2)
# print(h)

# i = [1,2,3,1,4]
# print(i.count(1))

# j = [1,2,3,4,5,6,7]
# print(j)
# j.extend([8,9])
# print(j)
# k = [10]
# j.extend(k)
# print(j)


#---------------Tuple---------------------#

# tuble Practice 1

#t1 = ()
#t2 = (1,)
#t3 = (1,2,3)
#t4 = 1,2,3
#t5 = ('a','b',('ab','cd'))


#print(t4[0])
#print(t4*3)
#print(len(t3))
