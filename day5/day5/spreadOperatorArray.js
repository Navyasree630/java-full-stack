const a = [1, 2, 3];
const b = [4, 5, 6];
// Combine arrays
const combined = [...a, ...b];
console.log(combined); // [1, 2, 3, 4, 5, 6]
// Copy array (shallow)
const copy = [...a];
copy.push(99);
console.log(a); // [1, 2, 3] — original untouched
