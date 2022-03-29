fun kDatatype(){

    // Signed Integral Type
    println("# Signed Integral Type\n-----------------")
    // val ชื่อตัวแปร: ชนิดข้อมูล = ค่าที่จะเก็บ
    val kByte: Byte = 120 // -128 to 127
    val kShort: Short = 20_000 // -32768 to 32767
    val kInt: Int = 2_147_483_647 // -2147483648 to 2147483647
    val kLong: Long = 9_223_372_036_854_775_807L // -9223372036854775808 to 9223372036854775807
    println(kByte)
    println(kShort)
    println(kInt)
    println(kLong)

    println("\n# Unsigned Integral Type\n---------------------")
    val kUByte: UByte = 255U // 0 to 255
    val kUShort: UShort = 65_535U // 0 to 65535
    val kUInt: UInt = 4_294_967_295U // 0 to 4294967295
    val kULong: ULong = 18_446_744_073_709_551_615UL // 0 to 18446744073709551615

    println("kUByte=$kUByte")
    println("kUShort=$kUShort")
    println("kUInt=$kUInt")
    println("kULong=$kULong")

    println("\n# Floating Point Type\n---------------------")
    val kFloat: Float = 3.4028235E38F // 1.4E-45 to 3.4028235E38
    val kDouble: Double = 1.7976931348623157E308 // 4.9E-324 to 1.7976931348623157E308
    println("kFloat=$kFloat")
    println("kDouble=$kDouble")

    println("\n# Boolean Type\n---------------------")
    val kBoolean1: Boolean = true
    val kBoolean2: Boolean = false
    println("kBoolean1=$kBoolean1")
    println("kBoolean2=$kBoolean2")

    println("\n# String Type\n---------------------")
    val kChar: Char = 'S'
    val kString: String = "Samit Koyom"
    println("kChar=$kChar")
    println("kString=$kString")

    println("\n# Any Type\n---------------------")
    val kAny1: Any = 20
    val kAny2: Any = 100.50
    val kAny3: Any = true
    val kAny4: Any = "John"
    println("kAny1=$kAny1")
    println("kAny2=$kAny2")
    println("kAny3=$kAny3")
    println("kAny4=$kAny4")

}