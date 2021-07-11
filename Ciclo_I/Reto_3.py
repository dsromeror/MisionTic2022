import math
nombres_productos=[]
cantidad=[]
precios=[]
subtotal=[]
bandera=True

while bandera:
  entrada=input()
  comando=entrada.split("&")
  item=comando[0]
  if item==str(1):
    articulo=comando[1]
    cant=int(comando[2])
    precio=int(comando[3])
    sub=(cant*precio)
    nombres_productos.append(articulo)
    cantidad.append(cant)
    precios.append(precio)
    subtotal.append(sub)
  elif item==str(2):
    cedula=comando[1]
    total=sum(subtotal)
    if total<150000:
      descuento=0
    elif 150000<=total<=300000:
      descuento = total*0.1
    elif 300000<total<700000:
      descuento = total*0.15
    elif 700000<=total:
      descuento = total*0.20
    print("Centro Comercial Unaleño \nCompra más y Gasta Menos \nNIT: 899.999.063"+"\nCliente: "+str(cedula)+"\nArt Cant Precio")
    for x in range(len(nombres_productos)):
      print(nombres_productos[x], "x"+str(cantidad[x]),"$"+str(precios[x]*cantidad[x]))
    print("Total: $"+str(math.ceil(total-descuento)))
    print("En esta compra tu descuento fue $"+str(int(descuento)) ,"\nGracias por tu compra\n---")
    nombres_productos=[]
    cantidad=[]
    precios=[]
    subtotal=[]
  elif item==str(3):
    bandera = False
  else:
    print(item)