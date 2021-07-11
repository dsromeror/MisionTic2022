import math

nombres_productos=[]
precios=[]

n = int(input("Digite la cantidad de productos: "))

for x in range(n):
    nom=str(input("Ingrese el nombre del producto: "))
    nombres_productos.append(nom)
    precio=int(input("Ingrese el precio: "))
    precios.append(precio)

total=sum(precios)

if 150000>total:
	descuento=0
elif 300000>total>=150000:
	descuento = total*0.1
elif 700000>total>=300000:
	descuento = total*0.15
elif total>700000:
	descuento = total*0.20

print("Centro Comercial Unaleño \nCompra más y Gasta Menos \nNIT: 899.999.063")
for x in range(n):
  print(nombres_productos[x], "$"+str(precios[x]))

print("Total: $"+str(math.ceil(total-descuento)))
print("En esta compra tu descuento fue $"+str(int(descuento)) ,"\nGracias por tu compra")