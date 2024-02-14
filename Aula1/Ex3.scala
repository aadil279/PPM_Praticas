object Ex3 {
    /* Define a method that calculates the result (Int) of the following exponentiation x^y
    without resorting to predefined functions. */
    def fun_a(x:Int, y:Int):Int = if(y==0) 1 else x * fun_a(x, y-1)

    /* Define a method that receives a Int List and constructs a pair with the first and the last
    element of the list. */
    def fun_b(list: List[Int]): (Int, Int) = (list(0), list(list.length - 1))

    /* Define a method that, given a Int list, gives the pair with that list and its length. */
    def fun_c(list: List[Int]): (List[Int], Int) = (list, list.length)

    /* Define a method that, given a Double list, calculates its average. */
    def fun_d(list: List[Double]): Double = if(list.length == 1) list(0) else (list(0) + ((list.length-1) * fun_d(list.tail)))/list.length

    //ITERATIVE VERSION OF fun_d
    def fun_d_i(list:List[Double]): Double = {
        var sum: Double = 0.0
        var i = 0
        for(i <- 0 to list.length-1) {
            sum = sum + list(i)
        }
        sum/list.length
    }
}
