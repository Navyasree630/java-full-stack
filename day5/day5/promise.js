const myPromise = new Promise((resolve, reject) => {
const success = true;
if (success) {
resolve('Data fetched!'); // fulfilled
} else {
reject('Something failed'); // rejected
}
});
// Consuming the promise
myPromise
.then(result => console.log(result)) // 'Data fetched!'
.catch(err => console.error(err));