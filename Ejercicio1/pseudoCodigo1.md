Funcion sufijoComunMasLargo(cadena1, cadena2):
n1 = longitud(cadena1)
n2 = longitud(cadena2)
i = n1 - 1
j = n2 - 1
sufijo = ""

mientras i >= 0 y j >= 0 y cadena1[i] == cadena2[j]:
    sufijo = cadena1[i] + sufijo
    i = i - 1
    j = j - 1

devolver sufijo