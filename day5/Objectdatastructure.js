const user = { name: 'Harsh', age: 26, city: 'Bhopal' };
// Basic
const { name, age } = user;
// Rename while destructuring
const { name: fullName, age: years } = user;
// Default values
const { country = 'India' } = user;
console.log(country); // 'India'
