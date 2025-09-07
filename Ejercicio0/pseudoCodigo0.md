funcion contarSubcadenas(cadena, patron):
contador = 0
n = longitud(cadena)
k = longitud(patron)

para i desde 0 hasta n-k:
    si cadena[i..i+k-1] == patron:
        contador = contador + 1

devolver contador