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
    def fun_c(x: (Int, Int, Int)): (Int, Int, Int) = {
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

    /*The sides of any triangle respect the following constraint: the sum of the lengths of any
    two sides, is greater than the length of the third side. Write a method that receive the
    length of three segments and return a Boolean value indicating whether the constraint
    is satisfied. */
    def fun_d(a:Int, b:Int, c:Int): Boolean = {
        if(a > b+c || b>a+c || c>a+b) {
            false
        } else {
            true
        }
    }

    /* Write a method abrev that receives a string containing a person's name and returns a
    string with the first and last name.
    For example, abrev "José Carlos Martins Sousa" = "José Sousa" */
    def fun_e(name:String): String = {
        val names_array = name.split(" ")
        val final_string = names_array(0) + " " + names_array(names_array.length - 1)
        final_string
    }
}