# Error Solve

# try :
#     4/0
# except ZeroDivisionError as e :
#     print(e)

# try :
#     a=[1,2]
#     print(a[3])
#     4/0
# except ZeroDivisionError as e :
#     print("0 Division XXXX")
# except IndexError as e :
#     print("Not Index")
# finally :
#     print("---END---")

# try :
#     a=[1,2]
#     print(a[3])
#     4/0
# except (ZeroDivisionError, IndexError) as e :
#     print("0 Division XXXX & not Index")
# finally :
#     print("---END---")

# raise practice
# class bird :
#     def fly(self) :
#         raise NotImplementedError

# eagle = bird()
# eagle.fly()
