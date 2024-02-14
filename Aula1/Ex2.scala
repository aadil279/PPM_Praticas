object Ex2 {
    /*  Define a method that receives two pairs of integers and returns a pair of integers. The
    first element of the result being the sum of the first input pair, and the second element
    of the result pair the product of the second input pair. */
    def fun_a(x:(Int, Int), y:(Int, Int)) = ((x._1+x._2), (y._1*y._2))

    /*  Write a method that, given three Int numbers, returns a pair containing the largest
    element in the first element, and the second largest number in the second element. */
    def fun_b(x: Int, y: Int, z: Int): (Int, Int) = {
        if (x >= y && y >= z) {
            (x, y)
        } else if (x >= z && z >= y) {
            (x, z)
        } else if (y >= x && x >= z) {
            (y, x)
        } else if (y >= z && z >= x) {
            (y, z)
        } else if (z >= x && x >= y) {
            (z, x)
        } else {
            (z, y) // Default case when none of the conditions match
        }
    }

    /*  Write a method that receives a triple of Int numbers and returns a triple where the same
    numbers are ordered in descending order. */
    def fun_C(x: (Int, Int, Int)): (Int, Int, Int) = {
        var (a,b) = fun_b(x._1,x._2,x._3)
        var c: Int = 0
        if(x._1 != a && x._1 != b) {
            c = x._1
        } else if (x._2 != a && x._2 != b) {
            c = x._2
        } else {
            c = x._3
        }
        (a,b,c)
    }

}