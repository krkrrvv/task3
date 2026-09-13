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
    var bindig = ""
    while (dig > 0)
    {
        bindig = (dig % 2).toString() + bindig
        dig /= 2
    }
    println("Введенное Вами число в двоичной системе счисления равно $bindig")
}