package objectpractice

import java.time.LocalDateTime

/**
 * 싱글톤 static 클래
 */
object DatetimeUtils {
    val now : LocalDateTime
        get() = LocalDateTime.now()

    const val DEFAULT_FORMAT = "YYYY-MM-DD"

    fun same(a: LocalDateTime, b: LocalDateTime): Boolean {
        return a == b
    }
}

fun main() {
    println(DatetimeUtils.now)
    println(DatetimeUtils.now)
    println(DatetimeUtils.now)

    println(DatetimeUtils.DEFAULT_FORMAT)

    val now = LocalDateTime.now()
    println(DatetimeUtils.same(now, now))

    print(MyClass.a)
    print(MyClass.newInstance())
}

/**
 * 동반 객체 활용
 */
class MyClass {
    private constructor()

    companion object {
        val a = 1234

        fun newInstance() = MyClass()
    }
}