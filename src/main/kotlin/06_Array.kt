import kotlin.math.*
import kotlin.random.*
import java.text.NumberFormat //ใช้คลาสของ Java
import java.text.DecimalFormat //ใช้คลาสของ Java

fun kArray() {
    // ตัวอย่างการใช้ Pair
    val size = Pair(50, 100)
    val width = size.first
    val height = size.second
    println(width)
    println(height)

    println("-----------------")

    val name = Pair("James", "Bond")
    val msg = "Hi ${name.first} ${name.second}" //Hi James Bond
    println(msg)

    println("-----------------")

    val error = Pair(404, "Not Found")
    println("Error: ${error.first} - ${error.second}")  //Error 404 - Not Found

    println("-----------------")

    val (latitude, longitude) = Pair(80.1234, 100.5678)
    println(latitude)
    println(longitude)

    println("-----------------")

    val (firstname, lastname) = Pair("James", "Bond")
    println("Hi $firstname $lastname")

    println("-----------------")

    // ตัวอย่างการเก็บข้อมูลในแบบ Triple
    val boxSize = Triple(10, 20, 30)
    val volume = boxSize.first * boxSize.second * boxSize.third
    println(volume)
    val (date, month, year) = Triple(1, "มกราคม", 2565)
    println("วันนี้ตรงกับ $date $month $year")

    println("-----------------")

    val (hour, minute, _) = Triple(12, 30, 0)
    println("ขณะนี้เวลา $hour:$minute")

    println("-----------------")

    // การสร้างอาร์เรย์แบบไม่ระบุชนิดข้อมูล
    val oddNumbers = arrayOf(1, 3, 5, 7, 9)
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
    val data = arrayOf(1, true, "three") //อาจเก็บข้อมูลต่างชนิดกันก็ได้
    // val emptyArray = arrayOf()  //Error ต้องกำหนดสมาชิกเริ่มแรกเสมอ

    println(oddNumbers[2])

    // การสร้างอาร์เรย์ของชนิดข้อมูลพื้นฐาน
    // ใช้คลาส XxxArray เมื่อ Xxx คือชนิดข้อมูลพื้นฐาน เช่น ByteAray, IntArray, LongArray,
    //UIntArray, UShortArray, DoubleArray, CharArray
    val oddNums: IntArray = IntArray(3) //3 คือจำนวนสมาชิกของอาร์เรย์
    oddNums[0] = 100 //กำหนดค่าให้กับสมาชิก
    oddNums[1] = 200
    // oddNums[2] = 3.5 //Error สมาชิกต้องเป็นชนิด Int ตามชื่อคลาสเท่านั้น
    // oddNums[3] = 4 //Error จำนวนสมาชิกมีได้เพียง 3 ตัว
    println(oddNums[1])

    println("-----------------")
    // การเข้าถึงสมาชิกของอาร์เรย์ด้วยลูป for-in
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var sum = 0
    for (n in nums) {
        print(n)
        sum += n //เข้าถึงสมาชิกทุกตัว
    }
    println()
    println(sum) //45

    println("-----------------")

    // การเข้าถึงสมาชิกของอาร์เรย์ด้วยลูป forEach()
    val cars = arrayOf("Benz", "BMW", "Jaguar", "Ford")
    cars.forEach {
        println(it) //it คือตัวแปรที่ถูกสร้างขึ้นโดยอัตโนมัติ เพื่อใช้อ้างถึงสมาชิกในแต่ละลูป
    }

    println("-----------------")

    // ตัวอย่างการใช้ เมธอดที่น่าสนใจของอาร์เรย์
    val numbers = intArrayOf(7, 11, 1009, 108, 101)
    val len = numbers.count() //หรือ numbers.size
    println(len)
    if (!numbers.contains(99)) {
        println("Error")
    }
    // val str = numbers.joinToString(" - ")
    // println(str) //7 - 11 - 1009 - 108 - 101

    println("-----------------")

    // ฟังก์ชันสำหรับการคำนวณ
    val radius = 10.0
    val circleArea = PI * radius.pow(2)
    println(circleArea)

    println("-----------------")

    // ตัวอย่างการสร้างเลขสุ่ม
    val a = Random.nextInt() //เช่น 2013835617
    val b = Random.nextInt(1000) //ได้เลขที่มีค่าน้อยกว่า 1000
    val c = Random.nextInt(100, 1000) //ได้เลขที่มีค่าระหว่าง 100 - 999
    val d = Random.nextDouble() //เช่น 0.387504244
    val bool = Random.nextBoolean() //จะได้ true หรือ false
    println(a)
    println(b)
    println(c)
    println(d)
    println(bool)

    println("-----------------")

    // ตัวอย่างการใช้ NumberFormat
    var numFormat = NumberFormat.getInstance()
    var strf = numFormat.format(1234567.89)
    println(strf) //1,234,567.89
    numFormat = NumberFormat.getCurrencyInstance()
    strf = numFormat.format(2596530)
    println(strf) //THB2,596,530.00 (ขึ้นกับการตั้งค่าในระบบปฏิบัติการ)

    println("-----------------")

    // ตัวอย่างการใช้ DecimalFormat
    val pattern = "#,#"
    var decimalFormat = DecimalFormat()
    var str = decimalFormat.format(1234567)
    println(str)  //1,234,567
    decimalFormat.applyPattern("00000")
    str = decimalFormat.format(123)
    println(str) //00123
    decimalFormat.applyPattern("#.##%")
    str = decimalFormat.format(0.086)
    println(str) //8.6%
    decimalFormat.applyPattern("00.00")
    str = decimalFormat.format(1.2)
    println(str) //01.20
}