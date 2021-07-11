nom_producto = str(input())
costo_unitario = int(input())
pvp = int(input())
unidades_disponibles = int(input())

print("Producto: " + nom_producto + "\n CU: $" , costo_unitario , "\n PVP: $", pvp , 
      "\n Unidades disponibles: " , unidades_disponibles, "\n Ganancia: $", (pvp-costo_unitario)*unidades_disponibles)