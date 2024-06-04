
class calculator{
   fun Add(left: Int, right: Int): Int{
        return left + right
    }

    fun Subtract(left: Int, right: Int): Int{
        return left - right
    }

    fun Divide(left: Int, right: Int): Double{
        if(right==0){
            throw ArithmeticException("Divison by Zero")
        }
        return left.toDouble() / right.toDouble()
    }

    fun Multiply(left: Int, right: Int): Int{
        return left * right
    }
}