async function greet() {
return 'Hello!';
}
// Same as:
function greet() {
return Promise.resolve('Hello!');
}
// Both are consumed the same way:
greet().then(msg => console.log(msg)); // 'Hello!'
