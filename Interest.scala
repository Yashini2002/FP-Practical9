object Interest{
    def main(args:Array[String])={
        println("Enter the deposit amount: ")
        val depositVal=scala.io.StdIn.readLine().toDouble

        println(f"The interest is ${calculateInterest(depositVal)}")
    }

    def calculateInterest(deposit:Double):Double={
        val interest:Double={
            if(deposit<=20000) deposit*0.02
            else if(deposit<=200000) deposit*0.04
            else if(deposit<=2000000) deposit*0.035
            else deposit*0.065
        }
        return interest
    }
}