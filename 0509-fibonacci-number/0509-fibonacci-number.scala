object Solution {
    def fib(n: Int): Int = {
        if (n == 0) 0
        else if (n <= 2) 1
        else fib(n - 1) + fib(n - 2)
    }
}