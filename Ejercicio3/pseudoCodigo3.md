funcion buscarPalindromos(cadena):
lista = []
n = longitud(cadena)

para i desde 0 hasta n-1:
    expandir(cadena, i, i, lista)       // palíndromos impares
    expandir(cadena, i, i+1, lista)     // palíndromos pares

devolver lista


funcion expandir(cadena, izq, der, lista):
mientras izq >= 0 y der < longitud(cadena) y cadena[izq] == cadena[der]:
si (der - izq + 1) >= 3:
agregar subcadena[izq..der] a lista
izq = izq - 1
der = der + 1