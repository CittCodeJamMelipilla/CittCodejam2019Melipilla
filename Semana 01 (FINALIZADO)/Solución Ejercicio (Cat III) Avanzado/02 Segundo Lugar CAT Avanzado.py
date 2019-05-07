# Nombre: Benjamin Santa Cruz
# Carrera: Ingeniería en informática
# Semestre: 5°
# Número de teléfono: +56988508231
# correo duoc: b.santacruz@alumnos.duoc.cl
# correo per: bnja12@gmail.com

import string

Frase = ["\u0048", "\u004F", "\u004C", "\u0041", "\u0020",
         string.printable[22], "\u0055", "\u004E", "\u0044", "\u004F"]
if Frase[0] in string.printable:
    Letras = Frase[0]
    print("\u0048")
if Frase[1] in string.printable:
    Letras = Letras + Frase[1]
    print("\u004F")
if Frase[2] in string.printable:
    Letras = Letras + Frase[2]
    print("\u004C")
if Frase[3] in string.printable:
    Letras = Letras + Frase[3]
    print("\u0041")
if Frase[4] in string.printable:
    Letras = Letras + Frase[4]
    print("\u0020")
if Frase[5] in string.printable:
    Letras = Letras + Frase[5]
    print(string.printable[22])
if Frase[6] in string.printable:
    Letras = Letras + Frase[6]
    print("\u0055")
if Frase[7] in string.printable:
    Letras = Letras + Frase[7]
    print("\u004E")
if Frase[8] in string.printable:
    Letras = Letras + Frase[8]
    print("\u0044")
if Frase[9] in string.printable:
    Letras = Letras + Frase[9]
    print("\u004F")
