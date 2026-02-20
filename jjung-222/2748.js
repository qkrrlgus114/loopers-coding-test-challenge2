const fs = require('fs');

function solve() {
    const input = fs.readFileSync(0, 'utf8').trim();
    const N = parseInt(input);

    if (N === 0) return console.log(0);
    if (N === 1) return console.log(1);

    const fibo = new BigInt64Array(N + 1);
    fibo[0] = 0n;
    fibo[1] = 1n;

    for (let i = 2; i <= N; i++) {
        fibo[i] = fibo[i - 1] + fibo[i - 2];
    }

    console.log(fibo[N].toString());
}

solve();