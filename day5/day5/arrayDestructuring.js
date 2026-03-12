const colors = ['red', 'green', 'blue'];

// Without destructuring
// const first = colors[0];
// const second = colors[1];

// With destructuring
const [first, second, third] = colors;
console.log(first); // 'red'
// Skip elements
const [, , blue] = colors;
// Default values
const [a = 0, b = 0, c = 0, d = 0] = [10, 20];
console.log(d); // 0 (default used)