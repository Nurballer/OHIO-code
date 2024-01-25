import math

a = float(input())
b = float(input())
c = float(input())

D = (b**2) - (4*a*c)
if D < 0:
    print("answers not found")
elif D = 0:
    x = (-b + math.sqrt(D))/(2*a)
    print(f"one root found: {x}")
else D > 0:
    x1 = (-b - math.sqrt(D))/(2*a)
    x2 = (-b + math.sqrt())
    print(f"two roots found: {x1}, {x2}")


f = open("C:/Users/Нурбол Сембаев/Desktop/TEST2.txt", "r")
res = []
content = f.read()
words = content.split()
max = 0
for word in words:
        if len(word) > max:
                max = len(word)
for word in words:
        if len(word) == max:
                res.append(word)
for word in res:
        print(word, end = " ")
f.close()


x_list = list(map(int, input().split()))
y_list = list(map(int, input().split()))

x_bar = sum(x_list) / len(x_list)
y_bar = sum(y_list) / len(y_list)

m = sum([(x_list[i] - x_bar) * (y_list[i] - y_bar) for i in range(len(x_list))]) / sum([(x_list[i] - x_bar) ** 2 for i in range(len(x_list))])
b = y_bar - m * x_bar

print(f"y = {m:.2f}x + {b:.2f}")
