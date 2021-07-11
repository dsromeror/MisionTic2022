import math

def descuento(total):
  if total<150000:
    descuento=0
  elif 150000<=total<=300000:
    descuento = total*0.1
  elif 300000<total<700000:
    descuento = total*0.15
  elif 700000<=total:
      descuento = total*0.20
  return(descuento)
  
entrada = input()
import urllib.request, json 
with urllib.request.urlopen(entrada) as url:
    data = json.loads(url.read().decode())

for i in range(len(data)):
  cliente = data[i].get('cliente')
  productos = data[i].get('productos')
  print("Centro Comercial Unaleño \nCompra más y Gasta Menos \nNIT: 899.999.063"+"\nCliente: "+str(cliente)+"\nArt Cant Precio")
  subtotal=[]
  for j in range(len(productos)):
    nombre = productos[j].get('nombre')
    cantidad = productos[j].get('cantidad')
    precio = productos[j].get('precio unitario')
    sub = cantidad * precio
    subtotal.append(sub)
    total=sum(subtotal)
    #print(descuento(total))
    print(nombre, "x"+ str(cantidad), "$"+str(cantidad*precio))
  print("Total: $"+str(math.ceil(total-descuento(total))),"\nEn esta compra tu descuento fue","$"+str(int(descuento(total))),"\nGracias por tu compra\n---")