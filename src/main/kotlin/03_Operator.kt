fun kOperator() {
    // ตัวอย่าง โอเปอเรเตอร์สำหรับการคำนวณ
    val a = 4 + 2
    val b = 4 - 2
    val c = 4 * 2
    val d = 4 / 2
    val e = 10 % 3 //e = 1 เพราะค่ามากที่สุดที่ไม่เกิน 13 ซึ่ง 3 หารลงตัวคือ 12 ค่าที่เหลือคือ (13 - 12) = 1
    val f = 19 % 5 //f = 4 เพราะค่ามากที่สุดที่ไม่เกิน 19 ซึ่ง 5 หารลงตัวคือ 15 ค่าที่เหลือคือ (19 - 15) = 4
    val g = 100 % 20 //g = 0 เพราะหารลงตัวพอดี

    print("$a\n$b\n$c\n$d\n$e\n$f\n$g\n")

    println("--------------------------")

    // ตัวอย่าง โอเปอเรเตอร์สำหรับการคำนวณและกำหนดค่า
    var h = 10; h += 5 // 15
    var i = 20; i -= 15 // 5
    var j = 30; j *= 2 // 60
    var k = 40; k /= 4 // 10
    var l = 50; l %= 7 // 1

    print("$h\n$i\n$j\n$k\n$l\n")

    println("--------------------------")

    // โอเปอเรเตอร์การเพิ่มและลดค่า
    var x = 10
    x++
    println(x) // 11
    ++x
    println(x) // 12
    x--
    println(x) // 11
    --x
    println(x) // 10

    println("--------------------------")

    var m = 10
    var n = 20
//    m += n++
    m += ++n
    println(m) // 31
    println(n) // 21

    println("--------------------------")

    val d1 = (2 == 1); println(d1) // false
    val d2 = (2 != 1); println(d2)  // true
    val d3 = (2 > 1); println(d3) // true
    val d4 = (2 <= 1); println(d4) // false
    val d5 = "kotlin" == "kotlin"; println(d5) // true
    val d6 = "android" == "Android"; println(d6) // false

    println("--------------------------")

    var status: Boolean
    status = (1 < 2) && (3 < 4); println(status) // (true && true) = true
    status = (1 < 2) && (3 == 4); println(status) // (true && false) = false
    status = (1 > 2) && (3 > 4); println(status) // (false && false) = false
    status = (1 > 2) || (3 > 4); println(status) // (false || false) = false
    status = (1 < 2) || (3 == 4); println(status) // (true || false) = true
    status = (1 < 2) || (3 < 4); println(status) // (true || true) = true
    status = !(1 < 2); println(status) // !true = false
    status = !(1 > 2); println(status) // !false = true
    status = !((1 < 2) || (3 < 4)); println(status) // !(true || false) = !true = false

    println("--------------------------")

    // โอเปอเรเตอร์การกำหนดช่วงข้อมูล (Range Operator)
    for (x1 in 1..10) print("$x1 "); println() // 1 2 3 4 5 6 7 8 9 10
    for (x2 in 0..100 step 2) print("$x2 "); println() // 0 2 4 6 8 ... 100
    for (x3 in 10..20 step 3) print("$x3 "); println() // 10 13 16 19
    for (x4 in 'a'..'f') print("$x4 "); println() // a b c d e f
    for (x5 in 'K'..'Z' step 2) print("$x5 "); println() // K M O Q S U W Y
    for (x6 in 'ก'..'ม' step 2) print("$x6 "); println()

}