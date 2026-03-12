// A function that accepts a callback
function greetUser(name, callback) {
const message = `Hello, ${name}!`;
callback(message);
}
// Passing a function as an argument
greetUser('Navya', function(msg) {
console.log(msg); 
});