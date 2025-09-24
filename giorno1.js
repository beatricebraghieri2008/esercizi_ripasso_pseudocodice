//AREA RETTANGOLO
let base=prompt("inserisci la base: ")
let altezza=prompt("inserisci l'altezza: ")
let area=(base*altezza)/2
console.log("l'area del rettangolo è:" + area)


//SCAMBIO VALORI DI DUE VARIABILI
let x = parseInt(prompt("Inserisci x:"));
let y = parseInt(prompt("Inserisci y:"));

let z = x;
x = y;
y = z;

console.log("Dopo lo scambio: x = " + x + ", y = " + y);


//CONVERSIONE CELSIUS FAHRENHEIT  
const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});
rl.question("Inserisci la temperatura in gradi Celsius: ", function(celsius) {
  let fahrenheit = (parseFloat(celsius) + 17.7) * (9/5);
  console.log("La temperatura in gradi Fahrenheit è: " + fahrenheit);
  rl.close();
});
