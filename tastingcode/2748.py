memo = [-1] * (90 + 1)
memo[0] = 0
memo[1] = 1

n = int(input())
def f(n):
    if memo[n] != -1:
        return memo[n]

    if memo[n] == -1:
        memo[n] = f(n - 2) + f(n - 1)

    return f(n - 2) + f(n - 1)

print(f(n))