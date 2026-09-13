fun main() {
    var dig: Int
    while (true)
    {
        print("Введите натуральное число: ")
        val inp = readln().toIntOrNull()
        if (inp == null)
        {
            println("Необходимо ввести число!")
        }
        else if (inp < 1)
        {
            println("Это не натуральное число!")
        }
        else
        {
            dig = inp
            break
        }
    }
    val bindig = dig.toString(2)
    println("Введенное Вами число в двоичной системе счисления равно $bindig")
}