// Declaramos variables globales para el querySelector de form e inputs
const form = document.querySelector('form');
const input1 = form.querySelector('input:nth-of-type(1)');
const input2 = form.querySelector('input:nth-of-type(2)');
const input3 = form.querySelector('input:nth-of-type(3)');

// Ejercicio 1: Se tienen tres (3) entradas. 
// La primera entrada recibe una cadena de números separados por comas
// La segunda entrada recibe un número que va a ser comparado con cada valor del arreglo de la primera entrada
// La tercera entrada recibe un número que en el caso de que los numeros del primer arreglo sean mayores al
// valor de la segunda entrada se va a reemplazar cada valor del primer arreglo con este valor

// Casos de prueba y funcionamiento:
// Caso 1: Hay uno o más números mayores que el input2
// input1: 1,2,3
// input2: 2
// input3: 3
// salida: 3,3,3

// Caso 2: Ningún número es mayor que el input2
// input1: 1,2,3
// input2: 5
// input3: 3
// salida: 1,2,3
function ejercicio1(){
    event.preventDefault(); // Evita que se reinicie la página al hacer click en el boton

    // input1: Cadena de texto
    // input2: Número a comparar
    // input3: Número de reemplazo
    
    const numbers = input1.value.split(',').map(Number); // Convierte la cadena de texto (input1) en un array de números
    const number2 = Number(input2.value); // Convierte el input2 en un número
    const number3 = Number(input3.value); // Convierte el input3 en un número

    const newNumbers = numbers.map((number) => { // Itera sobre cada elemento del array
        return number > number2 ? number3 : number; // Si el elemento actual es mayor que la segunda entrada, se reemplaza con la tercera entrada
    });

    document.getElementById("res_1").innerHTML = newNumbers.join(","); // Muestra el nuevo array en la página web
}


// Ejercicio 2: Se tiene una (1) entrada
// La entrada recibe una cadena de números separados por comas
// El módulo ejercicio2() evalúa esta cadena y tiene que indicar si todos los números del array (input1) son pares
// si no son pares tiene que indicar que hay números impares y mostrar el último número par
// si no hay ningún número par tiene que indicar que no hay números pares

// Casos de prueba y funcionamiento:
// Caso 1: Todos son pares
// input1: 2,4,6,8,10
// salida: Todos son pares

// Caso 2: Hay un número impar o más de un número impar
// input1: 2,3,4,5,6,8,10,11
// output: El último número par es 10

// Caso 3: No hay ningún número par
// input1: 1,3,5,7,9,11
// salida: No hay pares
function ejercicio2() {
    event.preventDefault();

    // var input = document.querySelector('#valor').value;
    // if (input === '') {
    //     document.getElementById("res_2").innerHTML = "La entrada está vacía";
    //     return;
    // }

    const numbers = input.split(',').map(Number);
    console.log(numbers);

    const allEven = !numbers.some((number) => number % 2 !== 0);
    const lastEvenNumber = numbers.filter((number) => number % 2 === 0).pop();

    const result = allEven ? "Todos son pares" : lastEvenNumber ? `El último número par es ${lastEvenNumber}` : "No hay pares";
    console.log(result);
    document.getElementById("res_2").innerHTML = result;
}

// Ejercicio 3: Se tienen dos (2) entradas
// La primera entrada es un campo de texto que va a recibir un nombre
// La segunda entrada es un campo de texto que va a recibir un apellido
// Esta sección consta de dos (2) botones.
// El primer botón (Array 1) guardará el nombre completo (nombre + apellido) si el apellido tiene más de seis (6) caracteres
// en un arreglo de nombre: array1
// El segundo botón (Array 2) guardará el nombre completo (nombre + apellido) y ordena el arreglo en orden alfabético por apellido
// cada vez que se anexe un nombre completo, esto se va a guardar en un arreglo llamado: array2

// Casos de prueba y funcionamiento:
// Caso 1: El apellido cumple con la condición de entrada para el array1
// input1: Andres
// input2: Gutierrez
// salida: Array 1: Andres Gutierrez

// Caso 2: El apellido no cumple con la condición de entrada para el array1
// input1: Andres
// input2: Guti
// salida: (Ventana emergente) El apellido no pudo ser guardado en el array1 ya que tiene una cantidad de letras inferior o igual a seis (6).
//                             Apellido: Guti
//                             Cantidad de letras: 4

// Caso 3: Ingreso de varios datos en el array2
// input1: Andres
// input2: Gutierrez
// salida: Array 2: Andres Gutierrez
// input1: Jose
// input2: Ramirez
// salida: Array 2: Andres Gutierrez, Jose Ramirez

// Declaración de ambos arrays
let array1 = [];
let array2 = [];

function array_1(){ // Función para almacenar los datos en el array1
    event.preventDefault();

    // input1: Campo de texto para el nombre
    // input2: Campo de texto para el apellido

    const nombre = document.getElementById("nombre").value;
    const apellido = document.getElementById("apellido").value;

    const nombreCompleto = `${nombre} ${apellido}`;

    apellido.length > 6 ? (array1.push(nombreCompleto), document.getElementById("array1").innerHTML = "Array 1: " + array1) : window.alert('El apellido no pudo ser guardado en el array1 ya que tiene una cantidad de letras inferior o igual a seis (6).\nApellido: '+apellido+'\nCantidad de letras: '+apellido.length);
}

function array_2(){ // Función para almacenar los datos en el array2
    event.preventDefault();

    // input1: Campo de texto para el nombre
    // input2: Campo de texto para el apellido

    const nombre = document.getElementById("nombre").value;
    const apellido = document.getElementById("apellido").value;

    const nombreCompleto = `${nombre} ${apellido}`;
    array2.push(nombreCompleto);

    array2.sort((a, b) => {
        const aApellido = a.split(" ")[1];
        const bApellido = b.split(" ")[1];
        return aApellido.localeCompare(bApellido);
    });

    document.getElementById("array2").innerHTML = "Array 2: " + array2;
}

// Ejercicio 4: Se tienen dos (2) entradas.
// La primera entrada recibe una cadena de texto de varias palabras separadas por comas (,)
// La segunda entrada recibe una sola letra
// El modulo ejercicio4() evalua en cuantos registros se encuentra la letra de la segunda entrada y va a 
// extraer del arreglo la primera y ultima palabra que contenga la letra de la segunda entrada

// Casos de prueba y funcionamiento:
// Caso 1: La letra se encuentra en dos o más palabras distintas
// input1: Juan,jose,pepe,Martin
// input2: j
// salida:

function ejercicio4(){
    event.preventDefault();

    // input1: Cadena de texto
    // input2: Letra que se va a buscar

    const strings = document.getElementById("string").value.split(",");
    const letter = document.getElementById("letra").value;

    const filteredStrings = strings.filter((string) => {
        return string.toLowerCase().includes(letter);
    });

    const firstString = filteredStrings[0];
    const lastString = filteredStrings[filteredStrings.length - 1];

    document.getElementById("res_4_primer").innerHTML = `El primer registro que contiene la letra "${letter}" es "${firstString}".`;
    document.getElementById("res_4_ult").innerHTML = `El último registro que contiene la letra "${letter}" es "${lastString}".`;
}