// Traditional function
function add(a, b) {
  return a + b;
}

// Arrow function – same thing
const addArrow = (a, b) => a + b;

// Single parameter – no parentheses needed
const double = n => n * 2;

// No parameters
const greet = () => console.log('Hello!');

// Function calls
console.log(add(2, 3));        // 5
console.log(addArrow(2, 3));   // 5
console.log(double(4));        // 8
greet();                       // Hello!