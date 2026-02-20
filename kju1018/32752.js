const input = require("fs")
  .readFileSync("/dev/stdin", "utf8")
  .toString()
  .trim()
  .split("\n");

const [N, L, R] = input[0].split(" ").map(Number);
const A = input[1].split(" ").map(Number);

const sortA = [...A].sort((a, b) => a - b);

const sliceA = A.slice(L - 1, R).sort((a, b) => a - b);

for (let i = 0; i < sliceA.length; i++) {
  A[L - 1 + i] = sliceA[i];
}

const isSame = A.every((val, i) => val === sortA[i]);
console.log(isSame ? 1 : 0);
