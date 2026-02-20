const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();
const n = Number(input);

let memo = { 0: 0n, 1: 1n };

function fib(n) {
    if(n in memo) return memo[n]

    if(n <= 1) return n

    return memo[n] = fib(n-1) + fib(n-2)
}

console.log(fib(n).toString());