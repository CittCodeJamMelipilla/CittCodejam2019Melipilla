>>> # CÓMO PARTICIPAR: PASO A PASO
>>> 
>>> * Escoger el o los ejercicios a resolver
>>> * Escribir la solución en un solo archivo.
>>> * Guardar el código según el formato del lenguaje, sin compilar.
>>> * Comprimir el documento en un archivo .rar o .zip. 
>>> * Colocar la categoría en el asunto del correo.
>>> * Enviar el archivo a citt.codejam@gmail.com .
>>> * Más información en: https://bit.ly/CittCodeJamMelipilla2019 


> Con estos ejercicios, damos comienzo real a esta competencia de programación, esperamos que encuentren los retos interesantes y desafiantes.
> 
> Nuestro principal objetivo es una forma de practicar y disfrutar la programación, con ejercicios más allá de los vistos en el aula de clases. 
>
> Resuelve los desafíos a conciencia, y velos siempre como una forma de auto superarte.
>
> -Eric Ramírez


# Introducción

Hay una guerra, de la cual, nadie se ha enterado, La guerra de alfabetos.

Hay dos grupos de letras hostiles. la tensión entre las letras de izquierda y las de derecha fue demasiado alta y la guerra estalló.

Las letras de izquierda y su poder:
```
 w - 4
 p - 3
 b - 2
 s - 1
```
Las letras de derecha y su poder:
```
 m - 4
 q - 3
 d - 2
 z - 1
```
Las otras letras no tienen poder y son solo víctimas de esta guerra sin cuartel.

# EJERCICIO BÁSICO 2 (Sólo estudiantes de primer año)

Cree un algoritmo que reciba el string `pelea` como input, el cual consistirá solo de letras en minúscula, y que imprima por pantalla quién ganó la pelea.
Cuando las letras de izquierda ganen, imprima `"¡El lado izquierdo gana!"`, cuando las letras de derecha ganen, imprima `¡El lado derecho gana!`, en otro caso imprima `"¡Luchemos de nuevo!"`

### Ejemplos
```python
input = "z"         #=> ¡El lado derecho gana!
input = "zdqmwpbs"  #=> ¡Luchemos de nuevo!
input = "zzzzs"     #=> ¡El lado derecho gana!
input = "wwwwwwz"   #=> ¡El lado izquierdo gana!
```

###### *EN LAS PRIMERAS LÍNEAS DEBE COMENTAR CON SUS DATOS PERSONALES, TALES COMO NOMBRE COMPLETO, CARRERA, SEMESTRE, NÚMERO DE TELÉFONO, CORREO INSTITUCIONAL.*

#### Restricciones
* Solo se permite el lenguaje de programación Python.

Código base para trabajar:
```python
pelea = str(input("Ingrese los ejercitos:))
resultado = "" # Cosas raras
# Más cosas raras.
print(resultado)
```


## Plazo máximo de entrega 13/05/2019 17:00:00. 


<hr>

# EJERCICIO INTERMEDIO 2 (Estudiantes de segundo año en adelante)

Las letras han solicitado Ataques aéreos, ¡Hay puntos y guiones dispersos por doquier en el campo de batalla!

Cree una función que reciba el string `pelea` como parámetro, el cual consistirá solo de letras en minúscula y `*`, que representa donde ha caído una bomba, y que retorne quién ganó la pelea después de que las bombas explotaron.
Cuando las letras de izquierda ganen, retorne `"¡El lado izquierdo gana!"`, cuando las letras de derecha ganen, retorne `¡El lado derecho gana!`, en otro caso retorne `"¡Luchemos de nuevo!"`

Las bombas `*` matan a las letras adyacentes ( ejemplo `aa*aa` => `a___a`, `**aa**` => `______ `);

### Ejemplos
```javascript
guerra_alfabeto("s*zz");          //=> ¡El lado derecho gana!
guerra_alfabeto("*zd*qm*wp*bs*"); //=> ¡Luchemos de nuevo!
guerra_alfabeto("zzzz*s*");       //=> ¡El lado derecho gana!
guerra_alfabeto("www*www****z");  //=> ¡El lado izquierdo gana!
```

###### *EN LAS PRIMERAS LÍNEAS DEBE COMENTAR CON SUS DATOS PERSONALES, TALES COMO NOMBRE COMPLETO, CARRERA, SEMESTRE, NÚMERO DE TELÉFONO, CORREO INSTITUCIONAL.*

#### Restricciones
* Solo se permiten los lenguajes de programación Python, Java, Javascript, C#.

Código base para trabajar:

<details><summary>Python:</summary>
<p>

```python
def guerra_alfabeto(pelea):
    #Su código aquí
```
</p>
</details> 

<details><summary>Java:</summary>
<p>

```Java
public class GuerraAlfabetoAtaqueAere{

  public static String guerraAlfabeto(String pelea){
        return "¡Tengan piedad!";
  }
}
```
</p>
</details> 

<details><summary>Javascript:</summary>
<p>

```Javascript
function guerraAlfabeto(pelea)
{
  return '¡Tengan piedad!';  
}
```
</p>
</details> 

<details><summary>C#:</summary>
<p>

```C#
 public class GuerraAlfabetoAtaqueAere
 {
    public static string GuerraAlfabeto(string pelea)
    {
      return "¡Tengan piedad!";
    }
 }
```
</p>
</details> 


## Plazo máximo de entrega 13/05/2019 17:00:00. 


<hr>

# EJERCICIO AVANZADO 2 (Libre)

Las letras han descubierto una nueva unidad, un sacerdote con el poder del Wololooo.

<img src="https://i.imgur.com/AUaPiip.jpg">
<br><br>

Cree una función que reciba el string `pelea` como parámetro, el cual consistirá solo de letras en minúscula, y que retorne quién ganó la pelea.
Cuando las letras de izquierda ganen, retorne `"¡El lado izquierdo gana!"`, cuando las letras de derecha ganen, retorne `¡El lado derecho gana!`, en otro caso retorne `"¡Luchemos de nuevo!"`

El poder de las nuevas letras:

De la izquierda:
```
t - 0 (pero es un sacerdote con el poder del Wololooo)
```

De la derecha:
```
j - 0 (pero es un sacerdote con el poder del Wololooo)
```

Las letras sacerdote `t` y `j` cambian a las letras adyacentes de hostiles a aliadas, conservando su poder.
```
mtq => wtp
wjs => mjz
```

Las letras con los sacerdotes `t` y `j` adyacentes simultaneamente no son convertidos:
```
tmj => tmj
jzt => jzt
```

Los sacerdotes(`t` y `j`) no convierten a otros sacerdotes ( `jt` => `jt`).

### Ejemplos
```javascript
guerraAlfabeto("z");         //=>  "z"  => ¡El lado derecho gana!
guerraAlfabeto("tz");        //=>  "ts" => ¡El lado izquierdo gana!
guerraAlfabeto("jz");        //=>  "jz" => ¡El lado derecho gana!
guerraAlfabeto("zt");        //=>  "st" => ¡El lado izquierdo gana!
guerraAlfabeto("azt");       //=> "ast" => ¡El lado izquierdo gana!
guerraAlfabeto("tzj");       //=> "tzj" => ¡El lado derecho gana!
```

#### Restricciones
* Solo se permite el lenguaje de programación Javascript.

Código base para trabajar:
```javascript
function guerraAlfabeto(pelea)
{
    return 'Wo lo loooooo';
}
```


## Plazo máximo de entrega 13/05/2019 17:00:00. 

