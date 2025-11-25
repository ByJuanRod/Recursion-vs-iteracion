<h1>Algoritmos Recursivos e Iterativos.</h1>
<p>Este proyecto implementa dos versiones de 3 algoritmos para comparar su funcionamiento en casos recursivos e iterativos: una versión iterativa y una versión recursiva.</p>

<h2>Algoritmo de Suma de Valores en un Arreglo</h2>
<hr>

<h3>Caso Base</h3>
<p> Cuando el índice llega a 0, se retorna directamente el primer elemento del arreglo. Este es el caso más simple que no requiere más llamadas recursivas.</p>

<h3>Caso Recursivo</h3>
Para cualquier índice mayor que 0, la función suma el elemento actual con el resultado de la llamada recursiva para el elemento anterior.
La función avanza hacia el caso base mediante el parámetro <code>elemento-1</code>, que reduce progresivamente el índice hasta llegar a 0.

<h3>Análisis de Complejidad</h3>
<hr>
<h3>Complejidad Temporal</h3>
<ul>
    <li>Algoritmo Iterativo:<code>O(n)</code></li>
    <li>Algoritmo Recursivo:<code>O(n)</code></li>
</ul>

<h3>Complejidad Espacial</h3>
<ul>
    <li>Versión Iterativa: O(1) - usa solo variables locales.</li>
    <li>Versión Recursiva: O(n) - debido a la pila de llamadas recursivas.</li>
</ul>

<h3>Entrada</h3>
<pre><code>
    Entrada: 1 2 3 4 5
    Salida iterativa: 15
    Salida recursiva: 15
</code></pre>

<h2>Algoritmo de Máximo en un Arreglo:</h2>

<h2>Algoritmo de Invertir Cadenas.</h2>
<hr>

<h3>Caso Base</h3>
<p>Cuando la cadena es nula, vacía o tiene un solo carácter, se retorna la cadena tal cual. No se necesitan más operaciones.</p>
<h3>Caso Recursivo</h3>
<p>
<code>str.substring(1)</code> toma todos los caracteres excepto el primero <code>str.charAt(0)</code> toma el primer carácter Se invierte recursivamente el substring y se le agrega el primer carácter al final.
El problema se reduce en cada llamada (Ejemplo utilizando "Hola" como cadena:
</p>
<pre>
    Llamada 1: invertir("hola") → invertir("ola") + "h"
    Llamada 2: invertir("ola") → invertir("la") + "o"
    Llamada 3: invertir("la") → invertir("a") + "l"
    Llamada 4: invertir("a") → "a" (caso base)
</pre>
<p>Resultado final: "a" + "l" + "o" + "h" = "aloh"</p>

<h3>Análisis de Complejidad</h3>
<hr>

<h2>Complejidad Temporal</h2>
<ul>
    <li>Versión Iterativa: <code>O(n)</code> Recorre la cadena una vez en orden inverso.</li>
    <li>Versión Recursiva: <code>O(n²)</code> Se hacen n llamadas recursivas. Cada llamada recursiva usa substring() que es O(n)</li>
</ul>

<h2>Complejidad Espacial</h2>
<ul>
    <li>Versión Iterativa: <code>O(n)</code> para el StringBuilder.</li>
    <li>Versión Recursiva: <code>O(n)</code> pila de llamadas.</li>
</ul>

<h3>Entrada</h3>
<pre><code>
    Cadena original: "hola mundo"
    Cadena invertida (iterativo): "odnum aloh"
    Cadena invertida (recursivo): "odnum aloh"
</code></pre>