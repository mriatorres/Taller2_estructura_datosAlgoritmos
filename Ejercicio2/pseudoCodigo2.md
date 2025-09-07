funcion frecuenciaDePares(cadena):
mapa = diccionario vacío
n = longitud(cadena)

para i desde 0 hasta n-2:
    par = cadena[i] + cadena[i+1]
    si par existe en mapa:
        mapa[par] = mapa[par] + 1
    si no:
        mapa[par] = 1
