funcion distanciaEdicion(cadena1, cadena2):
contador = 0
n = longitud(cadena1)

para i desde 0 hasta n-1:
    si cadena1[i] != cadena2[i]:
        contador = contador + 1

devolver contador
