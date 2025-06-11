resultado = 0
for i in range(2):
    x = int(input())
    if x < 18:
        resultado += 15
    elif x < 60:
        resultado += 30
    else:
        resultado += 20

print(resultado)