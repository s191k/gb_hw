"""
Задача 14: Требуется вывести все целые степени двойки (т.е. числа вида 2k), не превосходящие числа N.
"""
def powers_of_two(n):
   powers = []
   count = 0

   while True:
      if 2**count > n: break
      elif 2**count <= n:
         powers.append(2**count)
      count += 1

   return powers
